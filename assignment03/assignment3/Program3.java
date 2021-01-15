package assignment3;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		
		// create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// infinite loop
		while (true) {
			
			// calls function 
			multiplicationProblems(input);
			
			// asks if user wants to continue
			System.out.print("Would you like to continue y or n? ");
			String userInput = input.next();
			
			// checks users response and breaks if the answer is n
			if (userInput.equals("n")) {
				System.out.print("Bye!");
				break;		
			}
			
		}
		
	}
	
	// function to handle the logic with generating and checking multiplication problems
	public static void multiplicationProblems(Scanner input) {
		
		// variable to store random single digit integers and the correct answer
		int a = (int)(Math.random() * 9);
		int b = (int)(Math.random() * 9);
		int correctAnswer = a * b;
		
		// asks the question in the console
		System.out.printf("What is %d * %d? ", a, b);
		
		// stores users answer
		int userAnswer = input.nextInt();
		
		// checks if answer is correct or not
		if (userAnswer == correctAnswer) {
			System.out.println("Correct. Nice work!");
		}
		else {
			System.out.printf("Incorrect. The product is %d\n", correctAnswer);
		}
	
	}

}
