package patterns;

//* * * *  
//* * * *  
//* * * *  
//* * * * 

import java.util.Scanner;
public class Pattern1 {
	public static void main(String [] args) {
		System.out.println("Enter value of n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
