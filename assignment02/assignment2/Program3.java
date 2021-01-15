package assignment2;

import java.util.Scanner;
public class Program3 {

	public static void main(String[] args) {
		// scanner object to store user input
		Scanner input = new Scanner(System.in);
		
		// prints prompt for how many shirts the user wants to order with info on discounts
		System.out.println(
				"Duke shirts sells Java T-Shirts for 24.95 but offeres a discount for ordering in bulk.\n\n" +
				"1 or 2 shirts, no discount and total shipping is $6.99\n" + 
				"3-6 shirts, discount is 10% and total shipping is $5.49\n" + 
				"7-9 shirts, discount is 20% and total shipping is $4.00\n" + 
				"10 or more shirts, discount is 30% and shipping is free\n\n" +
				"How many shirts would you like to order?");
		
		// stores user input
		int numberOfShirts = input.nextInt();
		
		// variables for calculating the price of the order
		double extendedPrice = 0;
		double shippingCost = 0;
		double total = 0;
		
		// if else selection statement to apply the proper calculation associated with the number of shirts ordered
		if (numberOfShirts >= 1 && numberOfShirts <= 2) {
			extendedPrice = 24.95 * numberOfShirts;
			shippingCost = 6.99;			
		}
		else if (numberOfShirts >= 3 && numberOfShirts <= 6) {
			extendedPrice = (24.95 - (24.95 * .1)) * numberOfShirts;
			shippingCost = 5.49;				
		}
		else if (numberOfShirts >= 7 && numberOfShirts <= 9) {
			extendedPrice = (24.95 - (24.95 * .2)) * numberOfShirts;;
			shippingCost = 4;			
		}
		else if (numberOfShirts >= 10) {
			extendedPrice = (24.95 - (24.95 * .3)) * numberOfShirts;;
			shippingCost = 0;				
		}
		
		// total 
		total = extendedPrice + shippingCost;
		
		// print the reciept to the console
		System.out.printf(
				"Extended Price: $%.2f \n" +
				"Shipping Cost: $%.2f \n" +
				"Total: $%.2f", extendedPrice, shippingCost, total);
	}
}
