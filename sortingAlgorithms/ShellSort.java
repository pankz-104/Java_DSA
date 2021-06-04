package sortingAlgorithms;

// selects an element and compare element after a gap
// similar to insertion sort
// inserted selected element from gap at its proper position

public class ShellSort {
	
	public void shellSort(int A[], int n) {
		int gap = n / 2;
		while(gap > 0) {
			int i = gap;
			while(i < n) {
				int temp = A[i];
				int j = i - gap;
				while(j >= 0 && A[j] > temp) {
					A[j+gap] = A[j];
					j = j - gap;
				}
				A[j + gap] = temp;
				i = i + 1;
			}
			gap = gap / 2;
		}
	}
	
	public void display(int A[], int n) {
		for(int i = 0; i<n; i++) {
			System.out.print(A[i]+" ");
		}
	}
	
	public static void main(String [] args) {
		ShellSort ss = new ShellSort();
		int A[] = new int[] { 10,2,3,5,22,100, 90};
		int n = A.length;
		System.out.println("Before sorting");
		ss.display(A, n);
		System.out.println("\nAfter sorting");
		ss.shellSort(A, n);
		ss.display(A, n);
	}
}
