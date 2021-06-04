package searchingAlgorithms;

public class LinearSearch {
	int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			// comparing each value in array with the key element
			if (arr[i] == key)
				return i;
		}
		// At the end ,, element not found in an array
		return -1;
	}

	public static void main(String[] args) {
		LinearSearch ob = new LinearSearch();
		int[] arr = { 1, 9, 8, 4, 5, 22, 76, 111 };
		int n = arr.length;
		int key = 111;
		int result = ob.linearSearch(arr, key);
		if (result == -1)
			System.out.println("Element not present in array");
		else
			System.out.println("Element found at :: " + result);
	}
}
