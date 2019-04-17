package com.henchir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.henchir.model.Person;
import com.henchir.service.PersonService;

@Controller
@RequestMapping("/info")
public class PersonController {
	@Autowired
	private PersonService personService;
	@RequestMapping("/home")
	public String home() {
 		return "home";
 	}
	
	@RequestMapping(value= "/person", method = RequestMethod.POST)
	public ResponseEntity<Void> addPerson(@RequestBody Person person, UriComponentsBuilder builder) {
        personService.save(person);            
               HttpHeaders headers = new HttpHeaders();
               headers.setLocation(builder.path("/person/{id}").buildAndExpand(person.getId()).toUri());
               return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
}
