package assignment5;

public class Program1 {

	public static void main(String[] args) {
		// create an array containing 8 random numbers from 50 to 100
		// using the createArray function
		int[] a = createArray();
		
		// pass in both the array and the function that sorts the array and returns 
		// the new array with only the highest and lowest values
		printData(a, sortArray(a));
		
	}
	
	// method that creates an array with 8 random numbers between 50 and 100
	public static int[] createArray() {
		// an array of length 8
		int[] array = new int[8];
		
		// Initializes the values inside the array with random values
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(50 + Math.random() * 51);	
		}
		
		// returns the array (note because arrays are reference objects and
		// the sortArray method uses the array created here, it'll be sorted
		// as long as it's passed into the sortArray method)
		return array;	
	}
	
	// method that sorts the array and returns a new array with only the lowest and highest
	// values
	public static int[] sortArray(int[] a) {
		
		// nested for loops that go through each index value and swaps it with the value
		// held in the inner for loop if it is less than the value held in the 
		// outer loop
		for (int i = 0; i < a.length; i++) {		
			for (int j = 0; j < a.length; j++) {
				// holds values in the outer loop
				int tempFirst = a[i];
				// holds value in the inner loop
				int tempSecond = a[j];
				
				// check to see if values need to be swapped
				if (tempFirst < tempSecond) {
					a[i] = tempSecond;
					a[j] = tempFirst;
				}
				
			}
			
		}
		
		// creates a new array with only the highest and lowest values using the 
		// previously sorted array
		int[] newArray = {a[0], a[7]};
		return newArray;	
	}
	
	// method that prints all the data formated as asked by the assignment
	// it takes both arrays as parameters
	public static void printData(int[] a, int[] b) {
		// counter variable to keep track of the total and even values
		int evenCount = 0;
		int total = 0;
				
		// prints the highest and lowest values and title for the whole array
		System.out.printf("The lowest element is: %d\n"
						+ "The highest element is: %d\n"
						+ "Here is the Array\n", b[0], b[1]);
		
		// for loop that prints the entire sorted array seperated by spaces
		// also checks if the index is even and updates the even count while
		// adding up all the values to the total
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
			
			total += a[i];
			
			if (a[i] % 2 == 0) {
				evenCount +=1;
			}
			
		}
		
		// prints the number of even/odd numbers and the total
		System.out.printf("\nEvens: %d, Odds: %d\n" 
						+ "Total: %d", evenCount, 8 - evenCount, total);
	
	}

}
