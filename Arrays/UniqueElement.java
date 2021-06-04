package Arrays;

public class UniqueElement {
	
	public static boolean uniqueEle(int[] data, int n) {
		for(int i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++) {
				if(data[i] == data[j])
					return false;
			}
		return true;
	}
	public static void main(String [] args) {
		int[] arr = {1,2,3,4,5,6,7,6,7,9};
		int n = arr.length;
//		if(uniqueEle(arr, n))
//		{
//			System.out.println("Repeated element found");
//		}
//		else
//			System.out.println("Elements are unique");
		
		boolean res;
		res = uniqueEle(arr, n);
		if(res == true)
			System.out.println("unique");
		else
			System.out.println("Not unique");
	}
}
