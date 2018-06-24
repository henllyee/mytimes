package net.henry.mytimes.bussiness.dao;

import net.henry.mytimes.bussiness.entities.BaseEntity;
import net.henry.mytimes.bussiness.entities.basic.Query;
import net.henry.mytimes.bussiness.entities.basic.QueryPage;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T extends BaseEntity<I>,I extends Serializable> {
    /**
     * 保存记录
     *
     * @param entity 实体对象
     * @return 受影响行数
     */
    int save(T entity);

    /**
     * 更新记录
     *
     * @param entity 实体对象
     * @return 受影响行数
     */
    int update(T entity);

    /**
     * 更新记录
     *
     * @param query 实体对象
     * @return 受影响行数
     */
    int updateByQuery(Query query);

    /**
     * 根据主键id删除记录，尽量使用软删除数据 deleteBySoft
     * <p>Deprecated</p>
     *
     * @param id 主键ID
     * @return 受影响行数
     */
    int delete(I id);

    /**
     * 根据主键id删除记录 (软删除)
     *
     * @param id 主键ID
     * @return 受影响行数
     */
    int deleteBySoft(I id);

    /**
     * 根据查询条件Query查询单个记录
     *
     * @param query 查询对象
     * @return T 实体对象
     */
    T find(Query query);

    /**
     * 根据主键查找单一记录
     * @param id 主键ID
     * @return T 实体对象
     */
    T findById(I id);

    /**
     * 查询行数
     * @param query 查询对象
     * @return int
     */
    int findCount(Query query);

    /**
     * 根据查询条件Query查询全部记录
     * @param query 查询对象
     * @return List<T> 实体列表
     */
    List<T> findAll(Query query);

    /**
     * 根据查询条件Query和分页条件Pageable查询
     *
     * @param pageable 分页查询对象
     * @return List<T> 分页实体列表
     */
    List<T> findPage(QueryPage pageable);

}
