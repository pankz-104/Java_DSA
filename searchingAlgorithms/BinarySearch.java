package searchingAlgorithms;
// Binary search does not work for an unsorted array
public class BinarySearch {
	int binarySearch(int l,int r, int arr[], int key) {
		if(r >= l) {
			int mid = (l + r)/2;
			
			// if element is present at middle itself
			if(arr[mid]==key) {
				return mid;
			}
			
			// if element is smaller than the middle element
			if(arr[mid] < l)
				return binarySearch(0, mid-1, arr, key);
			
			// if element is present in the right subarray
			return binarySearch(mid+1, r, arr, key);
		}
		// reached at last, i.e. element not present in array
		return -1;
	}
	public static void main(String [] args) {
		BinarySearch bs = new BinarySearch();
//		int [] arr = new int[5];
		int[] arr = {1,4,6,9,10,22};
		int n = arr.length;
		int key = 22;
		int result = bs.binarySearch(0, n-1, arr, key);
		if (result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+result);
	}
}
