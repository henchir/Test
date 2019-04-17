package com.henchir.dao;

import com.henchir.model.Person;

public interface PersonDao extends GenericDao<Person> {

	public void save(Person person);
}
