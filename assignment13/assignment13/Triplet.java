package assignment13;

// 19.5 (Inheritance between generic classes) Create a Triplet class that encapsulates
// three objects of the same data type in a given instance of Triplet.
public class Triplet<T> {
	
	// three private fields of the same time
	private T a, b, c;
	
	// constructor for Triplet object
	public Triplet(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// below is a bunch of getters and setters for triplet object
	public T getA() {
		return this.a;
	}
	
	public void setA(T a){
		this.a = a;
	}
	
	public T getB() {
		return this.b;
	}
	
	public void setB(T b){
		this.b = b;
	}
	
	public T getC() {
		return this.c;
	}
	
	public void setC(T c){
		this.c = c;
	}

}
