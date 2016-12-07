package com.carl.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果名称注解
 * @author aisino
 *
 */
@Target(ElementType.FIELD) //目标，用在什么位置
@Retention(RetentionPolicy.RUNTIME) //保留 用在什么时候
@Documented //文档 可以用javadoc生成文档
public @interface FruitName {

	String value() default "";
}
