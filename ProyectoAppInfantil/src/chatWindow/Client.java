package chatWindow;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Client {

	/* Port 5002 */
	private final static int PORT = 5002;

	private final static String SERVER = "192.168.31.5";

	public static void main(String[] args) {
		boolean exit = false;// bandera para controlar ciclo del programa
		Socket socket;// Socket para la comunicacion cliente servidor

		
		try {
			System.out.println("Client -> Start");
			socket = new Socket(SERVER, PORT);// open socket
			// To read from the server
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// to write to the server
			PrintStream output = new PrintStream(socket.getOutputStream());
			
			
			//Crear streams de audio
			ObjectOutputStream outObjeto = new ObjectOutputStream(socket.getOutputStream());
			//ObjectInputStream inObjeto = new ObjectInputStream(socket.getInputStream());
			
			//AUDIO FILE
			
			File bso = new File("C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\fx\\BOTW_Fanfare_SmallItem.wav");

			try {
				AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bso);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (Exception ex) {
				System.out.println("Error with playing sound.");
				ex.printStackTrace();
			}
			
			
			
			// To read from the user (keyboard)
			Scanner tec = new Scanner(System.in);
			System.out.println("Client -> Write a sentence to send:");
			String line = tec.nextLine();
			// send the line to the server
			output.println(line);
			// read the answer and print it
			String st = input.readLine();
			if (st != null)
				System.out.println("Client -> received message: " + st);
			System.out.println("Client -> End of the program");

			socket.close();

		} catch (IOException ex) {
			System.err.println("Client -> " + ex.getMessage());
		}
	}
	
}
