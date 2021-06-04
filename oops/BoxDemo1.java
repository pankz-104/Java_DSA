package oops;

class Box1{
	double height;
	double width;
	double depth;
	
	public void volume() {
		System.out.println("Volume is ");
		System.out.println(width * height * depth);
	}
}
public class BoxDemo1 {
	public static void main(String [] args) {
		Box1 b1 = new Box1();
		Box1 b2 = new Box1();
		
		b1.height = 40;
		b1.width = 30;
		b1.depth = 20;
		
		b2.height = 50;
		b2.width = 20;
		b2.depth = 30;
		
		b1.volume();
		b2.volume();
	}
}
