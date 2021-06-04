package whileLoop;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 1;
		do {
//			int n = 0;
			n+=1;
			System.out.println("n is "+n);
		}while(n!=10);
	}
}
