package LinkedList;

public class CircularLinkedList {
	
	public class Node{
		int element;
		Node next;
		
		Node(int e, Node n){
			element = e;
			next = n;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	CircularLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public int length() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addLast(int e) {
		Node newest = new Node(e, null);
		if(isEmpty()) {
			newest.next = newest;
			head = newest;
			tail = newest;
		}
		else {
			newest.next = tail.next;
			tail.next = newest;
		}
		tail = newest;
		size = size + 1;
	}
	
	public void addFirst(int e) {
		Node newest = new Node(e, null);
		if(isEmpty()) {
			newest.next = newest;
			head = newest;
			tail = newest;
		}
		else {
			newest.next = tail.next;
			tail.next = newest;
			head = newest;
		}
//		else {
//			tail.next = newest;
//			newest.next = head;
//			head = newest;
//		}
		size = size + 1;
	}
	
	public void addAny(int e, int pos) {
		Node newest = new Node(e, null);
		Node p = head;
		int i = 1;
		if(pos < 0 || pos > size) {
			System.out.println("Invalid LinkedList");
			return;
		}
		else {
			while(i < pos - 1) {
				p = p.next;
				i = i + 1;
			}
			newest.next = p.next;
			p.next = newest;
		}
		size = size + 1;
	}
	
	public int deleteFirst() {
		if(isEmpty()) {
			System.out.println("Cirular List is empty");
			return -1;
		}
		int e = head.element;
		tail.next = head.next;
		head = head.next;
		size = size - 1;
		if(isEmpty()) {
			head = null;
			tail = null;
		}
		return e;
	}
	
	public int deleteLast() {
		if(isEmpty()) {
			System.out.println("Circular List is empty");
			return -1;
		}
		Node p = head;
		int i = 1;
		while(i < length() - 1) {
			p = p.next;
			i = i + 1;
		}
		int e = p.next.element;
		p.next = head;
		tail = p;
		if(isEmpty()) {
			head = null;
			tail = null;
		}
		size = size - 1;
		return e;
	}
	
	public int removeAny(int pos) {
		if(isEmpty()) {
			System.out.println("Circular List is empty");
			return -1;
		}
		Node p = head;
		int i = 1;
		while(i < pos - 1) {
			p = p.next;
			i = i + 1;
		}
		int e = p.next.element;
		p.next = p.next.next;
		size = size - 1;
		if(isEmpty()) {
			head = null;
			tail = null;
		}
		return e;
	}
	
	public void display() {
		Node p = head;
		int i = 0;
		while(i < length()) {
			System.out.println("-->"+p.element);
			p = p.next;
			i = i + 1;
		}
	}
	
	public static void main(String [] args) {
		CircularLinkedList ll = new CircularLinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(25);
		ll.addFirst(1);
		ll.addFirst(3);
		ll.addFirst(6);
		ll.addAny(12, 3);
		ll.addAny(22, 5);
//		System.out.println("First deleted element is :: "+ll.deleteFirst());
//		System.out.println("First deleted element is :: "+ll.deleteFirst());
//		System.out.println("Last deleted element is :: "+ll.deleteLast());
//		System.out.println("Last deleted element is :: "+ll.deleteLast());
//		System.out.println("Last deleted element is :: "+ll.deleteLast());
		System.out.println("Element deleted at position 2 :: "+ll.removeAny(2));
		System.out.println("Element deleted at position 4 :: "+ll.removeAny(4));
		ll.display();
	}
}
