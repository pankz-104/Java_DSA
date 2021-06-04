package Arrays;

import java.util.*;
public class EvenOddIndexElement {
	public static void main(String [] args) {
		int [] a = {1, 5, 3, 2, 4, 6, 7};
		int n = a.length;
		int [] odd = new int[7];
		int [] even = new int[7];
		for(int i=0; i<n-1; i++) {
			if(a[i] % 2 == 0) {
				even[i] = a[i];
			}
			else {
				odd[i] = a[i];
			}
		}
		String o = Arrays.toString(odd);
		String e = Arrays.toString(even);
		System.out.println(o + " "+ e);
	}
}
