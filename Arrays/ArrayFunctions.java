package Arrays;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFunctions {
	public static void main(String args[]) {
		
		// Declaring arrays
		
		String [] arr = new String[4];
		String [] arr1 = {"a", "b", "c", "d", "e"};
		String [] arr2 = new String[] {"a", "b", "c", "d", "e"};
		
		//  print an array 
		int [] int_arr = {1, 2, 3, 4, 5, 6};
		String arr_string = Arrays.toString(int_arr);
		System.out.println(arr_string);
		
		// create an arraylist from array 
		
		
		String [] str_arr = {"a", "b", "c", "d", "e"};
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(str_arr));
		arrList.add("pankaj");
		arrList.add("Pandey");
		System.out.println(arrList);
		
		//check if an array contains certain certain variable 
		String [] StrArr = {"a", "b", "c", "d", "e", "f"};
		boolean b = Arrays.asList(StrArr).contains("f");
		System.out.println(b);
		
		// concatenate two arrays
		int [] first_arr = {1, 2, 3, 4, 5, 6};
		int [] second_arr = {5, 6, 7, 8, 9};
//		int [] final_arr = ArrayUtils.addAll(first_arr, second_arr);
		int len_first = first_arr.length;
		int len_second = second_arr.length;
		int [] result = new int[len_first + len_second];
		
		System.arraycopy(first_arr, 0, result, 0, len_first);
		System.arraycopy(second_arr, 0, result, len_first, len_second);
		System.out.println(Arrays.toString(result));
		
		//declaring an array inline 
		for(int i : new int[] {1, 2, 3, 4 ,5}) {
			System.out.println(i);
		}
		
		List pets = Arrays.asList(new String [] {"cat", "dog", "cow"});

		// join the elements if the provided array into a single string 
		
		String [] arr_join = {"This", "is", "java", "programming", "language"};
		String joinedString = String.join(" ", arr_join);
		System.out.println(joinedString);
		
		String joinedStr = String.join(" :: ", "this", "is", "join", "method");
		System.out.println(joinedStr);
		
		StringJoiner joiner = new StringJoiner(",", "[", "]");
		joiner.add("How");
		joiner.add("to");
		joiner.add("join");
		joiner.add("string");
		joiner.add("in");
		joiner.add("java");
		
		System.out.println(joiner);
		
//		Scanner sc = new Scanner(System.in);
//		int n = 5;
//		
//		System.out.println("Enter the words in a string");
//		StringJoiner joined = new StringJoiner(" ","","");
//		while(n>0) {
//			joined.add(sc.next());
//			n--;
//		}
//		System.out.println(joined);
		
		/* array to arraylist 
		 * and arrayist to an array
		 */
		
		String [] name = {"pankaj", "pandey"};
		ArrayList<String> arr_name = new ArrayList<String>(Arrays.asList(name));
		String [] name_arr = new String[arr_name.size()];
		arr_name.toArray(name_arr);
		for(String s : name_arr) 
			System.out.print(s+" ");
		
		
	}
}
