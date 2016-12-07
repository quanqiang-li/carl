package com.carl.annotation;

import org.junit.Test;

public class TestAnnotation {

	@Test
	public void testFruit(){
		FruitInfoUtil.getFruitInfo(Apple.class);
	}
}
