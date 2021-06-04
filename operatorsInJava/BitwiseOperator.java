package operatorsInJava;


// AND , OR
public class BitwiseOperator {
	public static void main(String [] args) {
		
//		AND
//		5 -> 101
//		6 -> 110
//		--------
//		4 -> 100
		
		int a = 5;
		int b = 6;
		int c = a & b;
		System.out.println(c);
		
//		OR
		
//		10 -> 1010
//		13 -> 1101
//		----------
//		15 -> 1111
		
		int d = 10;
		int e = 13;
		int f = a | b;
		System.out.println(f);
		
		
//      right shift operation
		int g = b >> 1;
		System.out.println(g);
		
//		left shift operation
		int h = a << 2;
		System.out.println(h);
	}
}
