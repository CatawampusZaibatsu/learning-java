package assignment5;

import java.util.ArrayList;
import java.util.Iterator;

public class Program3 {

	public static void main(String[] args) {
		// create an ArrayList and add five string values to it
		ArrayList<String> names = new ArrayList<String>();
			names.add("Isaac Asimov");
			names.add("Frank Herbert");
			names.add("Philip K. Dick");
			names.add("Niel Gaiman");
			names.add("William Gibson");
		
		// normal for loop that prints all the values within the array list
		for (int i = 0; i < names.size(); i++) {
			System.out.printf("%s\n", names.get(i));
		}
		System.out.println(""); // just a new line to clean up console
		
		// method that changes the array list and prints the new array list using a for each loop
		changeArrayList(names);
		System.out.println(""); // just a new line to clean up console
		
		// prints the title before using an iterator to print the array list
		System.out.println("\nUsing an iterator, here is the list:");
		
		// creates an iterator from the array list
		Iterator<String> iter = names.iterator();
		
		// while there is still another value to print, print the next value 
		while (iter.hasNext()) {
			System.out.print(iter.next() + "\n");
		}
			
	}
	
	// method to change the array list and print using a foreach loop
	public static void changeArrayList(ArrayList<String> names) {
		names.add(2, "Douglas Adams"); // add new value at index 2
		names.remove(4); // removes value at index 4
		
		// prints title then uses a foreach loop to print the arraylist
		System.out.println("Here is the new list:");
		for (String name : names) {
			System.out.printf(" * %s" , name);
		}
	}
}
