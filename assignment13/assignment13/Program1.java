package assignment13;

public class Program1 {

	public static void main(String[] args) {
		// Lists of various types
		Integer[] integers = {1,2,3,4,5};
		String[] strings = {"hey", "this", "is", "a", "list", "of", "strings"};
		Double[] doubles = {6.9, 7.8, 2.5, 4.20};
		
		// calls to genericTypeDemo method with each list as an arg
		Program1.<Integer>genericTypeDemo(integers);
		Program1.<String>genericTypeDemo(strings);
		Program1.<Double>genericTypeDemo(doubles);

	}
	
	public static <E> void genericTypeDemo(E[] list){
		// loops through list and prints each value
		System.out.println(String.format("Here is a %s array", list[0].getClass().getSimpleName()));
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println(String.format("\nThat array held %d elements", list.length));
		
	}

}
