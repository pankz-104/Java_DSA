package cohesion;

public class Display1 {
	
	public void wakeUp() {
		System.out.println(" I woke up");
	}
	
	public void clean() {
		System.out.println(" I went bathroom, brushed teeth");
	}
	
	public void eat() {
		System.out.println(" I had breakfast");
	}
	
	public void sleep() {
		System.out.println(" I slept");
	}
	public static void main(String [] args) {
		Display1 d = new Display1();
		d.wakeUp();
		d.clean();
		d.eat();
		d.sleep();
		
	}
}
