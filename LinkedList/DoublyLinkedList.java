package LinkedList;

public class DoublyLinkedList {
	
	class Node{
		int element;
		Node prev;
		Node next;
		Node(int e, Node p, Node n){
			element = e;
			prev = p;
			next = n;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	DoublyLinkedList(){
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
		Node newest = new Node(e, null, null);
		if(isEmpty()) {
			head = newest;
			tail = newest;
		}
		else {
			tail.next = newest;
			newest.prev = tail;
			tail = newest;
		}
		size = size + 1;
	}
	
	public void addFirst(int e) {
		Node newest = new Node(e, null, null);
		if(isEmpty()) {
			head = newest;
			tail = newest;
		}
		else {
			newest.next = head;
			head.prev = newest;
			head = newest;
		}
		size = size + 1;
	}
	
	public void addAny(int e, int pos) {
		Node newest = new Node(e, null, null);
		Node p = head;
		Node q = head;
		int i = 1;
		if(isEmpty()) {
			head = newest; 
			tail = newest;
		}
		else {
			while(i < pos - 1) {
				p = p.next;
				q = p.next;
				i = i + 1;
			}
			newest.next = p.next;
			p.next = newest;
			newest.prev = q.prev;
			q.prev = newest;
		}
		size = size + 1;
	}
	
	public int removeFirst() {
		Node p = head;
		if(isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		int e = p.element;
		head = head.next;
		size = size - 1;
		if(isEmpty()) {
			tail = null;
		}
		else {
			head.prev = null;
		}
		return e;
	}
	
	public int removeLast() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		int e = tail.element;
		tail = tail.prev;
		tail.next = null;
		size = size - 1;
		return e;
	}
	
	public int removeAny(int pos) {
		Node p = head;
		if(pos < 0 || pos > size) {
			System.out.println("Invalid operation");
			return -1;
		}
		else {
			int i = 1;
			while(i < pos - 1) {
				p = p.next;
				i = i + 1;
			}
			int e = p.next.element;
			p.next = p.next.next;
			p.next.prev = p;
			size = size - 1;
			return e;
		}
	}
	
	public void display() {
		Node p = head;
		while (p!=null){
			System.out.println("-->"+p.element);
			p = p.next;
		}
	}
	
	public static void main(String [] args) {
		DoublyLinkedList ll = new DoublyLinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		ll.addAny(15, 3);
		ll.addAny(16, 5);
		ll.addAny(17, 8);
		System.out.println("First deleted element is :: "+ll.removeFirst());
		System.out.println("First deleted element is :: "+ll.removeFirst());
		System.out.println("First deleted element is :: "+ll.removeFirst());
		System.out.println("Last deleted element is :: "+ll.removeLast());
		System.out.println("Last deleted element is :: "+ll.removeLast());
		System.out.println("ELement deleted at position 2 :: "+ll.removeAny(2));
		System.out.println("ELement deleted at positoin 5 :: "+ll.removeAny(5));
		ll.display();
	}
}
