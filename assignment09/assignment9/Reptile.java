package assignment9;

import java.util.Date;

public class Reptile extends Pet implements Mobility {
	private String type;
	
	// reptile constructor
	public Reptile(String name, char gender, Date acquired, String type) {
		super(name, gender, acquired);
		
		this.type = type;
	}
	
	// implements Mobility interface
	public String move() {
		return "Crawls or Slithers";
	}
	
	// overrides sound method in parent class Pets
	public String sound() {
		return "Doesn't make much sound";
	}
	
	// overrides toString method
	public String toString() {
		return String.format("Name: %s, Type: %s, Gender: %c, Date Acquired: %tc\nMobility: %s, Sound: %s", 
				this.getName(), this.type, this.getGender(), this.getAcquired(), this.move(), this.sound()); 
	}

}
