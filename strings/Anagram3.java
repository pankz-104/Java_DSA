package strings;

public class Anagram3 {
	public static void main(String [] args) {
		String a = "&^pa3nkaj4";
		String b = "^&jakna34p";
		boolean isAnagram = true;
		int a1[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			a1[index]++;
		}
		
		for(char c: b.toCharArray()) {
			int index = (int) c;
			a1[index]--;
		}
		
		for(int i=0; i<256; i++) {
			if(a1[i] != 0) {
				isAnagram = false;
			}
		}
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
