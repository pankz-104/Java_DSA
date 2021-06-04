package loops;
import java.util.Scanner;
public class XPowerY {
	public static void main(String [] args) {
		System.out.println("Enter x and y");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 1;
		for(int i=1; i<=y; i++) {
			result = result * x;
		}
		System.out.println("result is "+result);
	}
}
