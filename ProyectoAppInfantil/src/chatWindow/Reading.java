package chatWindow;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.JTextArea;

public class Reading extends Thread {
	private boolean talking = true;
	private JTextArea conversation = null;
	private ObjectInputStream inAudio = null;	
	private BufferedReader in = null;
	private PrintStream out = null;


	public Reading(BufferedReader in, PrintStream out, JTextArea conversation) { // agrego al constructor conversation
		this.in = in;
		this.out = out;
		this.conversation = conversation;
	}
	
	public Reading(ObjectInputStream inAudio) { // agrego al constructor FileInputStream
		this.inAudio = inAudio;	
	}
	
	

		public void run() {
			String line = null;

			while (talking) {
				try {
					line = in.readLine();
//					if (line.equalsIgnoreCase("bye")) {
//						talking = false;
//						out.println(line);
//					}

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(line);
				//conversation.setText(conv.getText() + line)
			}
		}
		//AudioSerializable audioRecibido = null;

//		while (talking) {
//			try {
//				audioRecibido = (AudioSerializable)inAudio.readObject();
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			try {
//				
//			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioRecibido.getFile());
//			Clip clip = AudioSystem.getClip();
//			clip.open(audioInputStream);
//			clip.start();
//			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
//			gainControl.setValue(-20.0f); // Reduce volume by 10 decibels.
//			} catch(Exception ex) {
//			System.out.println("Error playing sound.");
//			ex.printStackTrace();
//			}
//			
//		}
		
		
	}


