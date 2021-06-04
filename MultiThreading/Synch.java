package MultiThreading;

// this program is not synchronized

class Callme{
	void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.print("]");
	}
}

class Caller implements Runnable {
	Thread t;
	String msg;
	Callme target;
	
	public Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		target.call(msg);
	}
}

public class Synch {
	public static void main(String [] args) {
		Callme target = new Callme();
		Caller c1 = new Caller(target, "Hello");
		Caller c2 = new Caller(target, "Synchronized");
		Caller c3 = new Caller(target, "World");
		
		// wait for threads to end
		
		try {
			c1.t.join();
			c2.t.join();
			c3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
