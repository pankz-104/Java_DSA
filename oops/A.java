package oops;

public class A {
	class B{
		
	}
	
	static class C{
		
	}
	
	public static void main(String [] args) {
		A objA = new A();
		B objB = objA.new B();
		
//		c objC = new C(); 
		C objC = new A.C();
	}
}
