package com.henchir.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.henchir.model.Person;
import com.henchir.service.PersonService;

public class Test {

	private static ApplicationContext context, context1, context2;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService usrSrv = (PersonService) context.getBean("pSrv");

		try {
			Person p = new Person(3, "mhenchir", "Nice");
			usrSrv.save(p);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
