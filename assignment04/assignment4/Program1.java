package assignment4;

public class Program1 {

	public static void main(String[] args) {		
		// prints the header for the table formated the same way the data below is
		System.out.printf("%-4s %8s %8s\n", "SEC", "METERS", "FEET");
		
		// for loop starting at the first second and going up to ten
		for (int i = 1; i <= 10; i++) {
			// variables to store the returned value from the two methods
			double meters = metersPerSecond(i);
			double feet = metersToFeet(meters);
			
			// prints data formated in a table creating a new line each loop
			System.out.printf("%-4d %8.2f %8.2f\n", i, meters, feet);
		}

	}
	
	// method calculating meters traveled after being passed the seconds that have passed
	static double metersPerSecond(int sec) {
		double distanceObjectFell = .5 * 9.8 * Math.pow((double) sec, 2);
		return distanceObjectFell;
	}
	
	// method converting meters to feet after being passed meters as an argument
	static double metersToFeet(double meters) {
		double feet = meters * 3.281;
		return feet;
	}
	
}
