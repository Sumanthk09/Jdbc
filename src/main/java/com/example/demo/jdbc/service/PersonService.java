package com.example.demo.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jdbc.dto.Person;
import com.example.demo.jdbc.repo.PersonRepo;
@Service
public class PersonService 
{
	@Autowired
	PersonRepo pr;

	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return pr.FetchAllPersons();
	}

	public void addperson(Person p) 
	{
		pr.AddPerson(p); 
		
	}

	public List<Person> AddListOfPersons(List<Person> lp) 
	{
		// TODO Auto-generated method stub
		return pr.Addallpersons(lp);
	}

	public List<Person> UpdatePer(Person p) {
		
		return pr.UpdatePerson(p);
	}
	
	
	

}
