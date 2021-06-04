package loops;
import java.util.Scanner;
public class FiboacciNumbers {
	public static void main(String [] args) {
		System.out.println("Enter number to find fibonacci : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for (int i = 0; i<n-2; i++) {
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
}
