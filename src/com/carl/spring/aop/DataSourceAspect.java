package com.carl.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.carl.spring.common.datasource.DataSourceConstant;
import com.carl.spring.common.datasource.DataSourceContextHolder;


@Aspect
@Component
@Order(1)
public class DataSourceAspect {

    /**
     * 登录 搜索日志 认证管理 暂时未做
     * 这里是统一切换数据源的应用，使用了aop
     * 因为没有配置数据，这里把那一段业务代码注释了
     */
    @Before("execution(* com.carl.financial.*hive.controller.*.*(..))")
    public void changeDataSource(JoinPoint joinPoint) {
        System.out.println("before service");
        System.out.println(joinPoint.getSignature().getName());
        //DataSourceContextHolder.setDataSourceType(DataSourceConstant.IMPALA_DS);
    }
    
    @After("execution(* com.carl.financial.*hive.controller.*.*(..))")
    public void resetDataSource(JoinPoint joinPoint) {
        System.out.println("after service");
        //DataSourceContextHolder.setDataSourceType(DataSourceConstant.F_DS);
    }
}
