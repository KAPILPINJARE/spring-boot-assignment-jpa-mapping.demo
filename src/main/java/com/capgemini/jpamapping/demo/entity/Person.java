package com.capgemini.jpamapping.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int personId;
	private String personName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	private Profile profile;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public Person(int personId, String personName, Profile profile) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", profile=" + profile + "]";
	}

	
}
