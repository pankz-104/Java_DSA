package methodOverriding;

class First{
	int x,y;
	First(int a, int b){
		x = a; 
		y = b;
	}
	
	void display() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}

class Second extends First{
	int z;
	Second(int a, int b, int c){
		super(a, b);
		z = c;
	}
	void display() {
		super.display();
		System.out.println("z:"+z);
	}
}
public class Overriding {
	public static void main(String [] args) {
		Second sc = new Second(100, 200, 300);
		sc.display();
	}
}
