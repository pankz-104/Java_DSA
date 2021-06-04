package patterns;

//4
//*  
//* *  
//* * *  
//* * * *  
//* * *  
//* *  
//*

import java.util.Scanner;

public class Pattern8 {
	public static void main(String [] args) {
		System.out.println("Enter n value :: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}
}
