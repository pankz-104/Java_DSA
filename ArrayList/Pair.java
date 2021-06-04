package ArrayList;

import java.util.*;

public class Pair<X, Y> {
	
	X x;
	Y y;
	
	public Pair(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	public void getDescription() {
		System.out.println(x+" and "+y);
	}
	
	public static void main(String [] args) {
//		Pair<String, Integer> p1 = new Pair("Pankaj", 104);
//		Pair<Boolean, String> p2 = new Pair("Akash", 100);
//		System.out.println(p1.toString());
	}
}
