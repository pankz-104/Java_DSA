package MultiThreading;

public class NewThreadRunnable implements Runnable {
	Thread t;

	NewThreadRunnable() {
		// create a new thread
		t = new Thread(this, "Demo thread");
		System.out.println("child thread" + t);
		t.start();
	}

	// this is entry point for second thread
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {

			for (int i = 5; i > 0; i--) {
				System.out.println("child thread :: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("child thread interrupted");
		}
		System.out.println("Exiting child thread");
	}

	public static void main(String[] args) {
		new NewThreadRunnable(); // creating a new thread

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main thread :: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
	}
}
