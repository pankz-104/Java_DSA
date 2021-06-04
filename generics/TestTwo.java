package generics;

// Generic functions

public class TestTwo {
	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getName() + " = "+element);
	}
	
	// driver method 
	public static void main(String [] args) {
		// calling generic method with Integer argument
		genericDisplay(11);
		
		// calling generic method with String argument
		genericDisplay("generic string");
		
		// calling generic method with double argument
		genericDisplay(1.0);
	}
}
