package com.veer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Person;

@RestController
public class PersonService  {
	private static List<Person> persons = new ArrayList<Person>();
	static{
		persons.add(new Person("Virender","Male",30));
		persons.add(new Person("Anu","Female",31));
		persons.add(new Person("Prateek","Male",32));
		persons.add(new Person("Tapasya","Female",28));
		persons.add(new Person("Nivaan","Male",1));
	}
	
	@RequestMapping("/persons")
	public List<Person> getPersons() {
		return persons;
	}
	
	@RequestMapping("/person/{name}")
	public List<Person> getPersonDetails(@PathVariable String name) {
		return persons.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
	}
}
