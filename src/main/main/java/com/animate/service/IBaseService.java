package com.animate.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Administrator on 2017/1/11.
 */
public interface IBaseService<T> {

    T get(Serializable id);
    Object get(Class clazz, Serializable id);

    T load(Serializable id);
    Object load(Class clazz, Serializable id);

    T merge(T object);

    void save(T object);
    void save(T... objects);

    void update(T object);
    void update(T... objects);

    void saveOrUpdate(T object);
    void saveOrUpdate(T... objects);

    void delete(T object);
    void delete(T... objects);

    void evict(T object);
    void evict(T... objects);

    void flush();
    void clear();

    Class<T> getEntityClass();
    String getClassName();

    List<T> findByProperty(String name, Object value);
    List<T> findByProperty(String name, Object value, int page, int pageSize);
    List<T> findByProperty(Map<String, Object> conditionMap);
    List<T> findByProperty(Map<String, Object> conditionMap, int page, int pageSize);

    List<T> findList(String hql);
    List<T> findList(String hql, int page, int pageSize);
    List<T> findList(String hql, Object... params);
    List<T> findList(String hql, Map<String, Object> params);
    List<T> findList(String hql, int page, int pageSize, Object... params);
    List<T> findList(String hql, int page, int pageSize, Map<String, Object> params);

    List executeHQL(String hql);
    List executeHQL(String hql, int page, int pageSize);
    List executeHQL(String hql, Object... params);
    List executeHQL(String hql, Map<String, Object> params);
    List executeHQL(String hql, int page, int pageSize, Object... params);
    List executeHQL(String hql, int page, int pageSize, Map<String, Object> params);

    List executeSQL(String sql);
    List executeSQL(String sql, int page, int pageSize);
    List executeSQL(String sql, Object... params);
    List executeSQL(String sql, Map<String, Object> params);
    List executeSQL(String sql, int page, int pageSize, Object... params);
    List executeSQL(String sql, int page, int pageSize, Map<String, Object> params);

    Object uniqueHQL(String hql);
    Object uniqueHQL(String hql, Object... params);
    Object uniqueHQL(String hql, Map<String, Object> params);

    Object uniqueSQL(String sql);
    Object uniqueSQL(String sql, Object... params);
    Object uniqueSQL(String sql, Map<String, Object> params);

    void updateHQL(String hql);
    void updateHQL(String hql, Object... params);
    void updateHQL(String hql, Map<String, Object> params);

    void updateSQL(String sql);
    void updateSQL(String sql, Object... params);
    void updateSQL(String sql, Map<String, Object> params);
}
