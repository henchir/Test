package com.henchir.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.henchir.dao.PersonDao;
import com.henchir.model.Person;
import com.henchir.service.PersonService;

@Service("pSrv")
@Transactional
public class PersonServiceImp implements PersonService {

	@Autowired
	PersonDao personDao;
	public void save(Person person) {
		personDao.save(person);
		
	}


}
