package com.learn.equals_hashcode;

public class Student {

	private Integer regNo;

	private String name;

	private Integer age;

	public Student(Integer regNo, String name, Integer age) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.age = age;
	}

	public Integer getRegNo() {
		return regNo;
	}

	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println("Calling hashcode");
		return this.regNo.hashCode() + this.age.hashCode() + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Calling Equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regNo != other.regNo)
			return false;
		return true;
	}

}
