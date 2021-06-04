package binaryConversions;

public class MaxConsecutiveOnes {
	
	public static int maxconsecutiveOnes(int x) {
		int count = 0;
		while(x != 0) {
			x = ( x & ( x << 1));
			count ++;
		}
		return count;
	}
	public static void main(String [] args) {
		System.out.println(maxconsecutiveOnes(14));
		System.out.println(maxconsecutiveOnes(222));
		System.out.println(maxconsecutiveOnes(5));
		System.out.println(maxconsecutiveOnes(100));
		System.out.println(maxconsecutiveOnes(104));
	}
}
