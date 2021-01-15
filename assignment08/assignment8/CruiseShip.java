package assignment8;

public class CruiseShip extends Ship {
	// private fields for CruiseShip
	private int passengers;
	private String zone;
	
	// constructor for CruiseShip, super keyword calls constructor in the Ship class 
	public CruiseShip(String name, int year, Boolean isAfloat, int passengers, String zone){
		super(name, year, isAfloat);
		this.passengers = passengers;
		this.zone = zone;	
	}
	
	// get method for passengers field
	public int getPassengers() {
		return this.passengers;
	}
	
	// get method for zone field
	public String getZone() {
		return this.zone;
	}
	
	// override for toString method inside CruiseShip class
	public String toString() {
		return "Ship Name: " + this.getName()
				+ ", Launch Year: " + this.getYear()
				+ ", Is Afloat: " + this.isAfloat()
				+ "\nPassenger Capacity: " + this.passengers
				+ ", Zone: " + this.zone;
	}

}
