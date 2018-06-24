package net.henry.mytimes.bussiness.entities.basic;

import java.util.ArrayList;
import java.util.List;

public class Page {


    /** 每页的数量 */
    private Integer limit = 100;
    /** 当前数据索引位置 */
    private Integer offset = 0;
    /** 总记录数 */
    private Integer total = 0;
    /** 结果集数据 */
    private List<?> rows = new ArrayList<Object>();

    public Page(){}

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public Page setRows(List<?> rows) {
        this.rows = rows;
        return this;
    }



}
