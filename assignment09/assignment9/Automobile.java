package assignment9;

public class Automobile implements Comparable<Automobile> {
	// private fields
	private String make;
	private String model;
	private int year;
	private double price;
	
	// class constructor 
	public Automobile(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	// getter for make
	public String getMake() {
		return this.make;
	}
	
	// getter for model
	public String getModel() {
		return this.model;
	}
	
	// getter for year
	public int getYear() {
		return this.year;
	}
	
	// getter for price
	public double getPrice() {
		return this.price;
	}
	
	// custom override for the toString method
	public String toString() {
		return "Make: " + this.make 
				+ " | Model: " + this.model
				+ " | Year: " + this.year
				+ " | Price: $" + this.price;
	}
	
	public int compareTo(Automobile other) {
		// returns a negative number if it's less than other.year and a 
		// positive number if it's greater than other.year 
		// 0 is returned if they're equal
		int result = this.year - other.year;
		return result;
	}

}
