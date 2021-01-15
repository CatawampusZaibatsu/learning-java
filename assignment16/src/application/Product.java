package application;

public class Product {
	private String vin;
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;
	
	public Product(String vin, String make, String model, int year, String color, double price) {
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;		
	}

	public String getVin() {
		return this.vin;
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return this.model;
	}

	public int getYear() {
		return this.year;
	}

	public String getColor() {
		return this.color;
	}

	public double getPrice() {
		return this.price;
	}

}
