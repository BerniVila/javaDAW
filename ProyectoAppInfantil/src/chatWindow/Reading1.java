package chatWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Reading1 extends Thread {
	private BufferedReader in = null;
	private PrintStream out = null;
	private boolean talking = true;
	//private JTextArea conversation = null;

	public Reading1(BufferedReader in, PrintStream out) { // agrego al constructor conversation
		this.in = in;
		this.out = out;
	}

	public void run() {
		String line = null;

		while (talking) {
			try {
				line = in.readLine();
//				if (line.equalsIgnoreCase("bye")) {
//					talking = false;
//					out.println(line);
//				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(line);
			//conversation.setText(conv.getText() + line)
		}
	}

}
