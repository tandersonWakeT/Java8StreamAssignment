package com.hcl.exercises;

/*
 * Utilizes a Default and a Static interface method
 * 
 */
public class DefaultStaticMethodInterfaceCLI {
	
	public static void main(String[] args) {
		
		Animal b1 = new Sparrow();
		b1.action();

	}
	
}

interface Animal {
	
	default void action() {
		System.out.println("The animal searches for food.");
		escape();
	}
	
	static void escape() {
		System.out.println("The animal runs away from a threat.");
	}
}

interface Bird {
	
	default void action() {
		System.out.println("The bird takes to the sky to search for food.");
	}
}

class Sparrow implements Animal, Bird {

	@Override
	public void action() {
		// TODO Auto-generated method stub
		Animal.super.action();
		Bird.super.action();
	}
	
}
