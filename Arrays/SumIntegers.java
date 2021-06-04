package Arrays;

public class SumIntegers {
	public static void main(String [] args) {
		int total = 0;
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		for(int i=0; i<n; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}
}
