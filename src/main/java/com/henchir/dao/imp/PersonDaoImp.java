package com.henchir.dao.imp;

import org.springframework.stereotype.Repository;

import com.henchir.dao.PersonDao;
import com.henchir.model.Person;

@Repository
public class PersonDaoImp extends GenericDaoImp<Person> implements PersonDao {

	public void save(Person person) {

		super.saveOrUpdate(person);

	}

}
