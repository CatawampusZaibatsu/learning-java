package assignment6;

public class TestBook {

	public static void main(String[] args) {
		
		// create an array of six book objects
		Book[] books = new Book[6];
		
		// initialize the books using the appropriate constructors required by the assignment
		books[0] = new Book("Neuromancer", "William Gibson", 271, 10.99);
		books[1] = new Book("Dune", "Frank Herbert", 412, 34.45);
		books[2] = new Book("A Scanner Darkly", "Philip K. Dick", 220, 9.99);
		books[3] = new Book("Sandman", "Niel Gaiman", 240, 19.99);
		books[4] = new Book();
		books[5] = new Book();
		
		// foreach loop that goes through the array and prints the books
		for(Book book : books) {
			System.out.println(book.toString());
		}
		
		// calls the finishArray method passing in the array of books as an argument
		finishArray(books);
		
		// runs the reduceBooks method and stores the value it returns
		Book mostExpensive = reduceBooks(books);
			
		// foreach loop after finishArray has discounted prices
		System.out.println("\n\nBooks after completing library and 40% discount.");
		for(Book book : books) {
			System.out.println(book.toString());
		}
		
		// prints the most expensive book returned by reduceBooks()
		System.out.println("\n\nHere is the most expensive book after the discounts.");
		System.out.println(mostExpensive.toString());
		
		// prints the number of books created
		System.out.printf("Size of library: %d", books[0].getNumBooks());
				
	}
	
	// method finishing the last two objects in the array
	public static void finishArray(Book[] books) {
		// sets the fifth book in the array using the set methods created for each instance variable
		books[4].setTitle("Foundation");
		books[4].setAuthor("Isaac Asimov");
		books[4].setPages(255);
		books[4].setPrice(24.00);
		
		// sets the sixth book in the array using the set methods created for each instance variable 
		books[5].setTitle("Hitch Hikers Guide to the Galaxy");
		books[5].setAuthor("Douglas Adams");
		books[5].setPages(215);
		books[5].setPrice(15.45);	

}
	
	// reduces the price of books by 40% and returns most expensive book
	public static Book reduceBooks(Book[] books) {
		
		// loop through the array of books and reduce the price of each by 40%
		for (Book book : books) {
			book.setPrice(book.getPrice() - book.getPrice() * .4);
		}
		
		// place holder to find the most expensive book
		Book mostExpensive = books[0];
		
		// loop through each book (after discount) and store the most expensive book in the variable 
		// created above
		for (Book book : books) {
			if (book.getPrice() > mostExpensive.getPrice()) {
				mostExpensive = book;
			}
			
		}
		
		// return most expensive book
		return mostExpensive;
		
	}
		
}