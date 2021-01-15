package assignment3;

import java.util.ArrayList;

public class Program1 {
	
	public static void main(String[] args) {
		// place to store the multiples of 11 or 13 (but not both)
		// used an ArrayList so I can change the length of the array easily
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		
		// store the total of all the multiples
		int total = 0;
		
		// loop to go from 300 to 200 inclusive and finds multiples
		for	(int i = 300; i >= 200; i--) {
			if (i % 11 == 0 ^ i % 13 == 0) {
				multiples.add(i);
			}
		}
		
		// loop through the array list and print values formated as specified. 
		for (int i = 0; i < multiples.size(); i++) {
			
			// after five items start a new line
			if (i % 5 == 0 && i != 0) {
				System.out.println();
			}
			
			// print item in array at current index and add it to the total
			System.out.printf("%-8d", multiples.get(i));
			total += multiples.get(i);		
		}
		
		// print the number of integers found and the total
		System.out.printf("\nFound %d integers totaling %d", multiples.size(), total);
		
	}
	
}
