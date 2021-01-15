package assignment8;

public class CargoShip extends Ship{
	// private fields for CargoShip class
	private String cargo;
	private int capacity;
	
	// constructor for CargoShip class, super calls constructor inside Ship class
	public CargoShip(String name, int year, Boolean isAfloat, String cargo, int capacity) {
		super(name, year, isAfloat);
		this.cargo = cargo;
		this.capacity = capacity;
	}
	
	// get method for capacity field of CargoShip
	public int getCapacity() {
		return this.capacity;
	}
	
	// override method for toString for the WarShip class
	public String toString() {
		return "Ship Name: " + this.getName()
				+ ", Launch Year: " + this.getYear()
				+ ", Is Afloat: " + this.isAfloat()
				+ "\nCapacity of " + this.cargo + " is: " + this.capacity;
	}
	

}
