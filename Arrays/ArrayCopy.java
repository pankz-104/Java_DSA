package Arrays;

import java.util.*;
public class ArrayCopy {
	public static void main(String [] args) {
		int [] array1 = {1, 2, 3, 4, 5};
		int [] array2 = {4, 5, 6, 7, 8};
		int a = array1.length;
		int b = array2.length;
		int [] result = new int[a + b];
		int pos = 0;
		for(int item : array1) {
			result[pos] = item;
			pos++;
		}
		
		for(int item : array2) {
			result[pos] = item;
			pos++;
		}
		
		System.out.println(Arrays.toString(result));
	}
}
