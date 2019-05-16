package com.capgemini.jpamapping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpamapping.demo.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer>{

}
