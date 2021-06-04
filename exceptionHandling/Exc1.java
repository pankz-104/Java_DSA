package exceptionHandling;

public class Exc1 {
	public static void main(String [] args) {
		int d,a;
		try {
			d = 0; 
			a = 10/d;
			System.out.println("eror code ,, will not be printed");
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero");
		}
		System.out.println("After catch");
	}
}
