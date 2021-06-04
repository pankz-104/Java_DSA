package Interfaces;

public interface In1 {
	final int a = 10;
	static void display() {
		System.out.println("hello .. lets display");
	}
}

class TestClassIn implements In1{
	public static void main(String [] args) {
		In1.display();
	}
}