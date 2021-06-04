package queue;

public class QueueArrays {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueArrays(int n) {
		data = new int[n];
		front = 0;
		rear = 0;
		size = 0;
	}
	
	public int length() {
		return size;
	}
	
	public boolean isEmpty() {
		// if size 0, returns true else false 
		return size == 0;
	}
	
	public boolean isFull() {
		// if size is same as length of array return true else false
		return size == data.length;
	}
	
	public void enque(int e) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		else {
			data[rear] = e;
			rear = rear + 1;
			size = size + 1;
		}
	}
	
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			int e = data[front];
			front = front + 1;
			size = size - 1;
			return e;
		}
	}
	
	public void display() {
		for(int i=front; i<rear; i++) {
			System.out.println(data[i]+" ");
		}
	}
	
	public static void main(String [] args) {
		QueueArrays q = new QueueArrays(10);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.display();
		System.out.println("Is Empty :: "+q.isEmpty());
		System.out.println("Is Full :: "+q.isFull());
		System.out.println("size is :: "+q.length());
		System.out.println("Element removed is :: "+q.dequeue());
		System.out.println("Element removed is :: "+q.dequeue());
		System.out.println("Element removed is :: "+q.dequeue());
		System.out.println("Element removed is :: "+q.dequeue());
		System.out.println("Is Empty :: "+q.isEmpty());
		q.display();
		
	}
}
