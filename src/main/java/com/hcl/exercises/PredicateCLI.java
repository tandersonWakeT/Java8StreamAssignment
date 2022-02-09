package com.hcl.exercises;

import java.util.function.Predicate;

public class PredicateCLI {
	
	public static void main(String[] args) {
		Predicate<String> lengthCheckOver20 = (i) -> i.length() > 20;
	
		boolean check = lengthCheckOver20.test("This is not enough");
	
		boolean check2 = lengthCheckOver20.test("This one is most certainly enough I bet.");
	
		System.out.println("Test 1: " + check);
		System.out.println("Test 2: " + check2);
	}
}
