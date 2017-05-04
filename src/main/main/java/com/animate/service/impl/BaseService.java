package com.animate.service.impl;

import com.animate.dao.IBaseDao;
import com.animate.service.IBaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Administrator on 2017/1/11.
 */
public class BaseService<T> implements IBaseService<T> {

    @Autowired
    private IBaseDao<T> iBaseDao;
    private Logger logger;

    public BaseService() {
        this.logger = Logger.getLogger(this.iBaseDao.getEntityClass());
    }

    public T get(Serializable id) {
        return this.iBaseDao.get(id);
    }

    public Object get(Class clazz, Serializable id) {
        return this.iBaseDao.get(clazz, id);
    }

    public T load(Serializable id) {
        return this.iBaseDao.load(id);
    }

    public Object load(Class clazz, Serializable id) {
        return this.iBaseDao.load(clazz, id);
    }

    public T merge(T object) {
        return this.iBaseDao.merge(object);
    }

    public void save(T object) {
        this.iBaseDao.save(object);
    }

    public void save(T... objects) {
        this.iBaseDao.save(objects);
    }

    public void update(T object) {
        this.iBaseDao.update(object);
    }

    public void update(T... objects) {
        this.iBaseDao.update(objects);
    }

    public void saveOrUpdate(T object) {
        this.iBaseDao.saveOrUpdate(object);
    }

    public void saveOrUpdate(T... objects) {
        this.iBaseDao.saveOrUpdate(objects);
    }

    public void delete(T object) {
        this.iBaseDao.delete(object);
    }

    public void delete(T... objects) {
        this.iBaseDao.delete(objects);
    }

    public void evict(T object) {
        this.iBaseDao.evict(object);
    }

    public void evict(T... objects) {
        this.iBaseDao.evict(objects);
    }

    public void flush() {
        this.iBaseDao.flush();
    }

    public void clear() {
        this.iBaseDao.clear();
    }

    public Class<T> getEntityClass() {
        return this.iBaseDao.getEntityClass();
    }

    public String getClassName() {
        return this.iBaseDao.getClassName();
    }

    public List<T> findByProperty(String name, Object value) {
        return this.iBaseDao.findByProperty(name, value);
    }

    public List<T> findByProperty(String name, Object value, int page, int pageSize) {
        return this.iBaseDao.findByProperty(name, value, page, pageSize);
    }

    public List<T> findByProperty(Map<String, Object> conditionMap) {
        return this.iBaseDao.findByProperty(conditionMap);
    }

    public List<T> findByProperty(Map<String, Object> conditionMap, int page, int pageSize) {
        return this.iBaseDao.findByProperty(conditionMap, page, pageSize);
    }

    public List<T> findList(String hql) {
        return this.iBaseDao.findList(hql);
    }

    public List<T> findList(String hql, int page, int pageSize) {
        return this.iBaseDao.findList(hql, page, pageSize);
    }

    public List<T> findList(String hql, Object... params) {
        return this.iBaseDao.findList(hql, params);
    }

    public List<T> findList(String hql, Map<String, Object> params) {
        return this.iBaseDao.findList(hql, params);
    }

    public List<T> findList(String hql, int page, int pageSize, Object... params) {
        return this.iBaseDao.findList(hql, page, pageSize, params);
    }

    public List<T> findList(String hql, int page, int pageSize, Map<String, Object> params) {
        return this.iBaseDao.findList(hql, page, pageSize, params);
    }

    public List executeHQL(String hql) {
        return this.iBaseDao.executeHQL(hql);
    }

    public List executeHQL(String hql, int page, int pageSize) {
        return this.iBaseDao.executeHQL(hql, page,pageSize);
    }

    public List executeHQL(String hql, Object... params) {
        return this.iBaseDao.executeHQL(hql, params);
    }

    public List executeHQL(String hql, Map<String, Object> params) {
        return this.iBaseDao.executeHQL(hql, params);
    }

    public List executeHQL(String hql, int page, int pageSize, Object... params) {
        return this.iBaseDao.executeHQL(hql, page, pageSize, params);
    }

    public List executeHQL(String hql, int page, int pageSize, Map<String, Object> params) {
        return this.iBaseDao.executeHQL(hql, page, pageSize, params);
    }

    public List executeSQL(String sql) {
        return this.iBaseDao.executeSQL(sql);
    }

    public List executeSQL(String sql, int page, int pageSize) {
        return this.iBaseDao.executeSQL(sql, page, pageSize);
    }

    public List executeSQL(String sql, Object... params) {
        return this.iBaseDao.executeSQL(sql, params);
    }

    public List executeSQL(String sql, Map<String, Object> params) {
        return this.iBaseDao.executeSQL(sql, params);
    }

    public List executeSQL(String sql, int page, int pageSize, Object... params) {
        return this.iBaseDao.executeSQL(sql, page, pageSize, params);
    }

    public List executeSQL(String sql, int page, int pageSize, Map<String, Object> params) {
        return this.iBaseDao.executeSQL(sql, page, pageSize, params);
    }

    public Object uniqueHQL(String hql) {
        return this.iBaseDao.uniqueHQL(hql);
    }

    public Object uniqueHQL(String hql, Object... params) {
        return this.iBaseDao.uniqueHQL(hql, params);
    }

    public Object uniqueHQL(String hql, Map<String, Object> params) {
        return this.iBaseDao.uniqueHQL(hql, params);
    }

    public Object uniqueSQL(String sql) {
        return this.iBaseDao.uniqueSQL(sql);
    }

    public Object uniqueSQL(String sql, Object... params) {
        return this.iBaseDao.uniqueSQL(sql, params);
    }

    public Object uniqueSQL(String sql, Map<String, Object> params) {
        return this.iBaseDao.uniqueSQL(sql, params);
    }

    public void updateHQL(String hql) {
        this.iBaseDao.updateHQL(hql);
    }

    public void updateHQL(String hql, Object... params) {
        this.iBaseDao.updateHQL(hql, params);
    }

    public void updateHQL(String hql, Map<String, Object> params) {
        this.iBaseDao.updateHQL(hql, params);
    }

    public void updateSQL(String sql) {
        this.iBaseDao.updateSQL(sql);
    }

    public void updateSQL(String sql, Object... params) {
        this.iBaseDao.updateSQL(sql, params);
    }

    public void updateSQL(String sql, Map<String, Object> params) {
        this.iBaseDao.updateSQL(sql, params);
    }

    public Logger getLogger() {
        return logger;
    }

    public BaseService setLogger(Logger logger) {
        this.logger = logger;
        return this;
    }

    public IBaseDao<T> getiBaseDao() {
        return iBaseDao;
    }

    public BaseService setiBaseDao(IBaseDao<T> iBaseDao) {
        this.iBaseDao = iBaseDao;
        return this;
    }
}
