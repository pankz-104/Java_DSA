package heapsAndPriorityQueues;

public class HeapSort {
	
	public void heapSort(int A[], int n) {
		Heaps h = new Heaps();
		
		// insertion of elements into a heap
		for(int i=0; i<n; i++) {
			h.insert(A[i]);
		}
		
		// points to the last position 
		int k = n-1;
		
		// deletion of elements
		for(int i=0; i<n; i++) {
			A[k] = h.deleteMax();
			k = k-1;
		}
	}
	
	public void display(int A[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		HeapSort hs = new HeapSort();
		int A[] = {10, 20, 5, 4, 3, 100, 90, 44};
		System.out.println("Initial array :: ");
		hs.display(A, 8);
		hs.heapSort(A, 8);
		System.out.println("Sorted Array");
		hs.display(A, 8);	
	}
}
