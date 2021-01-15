package assignment2;

public class Program2 {

	public static void main(String[] args) {
		// generate two random numbers between 25 and 50
		int num1 = (int) (25 + Math.random() * 51);
		int num2 = (int) (25 + Math.random() * 51);
		
		// print first and second number to the console
		System.out.println("First Number: " + num1);
		System.out.println("Second Number: " + num2);
		
		// find the difference between the two numbers regardless of which one is a higher value
		if (num1 >= num2) {
			System.out.printf("There is a difference of: " + (num1 - num2));
		}
		else {
			System.out.printf("There is a difference of: " + (num2 - num1));
		}
	}
}
