package strings;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseStringWord {
	
	static String reverseWord(String str) {
		
		// specifying the pattern to be searched
		Pattern pattern = Pattern.compile("\\s");
		
		// splitting string with pattern 
		String [] temp = pattern.split(str);
		String result = "";
		
		//Iterate over the temp array and store the string in 
		// reverse order 
		
		for(int i=0; i<temp.length; i++) {
			if(i == temp.length-1) {
				result = temp[i] + result;
			}
			else
				result = " "+temp[i] + result;
		}
		return result;
	}
	
	public static void main(String [] args) {
		String s1 = "this is 1st string";
		String s2 = "let's reverse the string here";
		System.out.println(reverseWord(s1));
		System.out.println(reverseWord(s2));
	}
}
