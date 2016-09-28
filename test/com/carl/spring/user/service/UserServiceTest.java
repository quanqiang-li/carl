package com.carl.spring.user.service;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.carl.spring.common.datasource.DataSourceConstant;
import com.carl.spring.common.datasource.DataSourceContextHolder;
import com.carl.user.model.User;
import com.carl.user.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebRoot/WEB-INF/applicationContext.xml" })  //两种加载资源方式
//@ContextConfiguration(locations = { "classpath:applicationContext.xml" })//src下的配置文件可以这么找
@Transactional
//@TransactionConfiguration(transactionManager = "txManager",defaultRollback = false) //可以省略
public class UserServiceTest {

	@Autowired
	private IUserService userServie;
	
	//在测试之前要执行的方法，可以做一些初始化，切换数据源等
	@BeforeClass
	public static void before(){
		DataSourceContextHolder.setDataSourceType(DataSourceConstant.SJCJ_DS);
	}
	
	@Test
	public void selectTest(){
		User record = new User();
		record.setUserId("066CAC253B104D2BA5321F4A05FB5698");
		List<User> user = userServie.select(record);
		User serlectUser = user.get(0);
		System.out.println(serlectUser.getLoginName());
	}
	
	@Test
	//@Rollback //回滚
	@Commit //提交
	public void updateUserTest(){
		User record = new User();
		record.setUserId("066CAC253B104D2BA5321F4A05FB5698");
		List<User> user = userServie.select(record);
		User serlectUser = user.get(0);
		System.out.println(serlectUser.getLoginName());
		serlectUser.setLoginName(serlectUser.getLoginName() + "carl");
		userServie.updateUser(serlectUser);
	}
}
