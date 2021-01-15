package assignment3;

public class Program2 {

	public static void main(String[] args) {
		
		// prints the header for the table
		System.out.printf("%10s | %-10s\n", "Fahrenheit", "Celsius");
		System.out.println("======================");
		
		// loops through temps, converts values to Celsius, and prints them
		for (double t = -40; t <= 120; t += 5) {
			System.out.printf("%8.2f F | %6.2f C\n", t, ((t-32) * 5/9));
		}
		
	}

}
