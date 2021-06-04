package Interfaces;

public interface TestInterface {
	final int a = 10;
	void display();
}

class TestClass implements TestInterface{
	public void display() {
		System.out.println("Interface Demo");
	}
	
	public static void main(String args[]) {
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
	}
}