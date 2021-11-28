package com.learn.streams;

public class Employee {

    int id;

    String name;

    int salary;

    Address addressId;

    public Employee(String name, int id, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name, int salary, Address addressId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.addressId = addressId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public String toString() {
        return this.getId() + ": " + this.getName();
    }
}
