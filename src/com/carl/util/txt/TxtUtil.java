package com.carl.util.txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TxtUtil {

	/**
	 * 按编码格式读取指定文件的文本内容，有换行格式
	 * @param filePath 指定文件路径
	 * @param encoding 编码格式
	 * @return 文本内容
	 */
	public static String readTxtFile(String filePath, String encoding) {
		StringBuffer sb = new StringBuffer();
		InputStreamReader read = null;
		BufferedReader bufferedReader = null;
		try {
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				read = new InputStreamReader(
						new FileInputStream(file), encoding);// 考虑到编码格式
				bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					sb.append(lineTxt).append("\r\n");
				}
			} else {
				sb.append("找不到指定的文件");
			}
		} catch (Exception e) {
			sb.append("读取文件内容出错");
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();

	}

	/**
	 * 文本内容写入指定文件
	 * @param content 文本内容
	 * @param fileName 指定要写入的文件，目录必须存在，文件不存在自动创建，若存在则覆盖
	 * @param encoding 编码格式
	 */
	public static void writeTxtFile(String content, String fileName,String encoding) {
		FileOutputStream out = null;
		try {
			// 指定文件名
			File aFile = new File(fileName);
			// 建立输出流
			out = new FileOutputStream(aFile);
			byte[] b = new byte[1024];
			// 进行String到byte[]的转化
			b = content.getBytes(encoding);
			// 写入文本内容
			out.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	
	public static void main(String argv[]) {

		String readTxtFile = readTxtFile("D:\\projects\\税银接口-光大银行\\原始数据\\95\\34010207870610X.txt", "utf-8");
		writeTxtFile(readTxtFile, "D:\\34010207870610X.txt", "utf-8");
		
	}

}
