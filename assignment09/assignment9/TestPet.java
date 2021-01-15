package assignment9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date; 

public class TestPet {

	public static void main(String[] args) {
		
		// creates a Reptile object
		Reptile snake = new Reptile("Samson", 'M', parseDate("2014-08-11"), "Boa Constrictor");
		
		// prints Reptile object using toString method
		System.out.println(snake.toString());
		
		// creates array of dogs and populates it
		Dog[] dogs = new Dog[4];
		dogs[0] = new Dog("Bailey", 'F', parseDate("2019-05-29"), "German Sheperd", 110);
		dogs[1] = new Dog("Misty", 'F', parseDate("2020-09-20"), "Pomeranian", 5);
		dogs[2] = new Dog("Rocky", 'M', parseDate("2020-08-11"), "Bullmastiff", 120);
		dogs[3] = new Dog("Zack", 'M', parseDate("2020-10-1"), "Shar Pei", 50);
		
		// sorts array of dogs
		Arrays.sort(dogs);
		
		// for each loop to print each element in array dogs
		for (Dog dog : dogs) {
			System.out.println(dog.toString());
		}

	}
	
	
	// method to parse string into a Date object
	public static Date parseDate(String date) {
	     try {
	         return new SimpleDateFormat("yyyy-MM-dd").parse(date);
	     } catch (ParseException e) {
	         return null;
	     }
	  }

}
