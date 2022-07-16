package com.ebit.xapistatement.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Order;

public abstract class AbstractJpaDAO<T extends Serializable> {

	private Class<T> clazz;

	@PersistenceContext
	EntityManager entityManager;

	public final void setClazz(Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public T findOne(long id) {
		return entityManager.find(clazz, id);
	}

	public List<T> findAll() {
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	public void save(T entity) {
		entityManager.persist(entity);
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public void delete(T entity) {
		entityManager.remove(entity);
	}

	public void deleteById(long entityId) {
		T entity = findOne(entityId);
		delete(entity);
	}

	public Page<T> finalAll(Pageable pageable) {
		//Query query = entityManager.createQuery("From "+ clazz.getName()+" Order By " + pageable.getSort().get());
		StringBuilder strBuilder = new StringBuilder("From "+ clazz.getName());
		
		Iterator<Order> orderIterator = pageable.getSort().iterator();
		Order order = orderIterator.next();
		strBuilder.append(" Order By ").append(order.getProperty()).append(" ")
		                .append(order.getDirection().name());
		Query query =entityManager.createQuery(strBuilder.toString());  
	    int pageNumber =pageable.getPageNumber();
	    int pageSize = pageable.getPageSize();
	    query.setFirstResult((pageNumber) * pageSize);
	    query.setMaxResults(pageSize);
	    List <T> list = query.getResultList();

	    Query queryTotal = entityManager.createQuery
	            ("Select count(f.id) From "+clazz.getName()+" f");
	    long countResult = (long)queryTotal.getSingleResult();
	    int i=(int)countResult;
	    return new PageImpl(list);
	}
}
