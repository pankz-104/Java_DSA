package queue;

public class DoubleEndedQueue {
	class Node{
		int element;
		Node next;
		
		Node(int e, Node n){
			element = e;
			next = n;
		}
	}
	
	private Node front;
	private Node rear;
	private int size;
	
	DoubleEndedQueue(){
		front = null;
		rear = null;
		size = 0;
	}
	
	public int length() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addlast(int e) {
		Node newest = new Node(e, null);
		if(isEmpty()) {
			front = newest;
		}else 
			rear.next = newest;
		rear = newest;
		size = size + 1;
	}
	
	public void addFirst(int e) {
		Node newest = new Node(e, null);
		if(isEmpty()) {
			front = newest;
			rear = newest;
		}
		else {
			newest.next = front;
			front = newest;
		}
		size = size + 1;
	}
	
	public int removeFirst() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int e = front.element;
		front = front.next;
		size = size - 1;
		if(isEmpty()) {
			rear = null;
		}
		return e;
	}
	
	public int removeLast() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		Node p = front;
		int i = 1;
		while(i < size - 1) {
			p = p.next;
			i = i + 1;
		}
		rear = p;
		p = p.next;
		int e = p.element;
		rear.next = null;
		size = size - 1;
		return e;
	}
	
	public int firstElement() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return front.element;
	}
	
	public int lastElement() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return rear.element;
	}
	
	public void display() {
		Node p = front;
		while(p!=null) {
			System.out.println("->>"+p.element);
			p = p.next;
		}
	}
	
	public static void main(String [] args) {
		DoubleEndedQueue d = new DoubleEndedQueue();
		d.addFirst(10);
		d.addFirst(20);
		d.addFirst(30);
		d.addFirst(40);
		d.addlast(100);
		d.addlast(110);
		d.addlast(120);
		d.display();
		System.out.println("Element removed from first :: "+d.removeFirst());
		System.out.println("Element removed from first :: "+d.removeFirst());
		System.out.println("Element removed from Last :: "+d.removeLast());
		System.out.println("Element removed from Last :: "+d.removeLast());
		d.display();
		System.out.println("First element is :: "+d.firstElement());
		System.out.println("Last element is :: "+d.lastElement());
	}
}
