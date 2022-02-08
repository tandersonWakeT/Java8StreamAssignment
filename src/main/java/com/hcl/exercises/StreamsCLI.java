package com.hcl.exercises;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

import com.hcl.entity.Person;
/*
 * Puts into practice a single Stream
 * and a ParallelStream
 * 		- ParallelStreams differ because they can utilize multiple
 * 		  threads to complete the Stream
 * 
 */
public class StreamsCLI {
	
	public static void main(String[] args) {
		
		List<Person> pList = new ArrayList<>();
	
		pList.add(new Person(45, "Jerry"));
		pList.add(new Person(22, "Hange"));
		pList.add(new Person(26, "Sarah"));
		pList.add(new Person(53, "Harry"));
		pList.add(new Person(20, "Hermoine"));
		pList.add(new Person(44, "Tron"));
		
		// Using stream to count People with age over 25
		long ageCount = pList.stream()							// Stream
							.filter(person -> person.getAge() > 25) // lambda expression
							.count();
		System.out.println("Number of people older than 25: " + ageCount + "\n");
		
		/* Use parallel stream to store all Names of people older
		 * than 25 in a list then iterate the list
		 * printing those names
		 */
		List<String> nameList = new ArrayList<>();
		
		nameList = pList.parallelStream()						// Parallel Stream
						.filter(p -> p.getAge() > 25)
						.map(Person::getName)					// method reference
						.collect(Collectors.toList());          // Collectors class
		
		System.out.println("People older than 25: ");
		
		nameList.parallelStream()								// Parallel Stream
				.forEach(System.out::println);                  // method reference
	}
}
