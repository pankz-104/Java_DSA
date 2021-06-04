package heapsAndPriorityQueues;

public class Heaps {

	private int data[];
	private int maxsize;
	private int csize;

	public Heaps() {
		maxsize = 10;
		// data array is initialized to maxsize
		data = new int[maxsize];
		// initial size of an heap
		csize = 0;

		// initializing max size as -1 for data in array
		for (int i = 0; i < data.length; i++) {
			data[i] = -1;
		}
	}

	// length of array
	public int length() {
		return csize;
	}

	// check if array is empty
	public boolean isEmpty() {
		return csize == 0; // returns true if zero else false
	}

	public void insert(int e) {
		// check if heap is full or not
		if (csize == maxsize) {
			System.out.println("No space");
			return;
		}

		csize = csize + 1;
		int hi = csize; // as array based representation starts from 1

		while (hi > 1 && e > data[hi / 2]) {
			data[hi] = data[hi / 2]; // assigning parent to the child
			hi = hi / 2; // index of parent to child
		}
		data[hi] = e;
	}

	// return element at top of heap
	public int max() {
		if (isEmpty()) {
			System.out.println("Heap is empty");
			return -1;
		}
		return data[1];
	}

	// display the elements in the heap
	public void display() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	public int deleteMax() {

		// check if heap contains element for deletion
		if (isEmpty()) {
			System.out.println("Heap is empty");
			return -1;
		}

		int e = data[1]; // points to the root
		data[1] = data[csize]; // points to the last element of tree
		data[csize] = -1; // specify the last term as blank
		csize = csize - 1; // reduce size after deletion
		int i = 1; // points parent or root node position
		int j = i * 2; // points next node to root node

		while (j <= csize) { // continue till last element
			if (data[j] < data[j + 1]) // compare data of siblings to find greater one
				j = j + 1;

			// if data at child position is greater than parent position then swap child and
			// parent node data
			if (data[i] < data[j]) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;

				// continue to check for further larger values in child node
				i = j;
				j = i * 2;
			} else
				break;
		}
		return e; 	// return initial deleted element
	}

	public static void main(String[] args) {
		Heaps heap = new Heaps();
		heap.insert(10);
		heap.insert(30);
		heap.insert(21);
		heap.insert(2);
		heap.insert(25);
		heap.insert(104);
		heap.insert(100);
		heap.display();
		System.out.println("Element deleted " + heap.deleteMax());
		System.out.println("Element deleted " + heap.deleteMax());
		System.out.println("Element deleted " + heap.deleteMax());
		heap.display();
	}
}
