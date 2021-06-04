package MultiThreading;

// Demonstrate thread priotities 

class Clicker implements Runnable {
	Thread t;
	long click = 0;
	private volatile boolean running = true;

	public Clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}

	public void run() {
		while (running) {
//			System.out.println("run method");
			click++;
		}
	}

	public void start() {
		t.start();
	}

	public void stop() {
		running = false;
	}
}

class ThreadPriority {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);

		lo.start();
		hi.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

		lo.stop();
		hi.stop();

		// wait for child thread to terminate

		try {
			hi.t.join();
			lo.t.join();
		} catch (InterruptedException e) {
			System.out.println("Exception caught");
		}
		System.out.println("Low priorith thread " + lo.click);
		System.out.println("High priority thread " + hi.click);
	}
}
