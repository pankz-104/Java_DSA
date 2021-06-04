package constructors;

public class ParameterizedConstructor {
	int wheel;
	ParameterizedConstructor(int a){
		wheel = a;
	}
	public static void main(String [] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor(6);
		System.out.println("No of wheels :: "+obj.wheel);
	}
}
