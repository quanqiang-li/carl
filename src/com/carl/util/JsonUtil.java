package com.carl.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.carl.jackson.databind.Country;
import com.carl.jackson.databind.Province;
import com.carl.user.model.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil<T> {

	public <T> T json2Object(String json,Class<T> valueType) throws JsonParseException, JsonMappingException, IOException{

		//ObjectMapper类用序列化与反序列化映射器
		ObjectMapper mapper = new ObjectMapper();
		//当反序列化json时，未知属性会引起的反序列化被打断，这里我们禁用未知属性打断反序列化功能，
		//例如json里有10个属性，而我们的bean中只定义了2个属性，其它8个属性将被忽略，开关此设置看看区别
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
		//从json映射到java对象，得到country对象后就可以遍历查找,下面遍历部分内容，能说明问题就可以了
		return mapper.readValue(json, valueType);
	
	}
	public static void main(String[] args) {
		JsonUtil util = new JsonUtil<User>();
	}
}
