package Interfaces;

class A{
	// nested interface 
	public interface NestedIf{
		boolean isNotNegative(int x);
	}
}


// B implements the nested interface 
class B implements A.NestedIf{
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}
}

public class NestedIfDemo {
	public static void main(String [] args) {
		A.NestedIf nif = new B();
		if(nif.isNotNegative(10))
			System.out.println("10 is not negative");
		if(nif.isNotNegative(-20))
			System.out.println("-20 is negative number"); // this won't be displayed
		if(nif.isNotNegative(0))
			System.out.println("0 is neither negative nor positive");
	}
}
