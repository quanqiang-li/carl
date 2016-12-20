package com.carl.encrypt;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Message Digest Algorithm MD5（中文名为消息摘要算法第五版）<br>
 * MD5算法具有以下特点：<br>
 * 1、压缩性：任意长度的数据，算出的MD5值长度都是固定的。<br>
 * 2、容易计算：从原数据计算出MD5值很容易。<br>
 * 3、抗修改性：对原数据进行任何改动，哪怕只修改1个字节，所得到的MD5值都有很大区别。<br>
 * 4、强抗碰撞：已知原数据和其MD5值，想找到一个具有相同MD5值的数据（即伪造数据）是非常困难的。<br>
 * MD5的作用是让大容量信息在用数字签名软件签署私人密钥前被"压缩"成一种保密的格式（就是把一个任意长度的字节串变换成一定长的十六进制数字串）。<br>
 * 
 * @author aisino
 *
 */
public class MD5 {

	private static Logger log = Logger.getLogger(MD5.class);

	/**
	 * 对文本进行32位小写MD5加密
	 * @param plainText 要进行加密的文本
	 * @param charset 底层字节编码格式
	 * @return 十六进制字符串形式的MD5摘要，长度32位
	 */
	public static String textToMD5L32(String plainText, String charset) {
		String result = null;
		// 首先判断是否为空
		if (StringUtils.isBlank(plainText)) {
			return null;
		}
		try {
			// 首先进行实例化和初始化
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 得到一个指定的字节编码格式的字节数组
			byte[] btInput = plainText.getBytes(charset);
			// 对得到的字节数组进行处理
			md.update(btInput);
			// 进行哈希计算并返回结果
			byte[] btResult = md.digest();
			// 进行哈希计算后得到的数据的长度
			StringBuffer sb = new StringBuffer();
			for (byte b : btResult) {
				int bt = b & 0xff;// 解决负数字节强转int时补码问题
				if (bt < 16) {
					sb.append(0);// 16进制高位补0，保证每一个字节占2位
				}
				sb.append(Integer.toHexString(bt));
			}
			result = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 对文本进行32位大写MD5加密
	 * @param plainText 要进行加密的文本
	 * @param charset 底层字节编码格式
	 * @return 十六进制字符串形式的MD5摘要，长度32位
	 */
	public static String textToMD5U32(String plainText, String charset) {
		if (StringUtils.isBlank(plainText)) {
			return null;
		}
		String result = textToMD5L32(plainText, charset);
		return result.toUpperCase();
	}

	@Test
	public void testMd5encrypt() {
		try {
			System.out.println(textToMD5L32("中国", "UTF-8"));
			System.out.println(textToMD5U32("中国", "UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
