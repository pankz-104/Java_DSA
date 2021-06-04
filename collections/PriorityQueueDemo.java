package collections;

import java.util.*;

public class PriorityQueueDemo {
	public static void main(String [] args) {
		// creating a priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		// adding items to priorityQueue using add()
		
		pq.add(10);
		pq.add(20);
		pq.add(30);
		
		//printing elements 
		System.out.println(pq);
		
		//printing top element of PriorityQueue
		System.out.println(pq.peek());
		
		//printing top element and removing it from queue
		System.out.println(pq.poll());
		
		// printing top element again 
		System.out.println(pq.peek());
	}	
}
