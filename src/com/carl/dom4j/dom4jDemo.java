package com.carl.dom4j;

import java.net.MalformedURLException;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class dom4jDemo {

	// Parsing XML
	@Test
	public void parse() throws DocumentException, Exception {
		URL url = new URL("http://www.springframework.org/schema/beans/spring-beans-4.3.xsd");
		SAXReader reader = new SAXReader();
		// Document document = reader.read(url);
		Document document = reader.read("src/com/carl/dom4j/book.xml");
		System.out.println(document.asXML());
	}
}
