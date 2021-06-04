package LinkedList;

public class LinkedListDelete {
	
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static LinkedListDelete insert(LinkedListDelete list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	public static LinkedListDelete delete(LinkedListDelete list, int key) {
		
		Node cur_node = list.head, prev = null;
		
		// case 1 : if node is present in the head itself
		if(cur_node != null && cur_node.data == key) {
			
			// change head
			list.head = cur_node.next;
			
			System.out.println(key+" found and deleted");
			
			//return updated list
			return list;
		}
		
		// case 2 : if key is not present in head
		// search for key to be deleted
		// keep track of previous node 
		// change the next of prev to next of current node 
		while(cur_node != null && cur_node.data != key) {
			// if cur_node does not hold key, continue to next node
			prev = cur_node;
			cur_node = cur_node.next;
		}
		
		
		// If the key was present, it should be at cur_node
		// so cur_node should not be null
		
		if(cur_node != null) {
			
			// link the next of prev node to next of cur_node .. 
			// i.e. unlink the node from prev node
			prev.next = cur_node.next;
			System.out.println(key+" found and deleted");
			
		}
		
		// case 3 : if key is not present 
		// the cur_node iterates upto the last of list, key not found
		if(cur_node == null) {
			System.out.println(key+" not found");
		}
		
		// return the list
		return list;
	}
	
	public static LinkedListDelete printList(LinkedListDelete list) {
		Node curr_node = list.head;
		while(curr_node != null) {
			System.out.print(curr_node.data + " \n");
			curr_node = curr_node.next;
		}
		return list;
	}
	
	public static void main(String [] args) {
		LinkedListDelete ll = new LinkedListDelete();
		LinkedListDelete.insert(ll, 10);
		LinkedListDelete.insert(ll, 20);
		LinkedListDelete.insert(ll, 30);
		LinkedListDelete.insert(ll, 40);
		LinkedListDelete.insert(ll, 50);
		LinkedListDelete.insert(ll, 60);
		
		printList(ll);
		
		LinkedListDelete.delete(ll, 20);
		LinkedListDelete.delete(ll, 40);
//		ll.delete(ll, 60);
		LinkedListDelete.delete(ll, 60);
		
		printList(ll);
	
	}
}
