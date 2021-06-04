package oops;


class Box4{
	
	double height;
	double width;
	double depth;
	
	Box4(double height, double width, double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	void volume() {
		System.out.println("Volume is :: ");
		System.out.println(height * width * depth);
	}
}
public class BoxDemo4 {
	public static void main(String [] args) {
		Box4 b1 = new Box4(10, 22.22, 33);
		Box4 b2 = new Box4(23, 32.32, 44.44);
		
		b1.volume();
		b2.volume();
	}
}
