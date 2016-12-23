package com.carl.encrypt;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;

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
	 * 
	 * @param plainText
	 *            要进行加密的文本
	 * @param charset
	 *            底层字节编码格式
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
	 * 
	 * @param plainText
	 *            要进行加密的文本
	 * @param charset
	 *            底层字节编码格式
	 * @return 十六进制字符串形式的MD5摘要，长度32位
	 */
	public static String textToMD5U32(String plainText, String charset) {
		if (StringUtils.isBlank(plainText)) {
			return null;
		}
		String result = textToMD5L32(plainText, charset);
		return result.toUpperCase();
	}

	/**
	 * md5 加盐 每次保存密码到数据库时，都生成一个随机4位码(截取uuid的前4位)，将这4位数字和密码相加再求MD5摘要，
	 * 然后在摘要中再将这4位数字按规则掺入形成一个36位的字符串。在验证密码时再从36位字符串中按规则提取4位数字，和用户输入的密码相加再MD5。
	 * 按照这种方法形成的结果肯定是不可直接反查的，且同一个密码每次保存时形成的摘要也都是不同的。 
	 * 中国  md5:C13DCEABCB143ACD6C9298265D618A9F  
	 * salt:ada9
	 * 中国ada9 md5:1410D5082BAF798AC7363B076EDCDF43
	 * 加盐的md5结果插入盐:起始位0，第5，11，18，26位分别顺序插入4位盐值的一位
	 *             1410DA5082BADF798AC7A363B076E9DCDF43
	 * 
	 * @param password
	 */
	public static String textToMD5U36WithSalt(String password, String charset) {
		String salt = UUID.randomUUID().toString().substring(0, 4);
		log.info("salt:" + salt);
		password = textToMD5L32(password + salt, charset);
		log.info("加salt后md5:" + password.toUpperCase());
		password.substring(0, 8);
		StringBuffer sb = new StringBuffer();
		sb.append(password.substring(0, 5)).append(salt.charAt(0))
		.append(password.substring(5, 11)).append(salt.charAt(1))
		.append(password.substring(11, 18)).append(salt.charAt(2))
		.append(password.substring(18, 26)).append(salt.charAt(3)).append(password.substring(26));
		return sb.toString().toUpperCase();
	}

	public boolean checkMd5Salt(String password,String md5code){
		
		return true;
	}
	
	
	@Test
	public void testMd5encrypt() {
		try {
			log.info(textToMD5L32("中国", "UTF-8"));
			log.info(textToMD5U32("中国ada9", "UTF-8"));
			log.info(textToMD5U36WithSalt("中国", "UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
