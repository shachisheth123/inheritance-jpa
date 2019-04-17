package com.capgemini.inheritance.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritance.entity.Contract_Employee;
import com.capgemini.inheritance.entity.Person;
import com.capgemini.inheritance.entity.RegularEmployee;
import com.capgemini.inheritance.service.PersonService;

@RestController
public class PersonInheritController {
	@Autowired
	PersonService service;

	@RequestMapping("/showPersons")
	public Set<Person> regularEmp() {

		Set<Person> persons = new HashSet<>();
		persons.add(new Contract_Employee(101, "shachi", "capgemini", 500.0, 2));
		persons.add(new RegularEmployee(102, "shachi", "symantec", 30000));
		return persons;
	}

}
