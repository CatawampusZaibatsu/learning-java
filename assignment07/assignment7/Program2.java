package assignment7;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		double[] doubleArray = new double[10]; // creates an array of 10 doubles
	
		for (int i=0; i < doubleArray.length; i++) {
			doubleArray[i] = 1 + (Math.random() * 10); // creates a double between 1 and 10.99 and add it to the array
		}
		
		writeNumbers(doubleArray); // takes the array as an argument and writes it to a file
		readNumbers(); // reads the text file and prints each line to the console

	}
	
	// creates a file and writes array of double to the file
	public static void writeNumbers(double[] numbers) {
		try {
			File newFile = new File("numbers.txt"); // creates newFile object
			newFile.createNewFile(); // actually creates the new file
			
			FileWriter writer = new FileWriter("numbers.txt"); // writer object that opens Numbers.txt

			for (double number : numbers) {
				writer.write(String.valueOf(number) + "\n"); // prints each double to a new line
			}		
			writer.close();
		}
		catch (Exception e) {
			System.out.println("Something went wrong!"); // if any exception happens this message will print to the console	
		}
		
	}
	
	// reads the file, prints to console, and calculates the total
	public static void readNumbers() {
		try {
			File file =  new File("numbers.txt"); // file object
			Scanner reader = new Scanner(file); // scanner to read through file object

			double total = 0; // counter for the total
			
			// while there's still a next line to read
			// grab the line, print it, and add it to the total
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
				total += Double.valueOf(line);
			}
			
			System.out.printf("The total is: %.2f", total); // prints the total formated to two decimal places
			reader.close(); // close the scanner object
		}
		catch (Exception e) {
			System.out.println("Something went wrong!"); // if any exception happens this message will print to the console	
		}
			
	}

}
