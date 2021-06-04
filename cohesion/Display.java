package cohesion;


/*
 *  contains many classes for various purposes
 *  so called highly chohesive
 *  class with less classes and more load to same class
 *  so called less cohesive
 */
class A{
	public void wakeUp() {
		System.out.println("I woke up");
	}
}

class B{
	public void clean() {
		System.out.println("I did brush, went bathroom");
	}
}

class C{
	public void eat() {
		System.out.println("I had breakfasst");
	}
}

class D{
	public void sleep() {
		System.out.println("I slept");
	}
}

public class Display {
	public static void main(String [] args) {
		A a = new A();
		a.wakeUp();
		
		B b = new B();
		b.clean();
		
		C c = new C();
		c.eat();
		
		D d = new D();
		d.sleep();
	}
}
