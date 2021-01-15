package assignment2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// prompts user to enter their name
		System.out.println("Please enter your first, last, and middle name.");
		
		// store first middle and last name into variables
		String first = input.next();
		String middle = input.next();
		String last = input.next();
		
		// prints the number of characters in the full name using string.length()
		System.out.printf("Length of your name: %d characters", 
				first.length() + middle.length() + last.length());
		
	}
}
