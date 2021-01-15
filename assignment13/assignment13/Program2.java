package assignment13;

import java.util.ArrayList;

public class Program2 {

	public static void main(String[] args) {
		// ArrayLists of various type and values added to them
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(5); intArray.add(6); intArray.add(7); intArray.add(8);
		ArrayList<Double> doubleArray = new ArrayList<>();
		doubleArray.add(50.56); doubleArray.add(24.5); doubleArray.add(19.99); doubleArray.add(4.20);
		ArrayList<Byte> byteArray = new ArrayList<>();
		byteArray.add((byte) 6); byteArray.add((byte) 8); byteArray.add((byte) 12); byteArray.add((byte) 24);
		
		// Prints the returned double value from listAdder method
		System.out.println(String.format("\nInteger list total: %.2f", Program2.listAdder(intArray)));
		System.out.println(String.format("\nDouble list total: %.2f", Program2.listAdder(doubleArray)));
		System.out.println(String.format("\nByte list total: %.2f", Program2.listAdder(byteArray)));

	}
	
	// listAdder Method with wildcard generic that extend Number class
	public static double listAdder(ArrayList<? extends Number> list) {
		double total = 0; // double value to store total
		
		for (Number e : list) {
			System.out.print(e + " "); // loop through and print each element
			
			total += e.doubleValue(); // add elements to the total
		}
		
	    return total; // return total
	}

}
