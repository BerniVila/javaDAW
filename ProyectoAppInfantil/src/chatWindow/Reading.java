package chatWindow;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JTextArea;

public class Reading extends Thread {
	private BufferedReader in = null;
	private PrintStream out = null;
	private boolean talking = true;
	private JTextArea conversation = null;
	private FileInputStream inAudio = null;
	
	
	public Reading(BufferedReader in, PrintStream out) { // agrego al constructor conversation
		this.in = in;
		this.out = out;
	}
	

	public Reading(BufferedReader in, PrintStream out, JTextArea conversation) { // agrego al constructor conversation
		this.in = in;
		this.out = out;
		this.conversation = conversation;
	}
	
	
	
	public Reading(FileInputStream inAudio, PrintStream out) { // agrego al constructor conversation
		this.inAudio = inAudio;
		this.out = out;
		
		
		
		
	}
	
	

	public void run() {
		String line = null;

		while (talking) {
			try {
				line = in.readLine();
				conversation.setText(conversation.getText() + "\n" + line + "\n");
//				if (line.equalsIgnoreCase("bye")) {
//					talking = false;
//					out.println(line);
//				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
