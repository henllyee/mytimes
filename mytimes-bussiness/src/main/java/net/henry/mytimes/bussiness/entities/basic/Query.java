package net.henry.mytimes.bussiness.entities.basic;

import java.util.HashMap;

public class Query extends HashMap<String,Object> {

    /**
     * usable默认true 查询可用的记录
     */
    public Query(){
//		this.put("deleteFlag", 0);
    }
    /**
     * 设置usable 查询记录是否可用的
     */
    public Query(int deleteFlag){
        this.put("deleteFlag", deleteFlag);
    }
    /**
     * 设置usable 查询记录是否可用的
     */
    public void setUsable(int deleteFlag) {
        this.put("deleteFlag", deleteFlag);
    }

}
