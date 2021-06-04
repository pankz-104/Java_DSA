package sortingAlgorithms;

// select the min element from the collection
// place the selected element in appropriate position 

public class SelectionDemo {
	public void selectionSort(int A[],int n) {
		for(int i=0; i<n; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) 
				if(A[j] < A[min]) 
					min = j;
			
				int temp = A[i];
				A[i] = A[min];
				A[min] = temp;
		}
	}
	
	public void display(int A[], int n) {
		for(int k = 0;k<n; k++) 
			System.out.print(A[k]+" ");
		System.out.println();
	}

	public static void main(String [] args) {
		SelectionDemo ss = new SelectionDemo();
		int A[] = new int[] {10, 8, 5, 20, 33, 78};
		int n = A.length;
		System.out.println("Before Sorting :: ");
		ss.display(A, n);
		System.out.println("After sorting");
		ss.selectionSort(A, n);
		ss.display(A, n);
	}
}
