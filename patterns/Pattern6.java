package patterns;


//4
//	    *    
//    *   *    
//  *   *   *    
//*   *   *   *    

import java.util.Scanner;

public class Pattern6 {
	public static void main(String [] args) {
		System.out.println("Enter n value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*   ");
			}
			System.out.println(" ");
		}
	}
}
