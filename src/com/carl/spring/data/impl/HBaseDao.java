package com.carl.spring.data.impl;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.filter.BinaryPrefixComparator;
import org.apache.hadoop.hbase.filter.CompareFilter;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.FilterList;
import org.apache.hadoop.hbase.filter.MultipleColumnPrefixFilter;
import org.apache.hadoop.hbase.filter.RowFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.stereotype.Repository;

import com.carl.spring.data.IHBaseDao;



/**
 * Hbase通用dao实现
 * 
 * @author lxy
 */
@Repository("hbaseDao")
public class HBaseDao implements IHBaseDao {

    @Autowired
    private HbaseTemplate htemplate;

    public Map<String, Object> get(String tableName, String rowName) {
        return htemplate.get(tableName, rowName, new RowMapper<Map<String, Object>>() {

            public Map<String, Object> mapRow(Result result, int rowNum) throws Exception {
                List<Cell> ceList = result.listCells();
                Map<String, Object> map = new HashMap<String, Object>();
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        System.out.println(Bytes.toString(cell.getFamilyArray(), cell.getFamilyOffset(), cell
                                .getFamilyLength())
                                + "_"
                                + Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell
                                        .getQualifierLength()));

                        map.put(Bytes.toString(cell.getFamilyArray(), cell.getFamilyOffset(), cell.getFamilyLength())
                                + "_"
                                + Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell
                                        .getQualifierLength()), Bytes.toString(cell.getValueArray(), cell
                                .getValueOffset(), cell.getValueLength()));
                    }
                }
                return map;
            }
        });
    }

    public String get(String tableName, String rowName, String familyName, String qualifier) {
        return htemplate.get(tableName, rowName, familyName, qualifier, new RowMapper<String>() {

            public String mapRow(Result result, int rowNum) throws Exception {
                List<Cell> ceList = result.listCells();
                String res = "";
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        res = Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
                    }
                }
                return res;
            }
        });
    }

    public List<Map<String, Object>> find(String tableName, String startRow, String stopRow, List<String> qualifierList, String regex) {
        Scan scan = new Scan();
        if (startRow == null) {
            startRow = "";
        }
        if (stopRow == null) {
            stopRow = "";
        }
        scan.setStartRow(Bytes.toBytes(startRow));
        scan.setStopRow(Bytes.toBytes(stopRow));
        
        FilterList filterList = new FilterList();
        
        if(qualifierList != null) {
            byte[][] prefixes = new byte[qualifierList.size()][];
            for(int i = 0; i < qualifierList.size(); i++) {
                prefixes[i] = Bytes.toBytes(qualifierList.get(i));
            }
            //多个列前缀的匹配
            MultipleColumnPrefixFilter filter = new MultipleColumnPrefixFilter(prefixes);
            filterList.addFilter(filter);
            /*
            byte[][] prefixes = new byte[][] {Bytes.toBytes("value1"), Bytes.toBytes("value2")};
            MultipleColumnPrefixFilter f = new MultipleColumnPrefixFilter(prefixes);
            */
        }
        
        //正则匹配rowkey的过滤器
        if(null != regex) {
            Filter filter = new RowFilter(CompareFilter.CompareOp.EQUAL,
                    new BinaryPrefixComparator(regex.getBytes()));
            filterList.addFilter(filter);
        }
        
        System.out.println("filter链，filter的个数：" + filterList.getFilters().size());
        //多个过滤器的情况下，过滤器链的形式
        if(filterList.getFilters().size() > 0) {
            scan.setFilter(filterList);
        }
        
        /*
         * 这句代码,可以实现分页,不过貌似指标没有需要分页的地方
         * PageFilter filter = new PageFilter(5); scan.setFilter(filter);
         */
        return htemplate.find(tableName, scan, new RowMapper<Map<String, Object>>() {

            public Map<String, Object> mapRow(Result result, int rowNum) throws Exception {

                List<Cell> ceList = result.listCells();
                Map<String, Object> map = new HashMap<String, Object>();
                Map<String, Map<String, Object>> returnMap = new HashMap<String, Map<String, Object>>();
                String row = "";
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        row = Bytes.toString(cell.getRowArray(), cell.getRowOffset(), cell.getRowLength());
                        String value =
                                Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
                        String family =
                                Bytes.toString(cell.getFamilyArray(), cell.getFamilyOffset(), cell.getFamilyLength());
                        String quali =
                                Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell
                                        .getQualifierLength());
                        //列名和值放入到Map
                        map.put(quali, value);
                    }
                    map.put("row", row);
                }
                return map;
            }
        });
    }
    
    public List<Map<String, Object>> find(String tableName, String startRow, String stopRow, List<String> qualifierList) {
        return find(tableName, startRow, stopRow, qualifierList, null);
    }
}
