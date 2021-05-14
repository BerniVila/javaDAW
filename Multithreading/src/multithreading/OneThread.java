package multithreading;

public class OneThread {
	public static void main(String args[]) {
		int i;
		AnotherThread t = new AnotherThread();
		t.start();
		for (i = 1; i <= 200; i++)
			System.out.print("YES ");
	}
}

class AnotherThread extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 200; i++)
			System.out.print("NO ");
	}
}
