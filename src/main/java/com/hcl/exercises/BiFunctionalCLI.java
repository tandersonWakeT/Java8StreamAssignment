package com.hcl.exercises;

import java.util.function.BiFunction;

public class BiFunctionalCLI {
	
	public static void main(String[] args) {
		
		BiFunction<String, String, String> combineString = new Concatenator()::combine;
		
		String result = combineString.apply("Hello ", "World");
		
		System.out.println("Combining Hello and World: \n" + result);
	}
}

class Concatenator {
	
	public String combine(String s1, String s2) {
		
		return s1 + s2;
	}
}
