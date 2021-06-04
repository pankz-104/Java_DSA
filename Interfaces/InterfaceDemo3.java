package Interfaces;

interface IntStack{
	void push(int item); // store an item
	int pop();  // retrieve an item 
}

// an implementaion of stack that uses fixed storage 
class FixedStack implements IntStack{
	private int stck[];
	private int tos;
	
	// allocate and initialize stack 
	FixedStack(int size){
		stck = new int[size];
		tos = -1;
	}
	
	// push an item into the stack 
	public void push(int item) {
		
		// check if stack is full
		if(tos == stck.length - 1)
			System.out.println("stack is full");
		else 
			stck[++tos] = item;
	}
	
	// pop an item from the stack
	
	// check if stack is empty
	public int pop(){
	if(tos < 0) {
		System.out.println("Stack underflow");
		return 0;
	}
	else 
		return stck[tos--];
	}
}


// Implementation of an stack that uses dynamic storage 
class DynStack implements IntStack{
	private int stck[];
	private int tos;
	
	// allocate and initialize stack
	DynStack(int size){
		stck = new int[size];
		tos = -1;
	}
	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		if( tos == stck.length - 1) {
			int temp[] = new int[stck.length * 2]; // double size 
			for(int i=0; i<stck.length; i++)
				temp[i] = stck[i];
			stck = temp;
			stck[++tos] = item;
			}
		else
			stck[++tos] = item;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(tos < 0) {
			System.out.println("stack underflow");
			return 0;
		}
		else
			return stck[tos--];
	}
	
}
public class InterfaceDemo3 {
	public static void main(String [] args) {
		FixedStack mystack1 = new FixedStack(10);
		FixedStack mystack2 = new FixedStack(150);
		
		// push some numbers into the stack 
		for(int i=0; i<=5; i++) mystack1.push(i);
		for(int i=0; i<=10; i++) mystack2.push(i);
		
		// pop some numbers from the stack 
		System.out.println("stack in mystack1");
		for(int i=0; i<5; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("stack in mystack2");
		for(int i=0; i<10; i++)
			System.out.println(mystack2.pop());
		
		
		// dynamic growth of the memory
		DynStack stck1 = new DynStack(5);
		DynStack stck2 = new DynStack(8);
		
		// loops cause the stack to grow
		for(int i=0; i<12; i++) stck1.push(i);
		for(int i=0; i<24; i++) stck2.push(i);
		
		System.out.println("stack1 stack elements :: ");
		for(int i=0; i<12; i++)
			System.out.println(stck1.pop());
		
		System.out.println("stack2 stack elements :: ");
		for(int i=0; i<24; i++)
			System.out.println(stck2.pop());
	}
}
