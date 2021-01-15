package assignment14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Executable {

	public static void main(String[] args) {
		// create an array that holds 8 elements and add employee objects to the array
		Employee[] employeeArray = new Employee[8];
		employeeArray[0] = new Employee("23232", "Baker", "Amy", 100500);
		employeeArray[1] = new Employee("38912", "Baker", "Tom", 90000);
		employeeArray[2] = new Employee("47596", "Orr", "James", 500000); 
		employeeArray[3] = new Employee("50274", "Orr", "Anthony", 35000);
		employeeArray[4] = new Employee("69420", "Gonzales", "Enrique", 45000);
		employeeArray[5] = new Employee("72920", "Gonzales", "Thomas", 50000);
		employeeArray[6] = new Employee("87654", "Xi", "Jin", 75000);
		employeeArray[7] = new Employee("98745", "Drozdov", "Natasha", 56400);
		
		// create ArrayList from array
		ArrayList<Employee> employeeArrayList = new ArrayList<>(Arrays.asList(employeeArray));
		
		// using comparator and a lambda expression to sort ArrayList
		employeeArrayList.sort((object1, object2) -> {
			if (object1.getLastName().compareToIgnoreCase(object2.getLastName()) == 0){
				return object1.getFirstName().compareToIgnoreCase(object2.getFirstName());
			}
			else {
				return object1.getLastName().compareToIgnoreCase(object2.getLastName());
			}
		});
		
		// forEach loop with a lambda expression
		System.out.println("Employees Sorted Alphabetically by Name (Ascending)");
		employeeArrayList.forEach(e -> System.out.println(e.toString()));
		
		// Create a LinkedList from the ArrayList
		LinkedList<Employee> employeeLinkedList = new LinkedList<>(employeeArrayList);
		// Create an Iterator for LinkedList
		ListIterator<Employee> iterator = employeeLinkedList.listIterator();
		
		// loops through LinkedList using iterator doing nothing
		while(iterator.hasNext()) {
			iterator.next();
		}
		
		// loops through LinkedList using iterator printing elements in reverse
		System.out.println("\nEmployees Sorted Alphabetically by Name (Descending)");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous().toString());
		}	

	}

}
