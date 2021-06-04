package sortingAlgorithms;

public class BubbleSort {
	
	public void bubbleSort (int A[], int n) {
//		for(int i = n-1; i>0; i--)
//			for(int j=0; j<i; j++) {
//				if(A[j] > A[j+1]) {
//					int temp = A[j];
//					A[j] = A[j+1];
//					A[j+1] = temp;
//				}
//			}
		
		for(int pass = n-1; pass>0; pass--) {
			for(int i=0; i<pass; i++) {
				if(A[i] > A[i+1]) {
					int temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
				}
			}
		}
	}
	
	public void display(int A[], int n) {
		for(int i=0; i<n; i++) 
			System.out.print(A[i]+" ");
	}
	
	public static void main(String [] args) {
		BubbleSort bs = new BubbleSort();
		System.out.println("Before sorting");
		int [] A = new int[] {10, 2, 3, 20, 44};
		int n = A.length;
		bs.display(A, n);
		System.out.println("\nAfter sorting");
		bs.bubbleSort(A, n);
		bs.display(A, n);
	}
}
