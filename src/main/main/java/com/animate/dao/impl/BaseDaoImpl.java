package com.animate.dao.impl;

import com.animate.dao.IBaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Administrator on 2017/1/11.
 */
public class BaseDaoImpl<T> implements IBaseDao<T> {

    @Autowired
    private SessionFactory sessionFactory;
    private Class<T> entityClass;
    private String className;

    public BaseDaoImpl() {
        this.entityClass = (Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.className = this.entityClass.getName();
    }

    public T get(Serializable id) {
        return (T)this.getSession().get(this.entityClass, id);
    }

    public Object get(Class clazz, Serializable id) {
        return this.getSession().get(clazz, id);
    }

    public T load(Serializable id) {
        return (T)this.getSession().load(this.entityClass, id);
    }

    public Object load(Class clazz, Serializable id) {
        return this.getSession().load(clazz, id);
    }

    public T merge(T object) {
        return (T)this.getSession().merge(object);
    }

    public void save(T object) {
        this.getSession().save(object);
    }

    public void save(T... objects) {
        for(T object : objects) {
            this.getSession().save(object);
        }
    }

    public void update(T object) {
        this.getSession().update(object);
    }

    public void update(T... objects) {
        for(T object : objects) {
            this.getSession().update(object);
        }
    }

    public void saveOrUpdate(T object) {
        this.getSession().saveOrUpdate(object);
    }

    public void saveOrUpdate(T... objects) {
        for(T object : objects) {
            this.getSession().saveOrUpdate(object);
        }
    }

    public void delete(T object) {
        this.getSession().delete(object);
    }

    public void delete(T... objects) {
        for(T object : objects) {
            this.getSession().delete(object);
        }
    }

    public void evict(T object) {
        this.getSession().evict(object);
    }

    public void evict(T... objects) {
        for(T object : objects) {
            this.getSession().evict(object);
        }
    }

    public void flush() {
        this.getSession().flush();
    }

    public void clear() {
        this.getSession().clear();
    }

    public List<T> findByProperty(String name, Object value) {
        StringBuilder hql = new StringBuilder(" from " + this.getClassName() + " where " + name + " = :" + name);
        Query query = this.getSession().createQuery(hql.toString());
        query.setParameter(name, value);
        return query.list();
    }

    public List<T> findByProperty(String name, Object value, int page, int pageSize) {
        StringBuilder hql = new StringBuilder(" from " + this.getClassName() + " where " + name + " = :" + name);
        Query query = this.getSession().createQuery(hql.toString()).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        query.setParameter(name, value);
        return query.list();
    }

    private Query packageFindByProperty(Map<String, Object> conditionMap) {
        StringBuilder hql = new StringBuilder(" from " + this.getClassName() + " where 1 = 1 ");
        for(Map.Entry<String, Object> entry : conditionMap.entrySet()) {
            hql.append(" and " + entry.getKey() + " = :" + entry.getKey());
        }
        Query query = this.getSession().createQuery(hql.toString());
        for(Map.Entry<String, Object> entry : conditionMap.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query;
    }

    public List<T> findByProperty(Map<String, Object> conditionMap) {
        return this.packageFindByProperty(conditionMap).list();
    }

    public List<T> findByProperty(Map<String, Object> conditionMap, int page, int pageSize) {
        return this.packageFindByProperty(conditionMap).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize).list();
    }

    public List<T> findList(String hql) {
        Query query = this.getSession().createQuery(hql);
        return query.list();
    }

    public List<T> findList(String hql, int page, int pageSize) {
        Query query = this.getSession().createQuery(hql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        return query.list();
    }

    public List<T> findList(String hql, Object... params) {
        Query query = this.getSession().createQuery(hql);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        return query.list();
    }

    public List<T> findList(String hql, Map<String, Object> params) {
        Query query = this.getSession().createQuery(hql);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.list();
    }

    public List<T> findList(String hql, int page, int pageSize, Object... params) {
        Query query = this.getSession().createQuery(hql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        return query.list();
    }

    public List<T> findList(String hql, int page, int pageSize, Map<String, Object> params) {
        Query query = this.getSession().createQuery(hql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.list();
    }

    public List executeHQL(String hql) {
        Query query = this.getSession().createQuery(hql);
        return query.list();
    }

    public List executeHQL(String hql, int page, int pageSize) {
        Query query = this.getSession().createQuery(hql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        return query.list();
    }

    public List executeHQL(String hql, Object... params) {
        Query query = this.getSession().createQuery(hql);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        return query.list();
    }

    public List executeHQL(String hql, Map<String, Object> params) {
        Query query = this.getSession().createQuery(hql);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.list();
    }

    public List executeHQL(String hql, int page, int pageSize, Object... params) {
        Query query = this.getSession().createQuery(hql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        return query.list();
    }

    public List executeHQL(String hql, int page, int pageSize, Map<String, Object> params) {
        Query query = this.getSession().createQuery(hql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.list();
    }

    public List executeSQL(String sql) {
        Query query = this.getSession().createSQLQuery(sql);
        return query.list();
    }

    public List executeSQL(String sql, int page, int pageSize) {
        Query query = this.getSession().createSQLQuery(sql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        return query.list();
    }

    public List executeSQL(String sql, Object... params) {
        Query query = this.getSession().createSQLQuery(sql);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        return query.list();
    }

    public List executeSQL(String sql, Map<String, Object> params) {
        Query query = this.getSession().createSQLQuery(sql);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.list();
    }

    public List executeSQL(String sql, int page, int pageSize, Object... params) {
        Query query = this.getSession().createSQLQuery(sql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        return query.list();
    }

    public List executeSQL(String sql, int page, int pageSize, Map<String, Object> params) {
        Query query = this.getSession().createSQLQuery(sql).setFirstResult((page - 1) * pageSize).setMaxResults(pageSize);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.list();
    }

    public Object uniqueHQL(String hql) {
        Query query = this.getSession().createQuery(hql);
        return query.uniqueResult();
    }

    public Object uniqueHQL(String hql, Object... params) {
        Query query = this.getSession().createQuery(hql);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        return query.uniqueResult();
    }

    public Object uniqueHQL(String hql, Map<String, Object> params) {
        Query query = this.getSession().createQuery(hql);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.uniqueResult();
    }

    public Object uniqueSQL(String sql) {
        Query query = this.getSession().createSQLQuery(sql);
        return query.uniqueResult();
    }

    public Object uniqueSQL(String sql, Object... params) {
        Query query = this.getSession().createSQLQuery(sql);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        return query.uniqueResult();
    }

    public Object uniqueSQL(String sql, Map<String, Object> params) {
        Query query = this.getSession().createSQLQuery(sql);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        return query.uniqueResult();
    }

    public void updateHQL(String hql) {
        Query query = this.getSession().createQuery(hql);
        query.executeUpdate();
    }

    public void updateHQL(String hql, Object... params) {
        Query query = this.getSession().createQuery(hql);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        query.executeUpdate();
    }

    public void updateHQL(String hql, Map<String, Object> params) {
        Query query = this.getSession().createQuery(hql);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        query.executeUpdate();
    }

    public void updateSQL(String sql) {
        Query query = this.getSession().createSQLQuery(sql);
        query.executeUpdate();
    }

    public void updateSQL(String sql, Object... params) {
        Query query = this.getSession().createSQLQuery(sql);
        int index = 0;
        for(Object object : params) {
            query.setParameter(index++, object);
        }
        query.executeUpdate();
    }

    public void updateSQL(String sql, Map<String, Object> params) {
        Query query = this.getSession().createSQLQuery(sql);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            query.setParameter(entry.getKey(), entry.getValue());
        }
        query.executeUpdate();
    }

    private Session getSession() {
        return this.getSessionFactory().getCurrentSession();
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public BaseDaoImpl setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        return this;
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }

    public String getClassName() {
        return className;
    }
}
