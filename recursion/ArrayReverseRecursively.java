package recursion;

public class ArrayReverseRecursively {
	
	public static void reverseArray(int [] data, int low, int high) {
		if(low < high) {
			int temp = data[low];
			data[low] = data[high];
			data[high] = temp;
			reverseArray(data, low+1, high-1);
		}
	}
	public static void main(String [] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		int low = 0;
		int n = arr.length;
		int high = n-1;
		reverseArray(arr, low, high);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
