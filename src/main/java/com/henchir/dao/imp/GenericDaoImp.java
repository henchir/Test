package com.henchir.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.henchir.dao.GenericDao;

public class GenericDaoImp<T> implements GenericDao<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	private EntityManager entityManager;

	public void saveOrUpdate(T entity) {
		entityManager.persist(entity);
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhh");
		
	}
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	
}
