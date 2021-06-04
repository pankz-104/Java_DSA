package stack;

public class StackArrays {
	
	private int data[];
	private int top;
	
	StackArrays(int n){
		data = new int[n];
		top = 0;
	}
	
	public int length() {
		return top;
	}
	
	public boolean isEmpty() {
		// if top is zero returns true .. i.e. stack is empty else false
		return top == 0;
	}
	
	public boolean isFull() {
		// if top is equal to length of array, stack is full & returns true else false;
		return top == data.length;
	}
	
	public void push(int e) {
		if(isFull()) {
			System.out.println("stack is full");
			return;
		}
		else {
			data[top] = e;
			top = top + 1;
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		else {
			int e = data[top - 1];
			top = top - 1;
			return e;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else 
			return data[top - 1];
	}
	
	public void display() {
		for(int i=0; i<top; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		StackArrays s = new StackArrays(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.display();
		System.out.println("IsEmpty -> "+s.isEmpty());
		System.out.println("Size is :: "+s.length());
		System.out.println(s.length());
		System.out.println("Element popped :: "+s.pop());
		System.out.println("Element popped :: "+s.pop());
		System.out.println("Element popped :: "+s.pop());
		System.out.println("IsEmpty -> "+s.isEmpty());
		s.display();
		System.out.println("Size is :: "+s.length());
		System.out.println("Top element :: "+s.peek());
		s.display();
	}
}
