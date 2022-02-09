package com.hcl.exercises;

import com.hcl.entity.Person;

/*
 * Puts into practice a single method from a Functional Interface
 * The method 'call' is implemented by the Person class
 * 
 * 
 * Utilizes the: RequestAssistance functional interface
 */
public class FunctionalInterfaceCLI {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(45, "John");
		Person p2 = new Person(52, "Sarah");
		
		System.out.println(p1.call()); // Functional interface call
		System.out.println(p2.call());
	}
}
