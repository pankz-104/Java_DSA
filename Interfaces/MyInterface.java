package Interfaces;

public interface MyInterface {
	public void demo();
	public static void disply() {
		System.out.println(" this is static declaration ");
	}
}

class InterfaceExample{
	public void demo() {
		System.out.println("This is implementation of demo");
	}
	
	public static void main(String []  args) {
		InterfaceExample obj = new InterfaceExample();
		obj.demo();
		MyInterface.disply();
	}
}