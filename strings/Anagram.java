package strings;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		boolean isAnagram = false;
		boolean[] visited = new boolean[s2.length()];
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				char c = s1.charAt(i);
				isAnagram = false;
				for (int j = 0; j < s2.length(); j++) {
					if (s2.charAt(j) == c && !visited[j]) {
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if (!isAnagram)
					break;
			}
			if (isAnagram)
				System.out.println("Anagram");
			else
				System.out.println("Not anagram");
		} else
			System.out.println("unequal length, not an anagram");
	}
}
