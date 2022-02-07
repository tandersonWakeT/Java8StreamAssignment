package com.hcl.exercises;

import java.util.List;
import java.util.ArrayList;

/*
 * Puts into practice a simple method reference
 * 
 */
public class MethodRefCLI {
	
	public static void main(String[] args) {
		
		List<Person> p1 = new ArrayList<>();
		p1.add(new Person(52, "John"));
		p1.add(new Person(55, "James"));
		p1.add(new Person(35, "Jordan"));
		p1.add(new Person(29, "Jane"));
		p1.add(new Person(24, "Juliet"));
		
		
		
		p1.forEach(System.out::println);
		
		// accomplishes the same thing as above but as a lambda
		//p1.forEach(p -> System.out.println(p));
		
	}
}

class Person {
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		this.age = age;
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
}
