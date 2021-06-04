package LinkedList;

public class LinkedList {

	public class Node {
		int element;
		Node next;

		public Node(int e, Node n) {
			element = e;
			next = n;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	// gives the size of the LinkedList
	public int length() {
		return size;
	}

	// returns true if LinkedList is empty
	public boolean isEmpty() {
		return size == 0;
	}

	// add element at beginning of linkedList
	public void addFirst(int e) {
		Node newest = new Node(e, null);
		if (isEmpty()) {
			head = newest;
			tail = newest;
		} else {
			newest.next = head;
			head = newest;
		}
		size = size + 1;
	}

	// add element at last of linkedList
	public void addLast(int e) {
		Node newest = new Node(e, null);

		// if head is empty assign newest to head
		if (isEmpty()) {
			head = newest;
		} else {
			tail.next = newest;
		}
		tail = newest;
		size = size + 1;
	}

	public void addAny(int e, int position) {
		if (position < 0 || position > size) {
			System.out.println(" Invalid position ");
			return;
		}
		if (position == 0) {
			addFirst(e);
			return;
		} else {
			Node newest = new Node(e, null);
			Node p = head;
			int i = 1;
			while (i < position - 1) {
				p = p.next;
				i = i + 1;
			}
			newest.next = p.next;
			p.next = newest;
			size = size + 1;
		}
	}

	public void insertSorted(int e) {
		Node newest = new Node(e, null);
		if (isEmpty()) {
			head = newest;
		} else {
			Node p = head;
			Node q = head;
			while (p != null && p.element < e) {
				q = p;
				p = p.next;
			}
			if (p == head) {
				newest.next = head;
				head = newest;
			} else {
				newest.next = q.next;
				q.next = newest;
			}
		}
		size = size + 1;
	}

	public int removeFirst() {
		// check if linkedList is empty .. else delete the element
		if (isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		int e = head.element;
		head = head.next;
		size = size - 1;
		if (isEmpty()) {
			tail = null;
		}
		return e;
	}

	public int removeLast() {
		// check if linkedList is empty .. else delete the element
		if (isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		Node p = head;
		int i = 1;
		// go upto last but one node
		while (i < length() - 1) {
			p = p.next;
			i = i + 1;
		}
		// make p reference to last to print element,
		tail = p;
		p = p.next;
		int e = p.element;
		tail.next = null;
		size = size - 1;
		return e;
	}

	public int removeAny(int position) {
		Node p = head;
		int i = 1;
		while (i < position - 1) {
			p = p.next;
			i = i + 1;
		}
		int e = p.next.element;
		p.next = p.next.next;
		size = size - 1;
		return e;
	}

	public int search(int key) {
		Node p = head;
		int index = 0;
		while (p != null) {
			if (p.element == key)
				return index;
			p = p.next;
			index = index + 1;
		}
		return key;
	}

	public void reverseLinkedList() {
		Node p = head;
		int i = 1;
		int s = 1;
		int [] arr = new int[20];
		while(p.next != null) {
			p = p.next;
			i = i + 1;
			int e = p.element;
			arr[s] = e;
			s++;
		}
		for(i=arr.length; i>0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public void display() {
		Node p = head;
		while (p != null) {
			System.out.println("->" + p.element);
			p = p.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		System.out.println("size = " + ll.length());
		ll.addLast(40);
		ll.addLast(50);
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		System.out.println(ll.search(50));
		System.out.println("size = " + ll.length());
		ll.display();
		ll.addAny(12, 3);
		ll.addAny(89, 1);
		ll.display();
		System.out.println("Item deleted from first = " + ll.removeFirst());
		System.out.println("Item deleted from last = " + ll.removeLast());
		System.out.println("Item deleted at position 2 = " + ll.removeAny(2));
		System.out.println("Item deleted at position 4 = " + ll.removeAny(4));
		ll.insertSorted(45);
		ll.insertSorted(49);
		ll.insertSorted(12);
		ll.insertSorted(22);
		ll.display();
		ll.reverseLinkedList();
	}
}
