package assignment14;

public class Employee {
	private String id;
	private String lastName;
	private String firstName;
	private int salary;
	
	// parameterized constructor
	public Employee(String id, String lastName, String firstName, int salary) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public String toString() {
		return String.format("ID: %s:%s, %s, Salary: $%,d", this.id, this.lastName, this.firstName, this.salary);
	}
	
}
