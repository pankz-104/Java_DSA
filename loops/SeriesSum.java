package loops;
import java.util.Scanner;
public class SeriesSum {
	public static void main(String [] args) {
		System.out.println("Enter a number :: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float result = 0;
		for (float i=1; i<=n; i++) {
			result += 1/i;
		}
		System.out.println("sum of series is : "+result);
	}
}
