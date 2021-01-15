package assignment9;

import java.util.ArrayList;
import java.util.Collections;

public class TestAutos {

	public static void main(String[] args) {
		
		// creates ArrayList that holds Automobile object
		ArrayList<Automobile> cars = new ArrayList<Automobile>();
		
		// adds five Automobile objects
		cars.add(new Automobile("Ford", "Focus", 2013, 29999.99));
		cars.add(new Automobile("Volkwagen", "Bus", 1960, 10000.00));
		cars.add(new Automobile("Chevrolet", "El Camino", 1987, 15000.00));
		cars.add(new Automobile("Ford", "Ranchero", 1969, 20000.00));
		cars.add(new Automobile("Lincoln", "Futura", 1966, 100000.00));
		
		System.out.print("Unsorted ArrayList of Automobile Objects:\n");
		// prints objects to console using toString method
		for(int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).toString());
		}
		
		// collections.sort to sort the ArrayList using the implemented comparable class
		Collections.sort(cars);
		
		// title to separate the two lists
		System.out.println("\nSorted ArrayList of Automobiles Objects by year:");
		
		// for each loop that prints each element in the ArrayList using the toString method
		for (Automobile car : cars) {
			System.out.println(car.toString());
		}

	}

}
