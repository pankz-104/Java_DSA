package constructors;

public class NoArgsConstructor {
	
	int wheel;
	NoArgsConstructor(){
		wheel = 4;
	}
	public static void main(String [] args) {
		NoArgsConstructor obj = new NoArgsConstructor();
		System.out.println("no of wheels:: "+obj.wheel);
	}
}
