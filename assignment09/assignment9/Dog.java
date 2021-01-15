package assignment9;

import java.util.Date;

// inherits Pet class while implementing the Comparable & Mobility interfaces
public class Dog extends Pet implements Comparable<Dog>, Mobility {
	// private fields
	private String breed;
	private int weight;
	
	// Constructor for the dog class
	public Dog(String name, char gender, Date acquired, String breed, int weight) {
		// passes arguments to parent constructor
		super(name, gender, acquired);
		
		// passes values to private field from the constructor
		this.breed = breed;
		this.weight = weight;	
	}
	
	// getter for breed
	public String getBreed() {
		return this.breed;
	}
	
	// getter for weight
	public int getWeight() {
		return this.weight;
	}
	
	// implements mobility interface
	public String move() {
		return "Walks on four legs";
	}
	
	// overrides sound() method in pet class
	public String sound() {
		return "Barks";
	}
	
	// overrides toString method
	public String toString() {
		return String.format("Name: %s, Breed: %s, Gender: %c, Weight: %dlbs, Date Acquired: %tc\nMobility: %s, Sound: %s", 
				this.getName(), this.breed, this.getGender(), this.weight, this.getAcquired(), this.move(), this.sound()); 
	}
	
	// implements Comparable compareTo() method
	public int compareTo(Dog other) {
		return this.weight - other.weight;
	}
	
}
