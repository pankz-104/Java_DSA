package whileLoop;

import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {
		
		System.out.println("Enter the number :: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int temp = n;
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp = temp/10;
			rev = rev * 10 + lastDigit; 
		}
		System.out.println(rev);
		if (rev == n) 
			System.out.println("palindrome number");
		else 
			System.out.println("Not a palindrome number");
	}
}
