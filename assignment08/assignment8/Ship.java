package assignment8;

public class Ship {
	// private fields of class ship
	private String name;
	private int year;
	private Boolean isAfloat;
	
	// constructor for class ship
	public Ship(String name, int year, Boolean isAfloat) {
		this.name = name;
		this.year = year;
		this.isAfloat = isAfloat;
		
	}
	
	// get method for isAfloat field
	public Boolean isAfloat() {
		return this.isAfloat;
	}
	
	// set method for isAfloat field
	public void setAfloat(Boolean isAfloat) {
		this.isAfloat = isAfloat;
	}
	
	// get method for name field
	public String getName() {
		return this.name;
	}
	
	// get method for year field
	public int getYear() {
		return this.year;
	}
	
	// overide method for toString
	public String toString() {
		return "Ship Name: " + this.name
				+ ", Year Launched: " + this.year
				+ ", Is Afloat: " + this.isAfloat;
	}

}
