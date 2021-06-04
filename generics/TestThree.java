package generics;

import java.util.*;

public class TestThree {
	public static void main(String [] args) {
//		 creating an arraylist without any specified type 
//		ArrayList a1 = new ArrayList();
//		
//		a1.add("pankaj");
//		a1.add("pandey");
//		
//		a1.add(104); 	// compiler allows this
//		
//		
//		String s1 = (String) a1.get(0);
//		String s2 = (String) a1.get(1);
//		
//		// causes runtime exception
//		String s3 = (String) a1.get(2);
		
		// creating an arraylist with type specified 
		ArrayList <String> a1 = new ArrayList<String>();
		
		a1.add("Pankaj");
		a1.add("Pandey");
		a1.add(104); 	// compiler won't allow this now 
		
		String s1 = (String) a1.get(0);
		String s2 = (String) a1.get(1);
		String s3 = (String) a1.get(2);
	}
}
