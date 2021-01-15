package assignment15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Executable {

	public static void main(String[] args) {
		// create an array that holds 8 elements and add employee objects to the array
		Employee[] employeeArray = new Employee[8];
		employeeArray[0] = new Employee("23232", "Baker", "Amy", 100500);
		employeeArray[1] = new Employee("18912", "Baker", "Tom", 90000);
		employeeArray[2] = new Employee("47596", "Orr", "James", 500000); 
		employeeArray[3] = new Employee("60274", "Orr", "Anthony", 35000);
		employeeArray[4] = new Employee("59420", "Gonzales", "Enrique", 45000);
		employeeArray[5] = new Employee("32920", "Gonzales", "Thomas", 50000);
		employeeArray[6] = new Employee("87654", "Xi", "Jin", 75000);
		employeeArray[7] = new Employee("98745", "Drozdov", "Natasha", 56400);
		
		// create ArrayList from array
		ArrayList<Employee> employeeArrayList = new ArrayList<>(Arrays.asList(employeeArray));
		// tree map for employee object with employee ID as key
		Map<String, Employee> treeMap = new TreeMap<>();
		
		// print header for console output
		System.out.println("All Employees");
		// enhanced for loop to print array and add elements to the TreeMap
		for(Employee element : employeeArrayList ) {
			System.out.println(element.toString());
			
			treeMap.put(element.getID(), element);
		}
		
		// print header for console output
		System.out.println("\nEmployee by ID #:");
		// TreeMap forEach look to print employees in order of Employee ID
		treeMap.forEach((employeeID, employee) -> System.out.println(employee.toString()));
		
	}
}
