package patterns;

//5
//*
//**
//* *
//*  *
//*****

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n value :: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("*");
		if(n > 1) {
			for(int i=2; i<=n-1; i++) {
				System.out.print("* ");
				for(int j=1; j<=i-2; j++) {
					System.out.print("  ");
				}
				System.out.println("* ");
			}
			
			for(int i=1; i<=n; i++) {
				System.out.print("* ");
			}
		}
	}

}
