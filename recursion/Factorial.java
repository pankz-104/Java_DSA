package recursion;

public class Factorial {
	public static int factorial(int n) {
		if (n < 0)
			return n;
		else if(n == 0 || n == 1) 
			return 1;
		else
			return n * factorial(n-1);
	}
	
	public static void main(String [] args) {
		System.out.println(factorial(5));
		int res = factorial(10);
		System.out.println(res);
	}
}
