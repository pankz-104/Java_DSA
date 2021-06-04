package Interfaces;

public interface In2 {
	final int a = 10;
	default void display() {
		System.out.println("default value .. hello");
	}
}

class TestClassIn2 implements In2{
	public static void main(String [] args) {
		TestClassIn2 t = new TestClassIn2();
		t.display();
	}
}
