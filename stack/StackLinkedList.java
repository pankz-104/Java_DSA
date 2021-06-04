package stack;

public class StackLinkedList {
	class Node{
		int element;
		Node next;
		
		Node(int e, Node n){
			element = e;
			next = n;
		}
	}
	
	private Node top;
	private int size;
	StackLinkedList(){
		top = null;
		size = 0;
	}
	
	public int length() {
		return size;
	}
	
	public boolean isEmpty() {
		// returns true if top is zero else false
		return size == 0;
	}
	
	public void push(int e) {
		Node newest = new Node(e, null);
		if(isEmpty()) {
			top = newest;
		}
		else {
			newest.next = top;
			top = newest;
		}
		size = size + 1;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int e = top.element;
		top = top.next;
		size = size - 1;
		return e;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.element;
	}
	
	public void display() {
		Node p = top;
		while(p!=null) {
			System.out.println("->"+p.element);
			p = p.next;
		}
	}
	
	public static void main(String [] args) {
		StackLinkedList s = new StackLinkedList();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		System.out.println("IsEmpty :: "+s.isEmpty());
		System.out.println("ELement popped :: "+s.pop());
		System.out.println("Element popped :: "+s.pop());
		System.out.println(s.length());
		System.out.println("IsEmpty :: "+s.isEmpty());
		s.display();
	}
}
