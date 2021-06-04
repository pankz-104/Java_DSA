package MultiThreading;

public class MultipleThread implements Runnable {
	Thread t;
	String name;  // name of thread
	MultipleThread(String threadName){
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread"+t);
		t.start();  // start the thread
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=5; i>0; i--) {
				System.out.println("child thread : "+i);
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			System.out.println("Child thread Interrupted");
		}
		System.out.println("Child thread interrupted");
	}
	
	public static void main(String [] args) {
		new MultipleThread("First"); 	// starts thread
		new MultipleThread("Second");
		new MultipleThread("Third");
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Main thread : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
