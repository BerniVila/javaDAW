package multithreading;

class TwoThreads {
	public static void main(String args[]) {
		NoThread n = new NoThread();
		YesThread s = new YesThread();
		n.start();
		s.start();
	}
}

class NoThread extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 20; i++)
			System.out.print("NO ");
	}
}

class YesThread extends Thread {
	public void run() {
		int i;
		for (i = 1; i <= 20; i++)
			System.out.print("YES ");
	}
}
