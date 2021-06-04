package operatorsInJava;

public class ArithmeticOperator {
	public static void main(String [] args) {
		int a = 22;
		int b = 33;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int c = a * a + 2 * a * a + b * b;
		System.out.println(c);
		
		int d = a++;
		System.out.println(d+" "+a);
		
		int e = ++a;
		System.out.println(e);
	}
}
