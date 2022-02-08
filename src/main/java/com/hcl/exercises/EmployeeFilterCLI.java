package com.hcl.exercises;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import com.hcl.entity.Employee;

/*
 * Filter a list of Employees with and without Stream API
 * Conditions: Salary > 1000
 * 			   Name starts with B or D
 * 			   Age > 30
 */
public class EmployeeFilterCLI {
	
	public static void main(String[] args) {
		
		// Declare list and populate with employee objects
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("Briley", 31, 5000));
		empList.add(new Employee("Scarlet", 27, 1000));
		empList.add(new Employee("Thomas", 35, 500));
		empList.add(new Employee("Bailey", 38, 800));
		empList.add(new Employee("Don", 33, 6000));
		empList.add(new Employee("Susan", 20, 2000));
		empList.add(new Employee("Tim", 25, 5000));
		empList.add(new Employee("Brent", 27, 8000));
		empList.add(new Employee("Danielle", 35, 7500));
		empList.add(new Employee("Stanley", 58, 10000));
		
		System.out.println("Original Employee List:\n");
		empList.stream()
		  	   .forEach(System.out::println);
		
		System.out.println("=============================\n");
		
		// Iterate through list without Stream to filter - place in list
		List<Employee> noStreamList = new ArrayList<>();
		for (Employee emp : empList) {
			
			if (emp.getSalary() > 1000 && emp.getAge() > 30 
					&& (emp.getName().startsWith("B") || emp.getName().startsWith("D"))) {
				noStreamList.add(emp);
			}
		}
		
		System.out.println("No Streams Result:\n");
		for (Employee emp : noStreamList) {
			System.out.println(emp.toString());
		}
		
		System.out.println("=============================\n");
		
		// Use Streams to filter - place in new list
		List<Employee> streamList = new ArrayList<>();
		
		streamList = empList.parallelStream()
							.filter(emp -> emp.getAge() > 30)
							.filter(emp -> emp.getSalary() > 1000)
							.filter(emp -> emp.getName().startsWith("B") 
									|| emp.getName().startsWith("D"))
							.collect(Collectors.toList());
		
		System.out.println("Streams Result:\n");
		streamList.parallelStream()
				  .forEach(System.out::println);
	}
}
