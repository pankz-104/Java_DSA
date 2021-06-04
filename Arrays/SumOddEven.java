package Arrays;

public class SumOddEven {
	public static void main(String [] args) {
		int [] a = {1, 5, 3, 2, 4, 6, 7};
		int even = 0, odd = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0) {
				even += a[i];
			}
			else 
				odd += a[i];
		}
		System.out.println(even+" "+odd);
	}
}
