package assignment1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// variables to store the weight of an item to be converted
		double itemWeight;
		
		// scanner object to store user input
		Scanner input = new Scanner(System.in);
		
		// print statements prompting the user to enter the information
		// followed by a statement assigning user input to a variable. 
		System.out.println("Enter a weight in kilograms to convert into pounds.");
		itemWeight = input.nextDouble();
		
		// print statement printing the converted weight to console
		System.out.println(itemWeight + " kilograms is " + (itemWeight / 0.45359237) + " pounds.");
	}
}
