package graph;

public class BFS {

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

	BFS() {
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

	public void enque(int e) {
		Node newest = new Node(e, null);
		if (isEmpty()) {
			front = newest;
		} else
			rear.next = newest;
		rear = newest;
		size = size + 1;
	}

	public int deque() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
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
		else
			return front.element;
	}
	
	public void display() {
		Node p = front;
		while(p != null) {
			System.out.println("->>"+p.element);
			p = p.next;
		}
	}
	
	public static void main(String [] args) {
		Graphs g = new Graphs(7);
		g.insertEdge(0, 1, 1);
		g.insertEdge(0, 5, 1);
		g.insertEdge(0, 6, 1);
		g.insertEdge(1, 0, 1);
		g.insertEdge(1, 5, 1);
		g.insertEdge(1, 2, 1);
		g.insertEdge(1, 6, 1);
		g.insertEdge(5, 3, 1);
		g.insertEdge(5, 2, 1);
		g.insertEdge(6, 3, 1);
		g.insertEdge(2, 6, 1);
		g.insertEdge(2, 3, 1);
		g.insertEdge(2, 4, 1);
		g.insertEdge(4, 2, 1);
		g.insertEdge(4, 5, 1);
		g.insertEdge(3, 4, 1);
		System.out.println("BFS :: ");
		g.breadthFirstSearch(0);
		System.out.println("\nDFS :: ");
		g.depthFirstSearch(0);
	}
}
