package sortingAlgorithms;

// Divide the collection of elements into subsets or partitions 
// Partitions based on pivot 
// Recursively sort partitions using quick sort
// Divide and Conquer approach

public class QuickSort {
	
	public void quickSort(int A[], int low, int high) {
		if(low < high) {
			int pi = partition(A, low, high);
			quickSort(A, low, pi-1);
			quickSort(A, pi+1, high);
		}
	}
	
	public int partition(int A[], int low, int high) {
		int pivot = A[low];
		int i = low;
		int j = high;
		
		do {
			do {
				i = i + 1;
			}while(A[i] <= pivot);
				
			do {
				j = j - 1;
			}while(A[j] > pivot);
			
			if(i < j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}while(i < j);
		int temp = A[low];
		A[low] = A[j];
		A[j] = temp;
		return j;
	}
	
	public void display(int A[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(A[i]+" ");
		}
	}
	
	public static void main(String [] args) {
		
		QuickSort qs = new QuickSort();
		int A[] = new int[] {10, 1, 20, 2, 30, 4, 50, 88};
		int n = A.length;
		System.out.println("Before Sorting");
		qs.display(A, n);
		System.out.println("\nAfter Sorting");
		qs.quickSort(A, 0, n-1);
		qs.display(A, n);
	}
}
