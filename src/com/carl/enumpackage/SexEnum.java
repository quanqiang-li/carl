package com.carl.enumpackage;

/**
 * 性别枚举
 * 
 * @author leo
 */
public enum SexEnum {

    /**
     * 先生
     */
    MR("MR", "先生"),

    /**
     * 女士
     */
    MS("MS", "女士");

    // 成员变量
    private final String key;

    private final String value;

    SexEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
    
    public static void main(String[] args) {
    	System.out.println(SexEnum.MR.getKey());
    	System.out.println(SexEnum.MR.getValue());
    	SexEnum valueOf = SexEnum.valueOf("MS");
    	System.out.println(valueOf.getValue());
	}
}
