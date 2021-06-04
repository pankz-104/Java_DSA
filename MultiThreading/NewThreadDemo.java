package MultiThreading;

/*
 * using isAlive() to check if the thread is alive
 * general form ::  
 * final boolean isAlive()
 * 
 * join()
 * specifies max amount of time thread wants to wait for specified thread to terminate
 * general form :: 
 * final void join() throws InterruptedException
 */



public class NewThreadDemo implements Runnable{
	String name;
	Thread t;
	NewThreadDemo(String threadName){
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread :: "+t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println(name + " : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(name + " interrupted");
		}
		System.out.println(name + " Exiting");
	}
	
	public static void main(String [] args) {
		NewThreadDemo ob1 = new NewThreadDemo("One");
		NewThreadDemo ob2 = new NewThreadDemo("Two");
		NewThreadDemo ob3 =  new NewThreadDemo("Three");
		
		System.out.println("Thread one is alive :: "+ob1.t.isAlive());
		System.out.println("Thread two is alive :: "+ob2.t.isAlive());
		System.out.println("Thread three is alive :: "+ob2.t.isAlive());
		
		// wait for thread to finish
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Thread one is alive :: "+ob1.t.isAlive());
		System.out.println("Thread two is alive :: "+ob2.t.isAlive());
		System.out.println("Thread three is alive :: "+ob2.t.isAlive());
		System.out.println("Main thread exiting");
	}
}
