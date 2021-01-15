package assignment8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShipTest {

	public static void main(String[] args) {
		// creating Ship objects with various declared types as requested
		Ship magic = new CruiseShip("Magic", 1998, true, 2700, "Caribbean");
		Ship titanic = new CruiseShip("Titanic", 1912, false, 1300, "Atlantic Ocean");
		Ship elfaro = new CargoShip("El Faro", 1974, false, "containers", 391);
		CargoShip seawise = new CargoShip("Seawise Giant", 1979, false, "crude oil", 564763);
		WarShip indianapolis = new WarShip("USS Indianapolis", 1931, false, "heavy cruiser", "United States Navy");
		
		// storing created ships into an array
		Ship[] fleet = {magic, titanic, elfaro, seawise, indianapolis};
		
		// using a for each loop to print each ships toString() method
		System.out.println("AN ARRAY OF SHIPS IN MAIN");
		for (Ship s : fleet) {
			System.out.println(s.toString());
		}
		
		// converts array to arraylist fleetList, normally Arrays.asList creates and unmodifiable List
		// but new ArrayList<> fixes that
		List<Ship> fleetList = new ArrayList<>(Arrays.asList(fleet));
		
		// calls shipShow and prints the value returned by it		
		System.out.println(shipShow(fleetList)+ " of these ships sank!");
		
	}
	
	public static int shipShow(List<Ship> list) {
		int sunkShips = 0;
		// removes CargoShip declared as type ship 
		list.remove(2);
		
		// creates a new warship
		WarShip john = new WarShip("USS John Warner", 2015, true, "attack submarine", "United States Navy");
		
		// adds warship to the array
		list.add(john);
		
		// loops through array list and calls each objects toString method to be printed
		System.out.println("\nARRAYLIST OF SHIPS FROM A METHOD");
		for(Ship s : list) {
			System.out.println(s.toString());
			
			// checks if ship has sunk or not using isAfloat variable
			if(s.isAfloat() == false) {
				sunkShips++;
			}
		}
		
		// returns the number of sunk ships
		return sunkShips;
	}

}
