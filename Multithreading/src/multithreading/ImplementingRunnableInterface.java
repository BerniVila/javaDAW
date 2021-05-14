package multithreading;

public class ImplementingRunnableInterface {

	
	public class SimpleRunnable implements Runnable {

		String nameThread;
		// constructor
		public SimpleRunnable (String str) {
			nameThread = str;
		}
	// defining method run()
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("I am the thread: " + nameThread);
		}
	}

	// Next code creates a new thread and it runs it 

	SimpleRunnable p = new SimpleRunnable("Testing threads");
	// I have to create an object of class Thread passing the Runnable 
	// object to it as a parameter
	Thread miThread = new Thread(p);
	// run the object (of the Thread class)
	//miThread.start();
	
}
