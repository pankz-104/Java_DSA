package loops;
import java.util.Scanner;
public class SumSeries2 {
	public static void main(String [] args) {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float result = 0;
		for(float i=1; i<=n; i++) {
			if(i % 2 == 0) {
				result -= 1/i;
			}
			else {
				result += 1/i;
			}
		}
		System.out.println("Sum of series is : "+result);
	}
}