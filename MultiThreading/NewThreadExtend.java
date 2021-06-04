package MultiThreading;

public class NewThreadExtend extends Thread{
	
	NewThreadExtend(){
		// create a second thread
		super("Demo thread");
		System.out.println("child thread :: "+this);
		start();  // start the thread
	}
	
	// this is entry point for second thread 
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("child thread "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Child thread interrupted");
		}
		System.out.println("Exiting child thread");
	}
	
	public static void main(String [] args) {
		new NewThreadExtend(); // create a new thread
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Main thread ::"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting");
	}
}
