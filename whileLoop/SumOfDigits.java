package whileLoop;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			sum += lastDigit;
			System.out.println(lastDigit +" "+ temp +" "+ sum);
		}
		System.out.println("sum is "+sum);
		
		int noOfDigits = (int)Math.log10(n) + 1;
		System.out.println(noOfDigits);
	}
}
