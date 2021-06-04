package generics;

// Generic class 
// multiple parameters in Java Generics 
public class TestOne <T, U>{
	T obj1;
	U obj2;
	
	// constructor 
	TestOne(T obj1, U obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	// to print values of T and U 
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
	public static void main(String [] args) {
		TestOne< String, Integer> obj = new TestOne<String, Integer>("Generic", 104);
		obj.print();
	}
}
