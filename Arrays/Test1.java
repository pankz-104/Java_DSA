package Arrays;

import java.util.Scanner;

public class Test1 {
	public static void main(String [] args) {
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		int[] marks;
		marks = new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			marks[i] = sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+ " " + marks[i]);
		}
	}
}
