package sortingAlgorithms;

// Divide the collection of elements into smaller subsets 
// Recursively sort the subsets 
// Combine or merge the result into a solution 
// Divide and Conquer approach

public class MergeSort {

	// break the array into smaller array
	public void mergeSort(int A[], int l, int r) {
		if (l < r) {
			int mid = (l + r) / 2;
			mergeSort(A, l, mid);
			mergeSort(A, mid + 1, r);
			merge(A, l, mid, r);
		}
	}

	// for merging the elements in sorted order
	public void merge(int A[], int l, int mid, int r) {
		int i = l;
		int j = mid + 1;
		int k = l;
		int[] B = new int[A.length];
		// comparing two subsets
		while (i <= mid && j <= r) {
			if (A[i] < A[j]) {
				B[k] = A[i];
				i = i + 1;
			} else {
				B[k] = A[j];
				j = j + 1;
			}
			k = k + 1;
		}
		// store remaining elements in left part to array B
		while (i <= mid) {
			B[k] = A[i];
			i = i + 1;
			k = k + 1;
		}

		// store remaining elements in right part to array B
		while (j <= r) {
			B[k] = A[j];
			j = j + 1;
			k = k + 1;
		}

		// copying the elements from sorted array B to array A
		for (int m = l; m < r + 1; m++)
			A[m] = B[m];
	}

	public void display(int A[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int A[] = new int[] { 10, 2, 20, 3, 40, 4, 40, 5, 50 };
		int n = A.length;
		System.out.println("Before Sorting");
		ms.display(A, n);
		System.out.println("\nAfter sorting");
		ms.mergeSort(A, 0, n - 1);
		ms.display(A, n);

	}
}
