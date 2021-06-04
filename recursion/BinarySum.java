package recursion;

public class BinarySum {
	
	public static int binarySum(int[] data, int low, int high) {
		if(low > high)
			return 0;
		else if (low == high)
			return data[low];
		else
		{
			int mid = (low + high)/2;
			return binarySum(data, low, mid) + binarySum(data, mid+1, high); 
		}
	}
	public static void main(String [] args) {
		int[] arr = {0,1,2,3,4,5,5,6,7,8,9,50};
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int sum = binarySum(arr, low, high);
		System.out.println(sum);
	}
}
