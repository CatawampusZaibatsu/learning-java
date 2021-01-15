package assignment8;

public class WarShip extends Ship{
	// private fields for WarShip class
	private String type;
	private String nation;
	
	// constructor for WarShip class, super calls constructor inside Ship class
	public WarShip(String name, int year, Boolean isAfloat, String type, String nation) {
		super(name, year, isAfloat);
		this.type = type;
		this.nation = nation;
	}
	
	// override method for toString for the WarShip class
	public String toString() {
		return "Ship Name: " + this.getName()
				+ ", Launch Year: " + this.getYear()
				+ ", Is Afloat: " + this.isAfloat()
				+ "\nType: " + this.type
				+ ", Operated by: " + this.nation;
	}

}
