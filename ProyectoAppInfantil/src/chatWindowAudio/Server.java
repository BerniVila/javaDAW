package chatWindowAudio;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import proyectoAppInfantil.StaticSoundMethods;

public class Server {
	
	
	/* We keep the port in a constant */
	private final static int PORT = 5014;
	
	private static boolean talking = true;
	

	public static void main(String[] args) {

		try {
			//Scanner tec = new Scanner(System.in);
			// Server Socket to wait for network requests
			ServerSocket server = new ServerSocket(PORT);
			System.out.println("Server started");

			// Client Socket
			Socket client;
			System.out.println("Server waiting for a client...");
			client = server.accept();
			System.out.println("Connected " + client);
			// setSoLinger closes the socket giving 10mS to receive the remaining data
			client.setSoLinger(true, 10);
//			// an input reader to read from the socket
//			BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			
			/////////////////////////////
			

			try {
				ObjectInputStream inObjeto = new ObjectInputStream(client.getInputStream());
				
				System.out.println("fallo manyanero");
				
				AudioSerializable audioRecibir = (AudioSerializable)inObjeto.readObject();
				File archivo = audioRecibir.getFile();
				//StaticSoundMethods.playSound(archivo);
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivo);
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();

//				ObjectInputStream inObjeto = new ObjectInputStream(client.getInputStream());
//				SoundSerializer soundReceive = (SoundSerializer)inObjeto.readObject();
//				soundReceive.playSound();
					
					
					
					
					//client.close();
					//server.close();
			
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			


			
			

			


		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
	}
	
}
