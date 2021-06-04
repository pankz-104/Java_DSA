package LinkedList;
import java.util.*;
public class MainLinkedList {
	public static void main(String [] args) {
		List<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		
		System.out.println(ll.get(3));
		System.out.println(ll.size());
//		ll.toArray();
//		System.out.println(ll);
		
		ll.remove(2);
		System.out.println(ll);
		
		List<Integer> al = new ArrayList<>();
		
		getTimeDiff(al);
		getTimeDiff(ll);
	}
	
	static void getTimeDiff(List<Integer>list) {
		
		long start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName() + " " +(end - start));
	}
}
