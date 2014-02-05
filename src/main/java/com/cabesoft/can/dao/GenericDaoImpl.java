package com.cabesoft.can.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class GenericDaoImpl<E, PK extends Serializable> extends
		HibernateDaoSupport implements GenericDao<E, PK> {

	// http://stackoverflow.com/questions/3230608/spring-3-annotations-hibernatedaosupport-repository-requires-session-factory

	@Autowired
	public void init(SessionFactory factory) {
		setSessionFactory(factory);
	}

	@SuppressWarnings("unchecked")
	public PK save(E newInstance) {
		return (PK) getHibernateTemplate().save(newInstance);
	}

	public E findById(PK id) {
		return (E) getHibernateTemplate().get(getEntityClass(), id);
	}

	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		return getHibernateTemplate().findByCriteria(createDetachedCriteria());
	}

	@SuppressWarnings("unchecked")
	public List<E> findAllByProperty(String propertyName, Object value) {
		DetachedCriteria criteria = createDetachedCriteria();
		criteria.add(Restrictions.eq(propertyName, value));
		return getHibernateTemplate().findByCriteria(criteria);
	}

	@SuppressWarnings("unchecked")
	public List<E> findByExample(E object) {
		List<E> resultList = getHibernateTemplate().findByExample(object, 0, 1);
		return resultList;
	}

	@SuppressWarnings("unchecked")
	public List<E> findByExample(E object, int firstResult, int maxResults) {
		List<E> resultList = getHibernateTemplate().findByExample(object,
				firstResult, maxResults);
		return resultList;
	}

	public void update(E transientObject) {
		getHibernateTemplate().update(transientObject);
	}

	public void saveOrUpdate(E transientObject) {
		getHibernateTemplate().saveOrUpdate(transientObject);
	}

	public void delete(E persistentObject) {
		getHibernateTemplate().delete(persistentObject);
	}

	protected abstract Class<E> getEntityClass();

	protected DetachedCriteria createDetachedCriteria() {
		return DetachedCriteria.forClass(getEntityClass());
	}
}