package net.henry.mytimes.bussiness.entities.basic;


import com.google.common.collect.Maps;

import java.util.Map;

public class QueryPage extends Page {

    /** 查询条件 */
    public Map<String, Object> condition =  Maps.newHashMap();
    /** 排序方式，根据设置字段的前后顺序 */
    public Map<String, Object> sort = Maps.newTreeMap();

    /**
     * @author: yanghj
     * @return the condition
     */
    public Map<String, Object> getCondition() {
        return condition;
    }
    /**
     * @author: yanghj
     * @param condition the condition to set
     */
    public void setCondition(Map<String, Object> condition) {
        this.condition = condition;
    }
    /**
     * @author: yanghj
     * @return the sort
     */
    public Map<String, Object> getSort() {
        return sort;
    }
    /**
     * @author: yanghj
     * @param sort the sort to set
     */
    public void setSort(Map<String, Object> sort) {
        this.sort = sort;
    }
    /**
     * usable默认true 查询可用的记录
     */
    public QueryPage(){
//		this.setCondition("deleteFlag", 0);
//		this.condition.put("deleteFlag", 0);
    }
    /**
     * 设置usable 查询记录是否可用的
     */
    public QueryPage(int deleteFlag){
        this.setCondition("deleteFlag", 0);
    }
    /**
     * 设置usable 查询记录是否可用的
     */
    public void setDeleteFlag(int deleteFlag) {
        this.setCondition("deleteFlag", deleteFlag);
    }

    /**
     * 设置查询条件
     * @param field 字段名称
     * @param value 查询数据值
     */
    public void setCondition(String field, Object value) {
        this.condition.put(field, value);
    }

    /**
     * 设置排序方式，根据设置字段的前后顺序
     * @param sort 排序字段名称
     * @param order 排序方式 asc, desc
     */
    public void setSort(String sort, Order order) {
        this.sort.put(sort, order);
    }

    /**
     * 设置排序方式，根据设置字段的前后顺序 默认 asc
     * @param sort 排序字段名称
     */
    public void setSort(String sort) {
        this.sort.put(sort, Order.ASC);
    }


    public enum Order {
        /** 正序 */
        ASC,
        /** 倒序 */
        DESC
    }

}
