package patterns;

//4 
//      1    
//    2   3    
//  4   5   6    
//7   8   9   10   

import java.util.Scanner;

public class pattern7 {
	public static void main(String [] args) {
		System.out.println("Enter n value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(num+"   ");
				num += 1;
			}
			System.out.println(" ");
		}
	}
}
