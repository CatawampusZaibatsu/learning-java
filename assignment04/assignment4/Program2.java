package assignment4;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// counter for number of times the coin lands on heads or tails
		int heads = 0, tails = 0;
		
		// prompt user for number of times to flip coin and store in variable
		System.out.print("How many times should I toss the coin? ");
		int numberOfTosses = input.nextInt();
		
		// for loop using user input to set the number of loops
		for(int i = 1; i <= numberOfTosses; i++) {
			// stores the result of this toss
			String result = coinToss();
			
			// checks to see if result is heads or tails, updates counter accordingly 
			if (result.contentEquals("heads")) {
				heads += 1;
			}
			else if (result.contentEquals("tails")) {
				tails += 1;
			}
			
		}
		
		// prints the results of the coin flips in the console
		System.out.printf("Result of %d tosses.\n", numberOfTosses);
		System.out.printf("Heads: %d\nTails: %d", heads, tails);
		
	}
	
	// method returning either the string "heads" or "tails"
	static String coinToss() {
		// random number between 0.0 to 1
		double coinFlip = Math.random();
		
		// string to store the result of the coin toss
		String result;
		
		// if the random number is greater than .5 the coin is heads and vic-versa
		if (coinFlip > .5) {
			result = "heads";
		}
		else {
			result = "tails";
		}
		
		// returns the string "heads" or "tails" depending on the outcome of the coin toss
		return result;
		
	}

}
