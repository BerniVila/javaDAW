package socketsLesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Reading extends Thread {
	private BufferedReader in = null;
	private PrintStream out = null;
	private boolean talking = true;

	public Reading(BufferedReader in, PrintStream out) {
		this.in = in;
		this.out = out;
	}

	public void run() {
		String line = null;

		while (talking) {
			try {
				line = in.readLine();
				if (line.equalsIgnoreCase("bye")) {
					talking = false;
					out.println(line);
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(line);
		}
	}

}
