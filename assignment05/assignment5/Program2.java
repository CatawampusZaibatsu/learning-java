package assignment5;

import java.util.Arrays;

public class Program2 {
	
	// Note: This program was demonstrating command line arguments. 
	public static void main(String[] args) {
		System.out.printf("Passing: %s\n", Arrays.toString(args)); // prints the entire command line argument array
		System.out.printf("Sum: %d", sumInts(args)); // prints the total that is returns by the method sumInts()
	}
	
	// takes a String array in and converts all the values to integers and gets the total of all values
	public static int sumInts(String[] commandLineArgs) {
		int total = 0; // counter for the total
		
		// loops through array adding values to total
		for (int i = 0; i < commandLineArgs.length; i++) {
			total += Integer.parseInt(commandLineArgs[i]);
		}
		
		return total; // returns the total
		
	}

}
