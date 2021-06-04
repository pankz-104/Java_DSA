package operatorsInJava;

public class TernaryOperator {
	public static void main(String [] args) {
		int a = 12, b = 120, c = 180;
		int result = 0;
		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println("largest of 3 numbers is "+result);
	}
}
