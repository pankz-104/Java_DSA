package collections;
import java.util.*;
import java.io.*;
//import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String [] args) {
		// declaring arraylist of initial size n
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(2);
		for(int i=0; i<=5; i++) {
			a1.add(i);
		}
		
		//printing elements 
		System.out.println(a1);
		
		// remove element at index 2
		a1.remove(2);
		
		//print after removing an element 
		System.out.println(a1);
		
		// printing elements one after another 
		for(int i=0; i<a1.size(); i++) {
			System.out.print(a1.get(i)+ " ");
		}
	}
}
