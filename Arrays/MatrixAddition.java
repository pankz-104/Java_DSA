package Arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows and columns :: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		
		System.out.println("Enter values of array a : ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter values in array b :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int c[][] = new int[rows][cols];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("sum of a and b is :: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.println(c[i][j]);
			}
		}
	}

}
