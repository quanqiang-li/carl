package com.carl.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	private  Properties props = null;

	/**
	 * 构造工具类
	 * @param filePath
	 */
	public PropertiesUtil(String filePath) {
		if (props == null) {
			loadFile(filePath);
		}
	}

	/**
	 * 加载配置文件，src下的properties
	 * @param filePath
	 */
	private void loadFile(String filePath) {
		if (null == filePath) {
			return ;
		}
		props = new Properties();
		InputStream inputStream = this.getClass().getClassLoader()
				.getResourceAsStream(filePath);
		try {
			props.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getValue(String option) {
		return props == null ? null : props.getProperty(option);
	}
	
	public static void main(String[] args) {
		PropertiesUtil util = new PropertiesUtil("dataSource.properties");
		System.out.println(util.getValue("jdbc.f_url"));
		System.out.println(util.getValue("china"));
	}
	
}
