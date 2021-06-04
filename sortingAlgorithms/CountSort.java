package sortingAlgorithms;

// Index based sorting

public class CountSort {
	public void countSort(int A[], int n) {
		int maxsize = max(A);
		int [] carray = new int[maxsize+1];
		for(int i=0; i<n; i++)
			carray[A[i]] = carray[A[i]] + 1;
		int i=0;
		int j=0;
		while (i < maxsize + 1){
			if(carray[i] > 0) {
				A[j] = i;
				j = j + 1;
				carray[i] = carray[i] - 1;
			}
			else
				i = i + 1;
		}
	}
	
	public int max(int A[]) {
		int temp=0;
		for(int i=0; i<A.length; i++)
			if(A[i] > temp)
				temp = A[i];
		return temp;
	}
	
	public void display(int A[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	public static void main(String [] args) {
		
		CountSort cs = new CountSort();
		int A[] = new int[] {10, 1, 20, 2, 30, 4, 4, 4 ,4 ,4, 4};
		int n = A.length;
		System.out.println("Before sorting :: ");
		cs.display(A, n);
		System.out.println("\nAfter sorting :: ");
		cs.countSort(A, n);
		cs.display(A, n);
	}
}
