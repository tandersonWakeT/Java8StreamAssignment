package com.hcl.exercises;

/**
 * Demonstrates a lambda expression
 *
 */
public class LambdaCLI {
	
    public static void main(String[] args) {
        
    	/* if 2 values are even = add them, 
    	 * if 1 or both of the values are odd = subtract them
    	*/
    	System.out.println("Java Lambdas: ");
    	
    	DetermineCalc c1 = (a, b) -> (a % 2 == 0 && b % 2 == 0) ? a + b : a - b;
    	
    	System.out.println("Two Even Numbers 4 and 6: " + c1.addSubtract(4, 6));
    	System.out.println("One Even One Odd 10 and 5: " + c1.addSubtract(10, 5));
    	System.out.println("Two Odd Numbers 7 and 11: " + c1.addSubtract(7, 11));
    }
}

@FunctionalInterface
interface DetermineCalc {
	int addSubtract(int a, int b);
}
