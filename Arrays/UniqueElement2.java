package Arrays;
import java.util.*;
public class UniqueElement2 {
	
	public static boolean UniqueElem(int[] data, int n) {
		
		int [] temp = Arrays.copyOf(data, n);
		Arrays.sort(temp);
		for(int i=0; i<n-1; i++) {
			if(temp[i] == temp[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		int[] arr = {1,2,3,4,5,6,7,8,10};
		int n = arr.length;
		boolean res;
		res = UniqueElem(arr, n);
		if(res == true)
			System.out.println("unique elements");
		else
			System.out.println("Not unique elements");
	}
}
