package assignment9;

import java.util.Date;

public class Pet {
	// private fields for pet object
	private String name;
	private char gender;
	private Date acquired;
	
	// constructor for pet object
	public Pet(String name, char gender, Date acquired) {
		this.name = name;
		this.gender = gender;
		this.acquired = acquired;
	}
	
	// getter for name
	public String getName() {
		return this.name;
	}
	
	// getter for gender
	public char getGender() {
		return this.gender;
	}
	
	// getter for date Acquired
	public Date getAcquired() {
		return this.acquired;
	}
	
	// sound the pet makes
	public String sound() {
		return "silent";
	}

}
