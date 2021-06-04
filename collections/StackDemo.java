package collections;

import java.util.*;

public class StackDemo {
	public static void main(String [] args){
		
		// Declaration of stack
		Stack<String> stk = new Stack<String>();
		stk.push("Its");
		stk.push("me");
		stk.push("pankaj");
		stk.push("here");
		
		// Iterator for the stack
		Iterator<String> itr = stk.iterator();
		
		// printing the stack
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
		System.out.println();
		
		// remove(pop) element at top of stack
		stk.pop();
		
		// Iterator of the stack
		
		itr = stk.iterator();
		
		// printing the stack
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
	}	
}
