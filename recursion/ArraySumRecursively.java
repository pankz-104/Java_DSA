package recursion;

public class ArraySumRecursively {
	
	public static int linearSum(int [] data, int n) {
		if (n == 0)
			return 0;
		else
			return linearSum(data, n-1) + data[n-1];
	}
	
	public static int sum(int n) {
		if (n == 1)
			return 1;
		return (sum(n-1)+n);
	}
	
	public static void main(String [] args) {
		int[] arr = {1,2,3,4,5,44,33,22,11,88,77,99};
		int n = arr.length;
		int res = linearSum(arr, n);
		System.out.println(res);
		
		int num = 100;
		System.out.println(sum(num));
	}
}
