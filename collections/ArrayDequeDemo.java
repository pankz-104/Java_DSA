package collections;

import java.util.*;

public class ArrayDequeDemo {
	public static void main(String [] args){
		// Initializing an deque 
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		
		//insertion using add() method
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(40);
		ad.add(50);
		ad.add(60);
		
		// printing elements 
		System.out.print(ad);
		
		// clear() method
		ad.clear();
		
		System.out.println(ad);
		
		// adding elements to head to queue using addFirst() method
		ad.addFirst(30);
		ad.addFirst(100);
		ad.addFirst(104);
		
		// addLast() to add elements from end of queue 
		ad.addLast(105);
		ad.addLast(106);
		ad.addLast(107);
		
		// printing elements of the dqueue
		System.out.println(ad);
	}
}
