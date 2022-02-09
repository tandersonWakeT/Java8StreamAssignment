package com.hcl.exercises;

import java.util.ArrayList;
import java.util.List;

import com.hcl.entity.Person;

public class ForEachCLI {
	
	public static void main(String[] args) {
		
		List<Person> p1 = new ArrayList<>();
		p1.add(new Person(52, "John"));
		p1.add(new Person(55, "James"));
		p1.add(new Person(35, "Jordan"));
		p1.add(new Person(29, "Jane"));
		p1.add(new Person(24, "Juliet"));
		
		System.out.println("Ages: ");
		
		p1.stream()
		  .mapToInt(Person::getAge)       // method reference
		  .forEach(System.out::println);  // forEach with method reference
	}
}
