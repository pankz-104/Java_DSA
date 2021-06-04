package generics;

// Generic class
// use of < > to specify parrameter type 
public class Test <T>{
	// An object of T is declared
	T obj;
	Test(T obj) {this.obj = obj;} // constructor
	public T getObject() {
		return this.obj;
	}
}

// Driver class to test above 
class Main{
	public static void main(String [] args) {
		// instance of integer type 
		Test<Integer> iobj = new Test<Integer>(15);
		System.out.println(iobj.getObject());
		
		// instance of string type
		Test<String> sobj = new Test<String>("Generics Example");
		System.out.println(sobj.getObject());
	}
}
