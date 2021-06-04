package collections;

import java.util.*;

public class LinkedListDemo {
	public static void main(String [] args) {
		
		// Declaring the linked List
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=0; i<10; i++) {
			ll.add(i);
		}
		
		// printing elements 
		System.out.println(ll);
		
		// removing element at index 4
		ll.remove(4);
		
		// printing elements 
		System.out.println(ll);
		
		// printing elements one by one
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i)+ " ");
		}
	}
}
