package recursion;

public class BinarySearch {
	
	public static int BinarySearching(int arr[],int key,int low,int high) {
		
		if (low > high)
			return -1;
		
		else {
			int mid = (low + high)/2;
			
			if (key == arr[mid])
				return mid;
			
			else if (key < arr[mid])
				return BinarySearching(arr,key, low, mid-1);
			
			else 
				return BinarySearching(arr, key, mid+1, high);
		}
	}
	public static void main(String [] args) {
		int [] arr = {1,2,3,4,6,7,8,99,105, 111, 120};
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int key = 120;
		int res = BinarySearching(arr, key, low, high);
		if(res == -1) {
			System.out.println("element not found");
		}
		else 
			System.out.println("Element found at index "+res);
	}
}
