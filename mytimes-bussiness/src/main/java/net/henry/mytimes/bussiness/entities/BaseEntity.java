package net.henry.mytimes.bussiness.entities;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity<T> implements Serializable {

    public BaseEntity() {}

    /** 创建人员 **/
    private Long createUser;
    /** 创建时间 **/
    private Date createTime;

    private Long updateUser;

    private Date updateTime;

    /**
     * @author: yanghj
     * @return the createUser
     */
    public Long getCreateUser() {
        return createUser;
    }
    /**
     * @author: yanghj
     * @param createUser the createUser to set
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }
    /**
     * @author: yanghj
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }
    /**
     * @author: yanghj
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * @author: yanghj
     * @return the updateUser
     */
    public Long getUpdateUser() {
        return updateUser;
    }
    /**
     * @author: yanghj
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }
    /**
     * @author: yanghj
     * @return the updateTime
     */

    public Date getUpdateTime() {
        return updateTime;
    }
    /**
     * @author: yanghj
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
