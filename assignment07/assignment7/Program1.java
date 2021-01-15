package assignment7;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		
		// array of integers to search though
		int[] numbers = {4, 5, 3, 7};
		int needle = -1;
		
		// get user input to search for an array
		System.out.println("Please enter a positive integer for me to find within the array.");
		
		// try to convert user input to an integer, if it can't be down throw an exception
		try {
			// user input
			needle = input.nextInt();
			
			// if the value is not -1 then we have found the integer in the array
			if (returnIndex(numbers, needle) != -1) {
				System.out.printf("The integer %d was found at index %d", needle, returnIndex(numbers, needle));
			}
			else {
				System.out.printf("The integer %d was not found in the array.", needle); // can't find the value in the array
			}
		}
		catch (java.util.InputMismatchException e) {
			System.out.println("Element not found in array. Please input only integers into the search."); // input is not an integer
		}

	}
	
	// method that will search through an array and returns it's index
	public static int returnIndex(int[] haystack, int needle) {
		for (int i = 0; i < haystack.length; i++) {
			if(haystack[i] == needle) {
				return i;
			}
		}
				
		return -1; // returns -1 if nothing was found (method has to return an integer)
	}
}
