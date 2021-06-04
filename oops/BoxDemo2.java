package oops;

class Box2{
	double height;
	double width;
	double depth;
	
	double volume() {
		return height * width * depth;
	}
}
public class BoxDemo2 {
	public static void main(String [] args) {
		Box2 b1 = new Box2();
		Box2 b2 = new Box2();
		
		b1.height = 30;
		b1.width = 20;
		b1.depth = 10;
		
		b2.height = 20.20;
		b2.width = 30.22;
		b2.depth = 22.22;
		
		double vol1 = b1.volume();
		System.out.println(vol1);
		double vol2 = b2.volume();
		System.out.println(vol2);
	}
}
