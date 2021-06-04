package sortingAlgorithms;

import java.lang.Math;
public class RadixSort {

	public void radixSort(int A[], int n) {
		int maxelement = max(A, n);
		int digits = noOfDigits(maxelement, n);
	
		for (int i = 0; i < digits; i++) {
			int [] bins= new int[10];
			for (int j = 0; j < n; j++) {
				int e = (int) ((A[j] / Math.pow(10, i)) % 10);
				bins[e].append(A[j]);
			}
			int k = 0;
			for (int x = 0; x < 10; x++) {
				A[k] = bins[e].remove();
				k = k + 1;
			}
		}
	}

	public int max(int A[], int n) {
		int temp = 0;
		for (int i = 0; i < A.length; i++)
			if (A[i] > temp)
				temp = A[i];
		return temp;
	}

	public int noOfDigits(int maxelement, int n) {
		int digits = 0;
		while(n != 0) {
			n = n / 10;
			digits++;
		}
		return digits;
	}

	public void display(int A[], int n) {
		for (int i = 0; i < n; i++)
			System.out.println(A[i] + " ");
	}

	public static void main(String[] args) {
		RadixSort rs = new RadixSort();
		int A[] = new int[] { 10, 1, 20, 3, 4567, 789, 1234, 456 };
		int n = A.length;
		System.out.println("Before Sorting");
		rs.display(A, n);
		System.out.println("After Sorting");
		rs.radixSort(A, n);
		rs.display(A, n);
	}
}
