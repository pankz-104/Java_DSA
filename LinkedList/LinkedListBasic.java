package LinkedList;

public class LinkedListBasic {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	
	private void printLL() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String [] args) {
		LinkedListBasic ll = new LinkedListBasic();
		ll.head = new Node(1);
		Node second = new Node(44);
		Node third = new Node(55);
		Node fourth = new Node(66);
		Node fifth = new Node(77);
		Node sixth = new Node(88);
		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		ll.printLL();
//		ll.printLL();
	}
}
