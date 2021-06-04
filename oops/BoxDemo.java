package oops;


class Box {
	double height;
	double width;
	double depth;
}
public class BoxDemo {
	public static void main(String [] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		
		b1.height = 20;
		b1.width = 10;
		b1.depth = 5;
		
		b2.height = 25;
		b2.width = 15;
		b2.depth = 10;
		
		double vol = b1.height * b1.width * b1.depth;
		System.out.println(vol);
		
		vol = b2.height * b2.width * b2.depth;
		System.out.println(vol);
	}
}
