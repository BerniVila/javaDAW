package chatWindow;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	
	/* We keep the port in a constant */
	private final static int PORT = 5004;
	
	private static boolean talking = true;
	

	public static void main(String[] args) {

		try {
			Scanner tec = new Scanner(System.in);
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
			// an input reader to read from the socket
			BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			
			/////////////////////////////
			
			ObjectOutputStream outObjeto = new ObjectOutputStream(client.getOutputStream());
			ObjectInputStream inObjeto = new ObjectInputStream(client.getInputStream());
			//creando archivo de audio para enviar
			File fx = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/fx/BOTW_Fanfare_SmallItem.wav");
			
			AudioSerializable audioToSend = new AudioSerializable(fx);			
			
			
			
			FileInputStream inAudio = new FileInputStream(fx);
			
			BufferedInputStream in = new BufferedInputStream(inAudio);
			
			
			
			
			
			
			

			// to print data out
			PrintStream output = new PrintStream(client.getOutputStream());
			
			//creating reading thread object
			//Reading chatInput = new Reading(input, output);
			Reading chatAudio = new Reading(inAudio, output);
			chatAudio.start();
			
			while(talking) {

				// now we read a line from the keyboard
				System.out.println("Server -> type a sentence to send to the client:");
				String line2 = tec.nextLine();
				output.flush();// empty contents
				output.println(line2);
				System.out.println("Server -> send the line to the client");
				// close connection
				
				if (line2.equalsIgnoreCase("bye")) {
					
					talking = false;
				}
			}
			client.close();
			server.close();
			


		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
	}
	
}
