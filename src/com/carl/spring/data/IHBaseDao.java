package com.carl.spring.data;

import java.util.List;
import java.util.Map;

public interface IHBaseDao {

    /**
     * 通过表名和key获取一行数据
     * 
     * @param tableName
     * @param rowName
     * @return
     */
    Map<String, Object> get(String tableName, String rowName);

    /**
     * 通过表名 key 和 列族 和列 获取一个数据
     * 
     * @param tableName
     * @param rowName
     * @param familyName
     * @param qualifier
     * @return
     */
    String get(String tableName, String rowName, String familyName, String qualifier);

    /**
     * 通过表名，开始行键和结束行键获取数据
     * 
     * @param tableName
     * @param startRow
     * @param stopRow
     * @return
     */
    List<Map<String, Object>> find(String tableName, String startRow, String stopRow, List<String> qualifierList);

    /**
     * 通过表名，开始行键和结束行键，正则表达式获取数据
     * 
     * @param tableName
     * @param startRow
     * @param stopRow
     * @param qualifierList
     * @param regex
     * @return
     */
    public List<Map<String, Object>> find(String tableName, String startRow, String stopRow,
            List<String> qualifierList, String regex);
}
