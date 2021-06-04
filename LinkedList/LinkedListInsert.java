package LinkedList;

import java.io.*;
public class LinkedListInsert {
	
	// head of linkedlist
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String [] args) {
		LinkedListInsert list = new LinkedListInsert();
		list = insert(list, 1);
		list = insert(list, 20);
		list.insert(list,  105);
		list.insert(list,  106);
		list.insert(list,  110);
		list.insert(list, 111);
		PrintList(list);
		list = search(list, 1);
		list = search(list, 20);
		list = search(list, 100);
		list.search(list ,  105);
	}
	
	public static LinkedListInsert search(LinkedListInsert list, int key) {
		Node cur_node = list.head;
		
		// if the key is at the head itself
		if(cur_node != null && cur_node.data == key) {
			System.out.println(key+" found");
			return list;
		}
		
		// if key is not found at head, but at some other position 
		// iterate while comparing each element to the key
		
		while(cur_node != null && cur_node.data != key) {
			cur_node = cur_node.next;
		}
		if(cur_node != null) {
			System.out.println(key+" found");
		}
		
		// if the key is not present and cur_node reaches the end of list 
		if(cur_node == null) {
			System.out.println(key+" not present in the list");
		}
		return list;
	}
	public static LinkedListInsert insert(LinkedListInsert list, int data) {
		// create new node with given data 
		Node new_node = new Node(data);
		new_node.next = null;
		
		// If the linkedlist is empty, new_node becomes head itself
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			//traverse till last node & insert new_node at last 
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			// Insert the new_node at the last 
			last.next = new_node;
		}
	 	return list;
	}
	
	public static LinkedListInsert PrintList(LinkedListInsert list) {
		Node curr_node = list.head;
		while(curr_node != null) {
			System.out.print(curr_node.data +" ");
			curr_node = curr_node.next;
		}
		System.out.println();
		return list;
	}
	
}
