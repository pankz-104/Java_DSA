package sortingAlgorithms;

// select one element at a time from left of the collection
// insert the element at proper position
// after insertion ever element to its left will be sorted

public class InsertionSort {
	public void insertionSort(int A[], int n) {
		for(int i=0; i<n; i++) {
			int temp = A[i];
			int position = i;
			
			while(position > 0 && A[position - 1] > temp) {
				A[position] = A[position - 1];
				position = position - 1;
			}
			A[position] = temp;
		}
	}
	
	public void display(int A[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(A[i] + " ");
//		System.out.println();
		}
	}
	
	public static void main(String [] args) {
		InsertionSort ii = new InsertionSort();
		int A[] = new int[] {10, 6, 7, 8, 2, 3, 10};
		int n = A.length;
		System.out.println("Before sorting");
		ii.display(A, n);
		ii.insertionSort(A, n);
		System.out.println("\n After sorting");
		ii.display(A, n);
	}
}




















