package TwoPointerAlgorithm;

public class DemoTripletSum {
	public static void main(String [] args) {
		 int [] arr = {1, 2, -1, 3, 4, -3};
		 int n = arr.length;
		 for(int i=0; i<n; i++) {
			 for(int j=i+1; j<n-1; j++) {
				 for(int k=j+1; k<n-2; k++) {
					 if(arr[i] + arr[j] + arr[k] == 0) {
						 System.out.println("true");
						 break;
					 }else
						 System.out.println("false");
					 	break;
				 }
			 }
		 }
	}
}
