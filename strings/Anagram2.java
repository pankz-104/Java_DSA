package strings;

import java.util.Scanner;

public class Anagram2 {
	public static void main(String[] args) {
		boolean isAnagram = true;
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		int a1[] = new int[256];
		int b1[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			a1[index]++;
		}
		for(char c: b.toCharArray()) {
			int index = (int) c;
			b1[index]++;
		}
		
		for(int i=0; i<256; i++) {
			if(a1[i] != b1[i])
			{
				isAnagram = false;
			}
		}
		if(isAnagram)
			System.out.println("anagram");
		else
			System.out.println("Not anagram");
	}
}
