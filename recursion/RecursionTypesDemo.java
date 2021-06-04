package recursion;

public class RecursionTypesDemo {
	
	public void calculate(int n) {
		if(n > 0) {
			int k = n * n;
			System.out.println(k);
			calculate(n-1);
		}
	}
	
	// Head Recursion Demo
	public void sum(int n) {
		if(n > 0) {
			sum(n-1);
			int k = n * n;
			System.out.println(k);
		}
	}
	
	// Tree recursion Demo
	public void TreeSum(int n) {
		if(n > 0) {
			TreeSum(n-1);
			int k = n * n;
			System.out.println(k);
			TreeSum(n-1);
		}
	}
	
	public static void main(String [] args) {
		RecursionTypesDemo r = new RecursionTypesDemo();
//		r.calculate(4);
//		r.sum(4);
		r.TreeSum(4);
	}
}
