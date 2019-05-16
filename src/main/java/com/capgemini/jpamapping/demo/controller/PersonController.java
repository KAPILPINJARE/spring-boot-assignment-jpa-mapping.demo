package com.capgemini.jpamapping.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpamapping.demo.entity.Person;
import com.capgemini.jpamapping.demo.entity.Profile;
import com.capgemini.jpamapping.demo.service.MyService;

@RestController
public class PersonController {
	
	
	@Autowired
	private MyService service;
	
	@RequestMapping("/add")
	public Person addOneToOne() {
		Person person = new Person(101,"kapil",new Profile(102, "kp"));
		service.add(person);
		return person;
	}
	
	@RequestMapping("/get")
	public Person get() {
		return service.getAll(101);
	}
	
	@RequestMapping("/getAll")
	public List getAll() {
		return service.getEver();
	}
	
	@RequestMapping("/delete")
	public String delete() {
		service.delete(101);
		return "Delete Successfull";
	}
	 
}
