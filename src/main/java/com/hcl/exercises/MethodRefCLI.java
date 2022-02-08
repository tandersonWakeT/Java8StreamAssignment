package com.hcl.exercises;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.hcl.entity.Person;
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
		
		
		// method reference
		p1.forEach(System.out::println); // method reference
		
		// accomplishes the same thing as above but as a lambda
		//p1.forEach(p -> System.out.println(p));
		
		System.out.println("Sorting the names: ");
		String[] nameArray = new String[5];
		for (int i = 0; i < p1.size(); i++) {
			nameArray[i] = p1.get(i).getName();
		}
		Arrays.sort(nameArray, String::compareTo); // method reference
		for (String name : nameArray) {
			System.out.println(name);
		}
	}
}


