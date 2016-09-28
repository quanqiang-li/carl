package com.carl.spring.data;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebRoot/WEB-INF/applicationContext.xml" })
public class HBaseDaoTest {

	@Autowired
	private IHBaseDao hbaseDao;
	
	@Test
	public void getTest(){
		String tableName = "zxpt_fxjg:zxpt_qyxx_mc";//企业名称对应的ixinnuo编码
		String rowName = "马鞍山市麦积商贸有限公司";
		Map<String, Object> map = hbaseDao.get(tableName, rowName);
		Set<Entry<String, Object>> entrySet = map.entrySet();
		Iterator<Entry<String, Object>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<String, Object> next = iterator.next();
			System.out.println(next.getKey() + ":" + next.getValue());
		}
		String rowKey = (String) map.get("mc_key");
		String tableName2 = "zxpt_fxjg:zxpt_qyxx_aisino";//ixinnuo编码对应的基本信息
		String rowName2 = rowKey;
		Map<String, Object> map2 = hbaseDao.get(tableName2, rowName2);
		Set<Entry<String, Object>> entrySet2 = map2.entrySet();
		Iterator<Entry<String, Object>> iterator2 = entrySet2.iterator();
		while(iterator2.hasNext()){
			Entry<String, Object> next = iterator2.next();
			System.out.println(next.getKey() + ":" + next.getValue());
		}
		
		
		
		
		
	}
}
