package queue;

public class QueueLinkedList {

	class Node {
		int element;
		Node next;

		Node(int e, Node n) {
			element = e;
			next = n;
		}
	}

	private Node front;
	private Node rear;
	private int size;

	QueueLinkedList() {
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

	// adding element at the last of the queue
	public void enque(int e) {
		Node newest = new Node(e, null);
		if (isEmpty()) {
			front = newest;
		} else
			rear.next = newest;
		rear = newest;
		size = size + 1;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			int e = front.element;
			front = front.next;
			size = size - 1;
			return e;
		}
	}

	public int first() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			return front.element;
		}
	}
	
	public void display() {
		Node p = front;
		while(p!=null) {
			System.out.println("->>"+p.element);
			p = p.next;
		}
	}
	
	public static void main(String[] args) {
		QueueLinkedList q = new QueueLinkedList();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.display();
		System.out.println("Is empty :: "+q.isEmpty());
		System.out.println("Element removed is :: "+q.dequeue());
		System.out.println("Element removed is :: "+q.dequeue());
		q.display();
		System.out.println("ELement removed is :: "+q.dequeue());
		System.out.println("Element removed is :: "+q.dequeue());
		System.out.println("Is empty :: "+q.isEmpty());
		q.enque(50);
		q.enque(60);
		q.display();
	}
}
