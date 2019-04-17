package com.capgemini.inheritance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritance.dao.PersonDao;
import com.capgemini.inheritance.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao person;
	
	@Override
	public void addNew(Person persons) {
		person.save(persons);
		
	}

}
