package com.capgemini.jpamapping.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.jpamapping.demo.entity.Person;

@Service
public interface MyService {
	public void add(Person person);
	public Person getAll(int id);
	void delete(int id);
	List getEver();
}
