package loops;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String [] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2; i<n; i++) {
			if (n%i == 0) {
//				System.out.println("not a prime number");
				isPrime = false;
				break;
			}
			isPrime = true;
		}
		if(n < 2) isPrime = false;
		if(isPrime == false) {
			System.out.println(" is not prime");
		}
		else {
			System.out.println("is prime");
		}
	}
}
