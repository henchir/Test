package com.henchir.dao;

import java.io.Serializable;

public interface GenericDao<T> extends Serializable {

	public void saveOrUpdate(T entity) throws Exception;

}
