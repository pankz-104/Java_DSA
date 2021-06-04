package recursion;

public class IterativeRecursiveSum {
	
	public static void calculateIterative(int n) {
		while (n  > 0) {
			int k = n * n;
			System.out.print(k+" ");
			n = n - 1;
		}
	}
	
	public static void calculateRecursive(int n) {
		if (n > 0) {
			int k = n * n;
			System.out.print("\n"+k+" ");
			calculateRecursive(n-1);
		}
	}
	
	public static void main(String [] args) {
		calculateIterative(10);
		calculateRecursive(10);
	}
}
