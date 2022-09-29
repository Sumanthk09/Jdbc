package com.example.demo.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jdbc.service.PersonService;
import com.example.demo.jdbc.dto.*;
@RestController
public class Personcontroller 
{
	@Autowired
	PersonService ps;
	@RequestMapping("/all")
	public List<Person> getallpersons()
	{
		return ps.getPersons();
	}
	@PostMapping("/add")
	public String addPerson(@RequestBody Person p)
	{
		ps.addperson(p);
		return "Successfully added ";
	}
	@PostMapping("/addpersons")
	public List<Person> AddPersons(@RequestBody List<Person> lp)
	{
		return ps.AddListOfPersons(lp);
	}
	@PutMapping("/update")
	public List<Person> Update(@RequestBody Person p)
	{
		return ps.UpdatePer(p);
	}	
}
