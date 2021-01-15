package assignment6;

import java.util.Scanner;

public class RegularExpressions {

	public static void main(String[] args) {
		// scanner object
		Scanner input = new Scanner(System.in);
		
		// regular expression to check the password against
		String regex = ("[A-Z]+[a-z]{2}[0-9]{1,2}[A-Z]{0,1}[@#\\$%\\^&]{2}");
		
		// we start with an empty password
		String password = "";
		String message = "Please enter your new password. Make sure it follows the following pattern.";
		
		// keep asking for a new password following the pattern specified until the user enters one
		// used a do while loop so it executes at least once
		do {
			System.out.println(message);
			System.out.print("-1 or more upper case letters\n" 
						   + "-two lower case letters\n" 
						   + "-1 or 2 digits\n"  
						   + "-1 or less upper case letters\n" 
						   + "-any two of this group: @, #, $, %, ^, &\n"
						   + "Password: ");

			password = input.next();
			
			// changes the message if the password was wrong
			if (password.matches(regex) != true) {
				message = "\nSomething went wrong! Please check to make sure your password follows the pattern below exactly.";
			}
		}
		while (password.matches(regex) != true);
		
		// if the user enters a password that follows the pattern the loop will end and a thank you message is 
		// printed to the console
		System.out.println("\nThank you, your password has been changed.");
		
		// closes the scanner object
		input.close();

	}

}
