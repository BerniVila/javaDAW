package multithreading;

public class ExtendingThreadClass {

	public class SimpleThread extends Thread {
		// constructor
		public SimpleThread(String str) {
			super(str);
		}

		// overriding method run()
		public void run() {
			for (int i = 0; i < 10; i++)
				System.out.println("Este es el thread : " + getName());
		}
	}

	// ******** in some other Thread:
	// SimpleThread miThread = new SimpleThread(“Testing threads”);
	// miThread.start();
}
