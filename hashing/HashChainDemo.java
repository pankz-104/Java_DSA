package hashing;

import java.util.LinkedList;

public class HashChainDemo {
	private int hashtablesize;
	private LinkedList hashtable[];
	
	public HashChainDemo() {
		hashtablesize = 10;
		hashtable = new LinkedList[hashtablesize];
		for(int i=0; i<hashtablesize; i++) {
			hashtable[i] = new LinkedList();
		}		
	}
	
	public int hashcode(int key) {
		return key % hashtablesize;
	}
	
	public void insert(int element) {
		int i = hashcode(element);
		hashtable[i].insert
	}
	
}
