package com.hcl.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.hcl.entity.Person;

public class CollectorsCLI {
	
	public static void main(String[] args) {
		
		List<Person> p1 = new ArrayList<>();
		p1.add(new Person(52, "John"));
		p1.add(new Person(55, "James"));
		p1.add(new Person(35, "Jordan"));
		p1.add(new Person(29, "Jane"));
		p1.add(new Person(24, "Juliet"));
		
		List<Person> p2 = new ArrayList<>();
				
		p2 = p1.stream()                          // stream
				.filter(p -> p.getAge() > 30)     // method reference
				.collect(Collectors.toList());    // Collectors
		
		p2.stream()
		  .forEach(System.out::print);
	}
}
