package strings;

import java.util.Arrays;

public class Anagrams {
	
	static boolean isAnagram(String str1, String str2) {
//		char ch1 [] = new char[str1.length()];
		char ch1 [] = str1.toCharArray();
//		char ch2 [] = new char[str2.length()];
		char ch2 [] = str2.toCharArray(); 
		
//		System.out.println(str1.toCharArray());
		
//		System.out.println(ch1);
//		System.out.println(ch2);
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<str1.length(); i++) {
			if(ch1[i] != ch2[i]) {
				return false;
			}
		}
			return true;
	}
	public static void main(String [] args) {
		String str1 = "pankaj";
		String str2 = "jaknap";
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		if(n1 == n2) {
			isAnagram(str1, str2);
			if(isAnagram(str1,str2)) {
				System.out.println("anagram");
			}
			else
				System.out.println("Not anagram");
		}
		else 	
			System.out.println("unequal lenght, not anagram!!");
	}
}