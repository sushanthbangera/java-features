package com.learn.streams;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private int personId;

	private String name;

	private Date birthDate;

	private Gender gender;

	public Person(int personId, String name, Date birthDate, Gender gender) {
		super();
		this.personId = personId;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		return "Person [personId=" + getPersonId() + ", name=" + getName() + ", birthDate="
				+ format.format(getBirthDate()) + "]";
	}

	public static enum Gender {
		MALE, FEMALE;
	}

}
