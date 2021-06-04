package collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String [] args) {
		// declaring the vector
		Vector<Integer> v = new Vector<Integer>();
		
		//appending elements to the end of list
		for(int i=0; i<=10; i++) {
			v.add(i);
		}
		
		//printing elements 
		System.out.println(v);
		
		//removing element at index 5
		v.remove(5);
		
		//printing elements after removing element at index 5
		System.out.println(v);
		
		//printing elements one by one 
		for(int i=0; i< v.size(); i++)
			System.out.print(v.get(i)+" ");
	}
}
