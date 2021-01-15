package assignment6;

public class Book {

	// static variable to count the number of books
	public static int numBooks = 0;
	
	// private class variables
	private String title;
	private String author;
	private int pages;
	private double price;
	
	// empty constructor
	public Book() {
		numBooks += 1;
	}
	
	// constructor that takes parameters 
	public Book(String title, String author, int pages, double price) {
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
		
		numBooks += 1;
	}
	
	// get title
	public String getTitle() {
		return this.title;
	}	
	// set title
	public void setTitle(String title) {
		this.title = title;
	}
	
	// get author
	public String getAuthor() {
		return this.author;
	}
	// set author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// get pages
	public int getPages() {
		return this.pages;
	}
	// set pages
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	// get price
	public double getPrice() {
		return this.price;
	}
	// set price
	public void setPrice(double price) {
		this.price = price;
	}
	
	// get numBooks
	public int getNumBooks() {
		return numBooks;
	}
	
	// class method that prints variables in this instance of the class
	public String toString() {
		return "Title: " + this.title
			+ " | Author: " + this.author 
			+ " | Pages: " + this.pages 
			+ " | Price: " + String.format("$%.2f", this.price);
	}

}
