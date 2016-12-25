package com.carl.util;

import java.net.InetAddress;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.junit.Test;

public class SystemUtils {
	
	Logger log = Logger.getLogger(SystemUtils.class);

	/**
	 * 遍历java property
	 */
	@Test
	public void itratorProperties(){
		Properties properties = System.getProperties();
		properties.list(System.out);
	}
	/**
	 * 获取当前机器登录用户名称
	 * @return
	 */
	public String getUsername(){
		return System.getProperty("user.name", "unknown");
	}
	/**
	 * 获取当前机器的设备名称和ip
	 * @return hostName/ip
	 */
	public String getLocalAddress(){
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			return localHost.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Test
	public void test(){
		log.info(getUsername());
		log.info(getLocalAddress());
	}
}
