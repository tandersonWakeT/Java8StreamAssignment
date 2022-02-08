package com.hcl.entity;

public class Employee {

	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {

		return this.name;
	}

	public int getAge() {

		return this.age;
	}

	public int getSalary() {

		return this.salary;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public void setSalary(int salary) {

		this.salary = salary;
	}
	
	public String toString() {
		
		return "Name: " + this.name + "\nAge: " + this.age + "\nSalary: " + this.salary + "\n";
	}
}
