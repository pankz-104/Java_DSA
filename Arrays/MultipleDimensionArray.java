package Arrays;

import java.util.Scanner;

public class MultipleDimensionArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
//		int a[][] = new int[5][3];
//		System.out.println(a[0][1]);
		
		int b[][] = {{1, 5, 6, 7, 8},
				     {1, 4, 6, 7, 8},
					 {1,2,3}};
		
		System.out.println(b[1][3]);
		System.out.println(b[0][0]);
		System.out.println(b[2][2]);
	}
}
