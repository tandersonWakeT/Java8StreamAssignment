package com.hcl.exercises;

import java.util.Optional;

public class OptionalClassCLI {
	
	public static void main(String[] args) {
		
		String[] s1 = new String[5];
		s1[0] = "Toyota";
		s1[2] = "Ford";
		s1[4] = "Audi";
		
		for (int i = 0; i < s1.length; i++) {
			
			Optional<String> validate = Optional.ofNullable(s1[i]);
			
			if (validate.isPresent()) {
				System.out.println("Current word: " + s1[i]);
			}
			else {
				System.out.println("Current word does not exist: " + i);
			}
		}
	}
}
