package com.hcl.entity;

import com.hcl.interfaces.RequestAssistance;

public class Person implements RequestAssistance{
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nAge: " + this.age + "\n";
	}
	
	public String call() {                                        // Functional Interface method implementation
		return this.getName() + " is in need of assistance";
	}
}