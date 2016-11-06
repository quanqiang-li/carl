package com.carl.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

public class ImageServlet extends HttpServlet {

	private static final int x = 0;
	private static final int y = 0;
	private static final int width = 200;
	private static final int height = 50;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * 输出图片 第一，在内存构造图片对象 第二，设置图片内容 第三，输出图片到浏览器
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 在内存构建图片对象
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		// 得到图像的算法，可以操作上面内容
		Graphics graphics = image.getGraphics();
		// 设置背景色
		setBackgroud(graphics);
		// 画边框
		drawBoder(graphics);
		// 设置随机内容
		setRandomContent((Graphics2D) graphics);
		// 随机画干扰线
		drawRandomLine(graphics);
		// 输出到浏览器，设置浏览器不要缓存，保证每次都是新的
		response.setDateHeader("expries", -1);
		response.setHeader("Cache-control", "no-cache");
		response.setHeader("Pragma", "no-cache");
		response.setContentType("image/jpeg");
		ImageIO.write(image, "jpg", response.getOutputStream());

	}

	public void setRandomContent(Graphics2D graphics) {
		graphics.setColor(Color.RED);
		graphics.setFont(new Font("宋体", Font.BOLD, 30));
		// 中文区间[\u4e00,\u9fa5]
		String commonStr = "一二三四五六七你我他中国北京天安门";//也可以随机Unicode码
		//随机写4个字
		int x = 10;
		for (int i = 0; i < 4; i++) {
			String str = commonStr.charAt(new Random().nextInt(commonStr.length())) + "";
			int degree = new Random().nextInt() % 30;//旋转角度正负30度
			graphics.rotate(degree*Math.PI/180, x, 40);//xy坐标，表示字的左下角起点
			graphics.drawString(str, x, 40);//xy坐标，表示字的左下角起点
			graphics.rotate(-degree*Math.PI/180, x, 40);//需要再转回去，不然后面会基于上面的结果叠加旋转
			x = x + 30;
		}
	}

	private void drawRandomLine(Graphics graphics) {
		graphics.setColor(Color.GREEN);
		// 画5条随机线，起点终点不定
		for (int i = 0; i < 5; i++) {
			int x1 = new Random().nextInt(width);
			int y1 = new Random().nextInt(height);
			int x2 = new Random().nextInt(width);
			int y2 = new Random().nextInt(height);
			graphics.drawLine(x1, y1, x2, y2);
		}

	}

	private void drawBoder(Graphics graphics) {
		graphics.setColor(Color.RED);
		graphics.drawRect(0, 0, width - 1, height - 1);// 划线框，注意线是有宽度的
		// graphics.drawRect(1, 1, width-2, height-2);

	}

	private void setBackgroud(Graphics graphics) {
		graphics.setColor(Color.BLUE);
		graphics.fillRect(x, y, width, height);// 矩形，填充整个背景，xy是内存中图片的起点，跟浏览器显示位置没有关系

	}

	@Test
	public void testUnicode() {
		//java在内存中采用的都是Unicode码存储中文
		// 中文区间[\u4e00,\u9fa5]==[一，龥]
		char a = '\u9fa5';
		System.out.println(a);
	}

}
