package chatWindow;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import proyectoAppInfantil.StaticSoundMethods;

public class Server {
	
	
	/* We keep the port in a constant */
	private final static int PORT = 5011;
	
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
			
			ObjectInputStream inObjeto = new ObjectInputStream(client.getInputStream());
			//ObjectInputStream inObjeto = new ObjectInputStream(client.getInputStream());
			try {
				AudioSerializable audioRecibir = (AudioSerializable)inObjeto.readObject();
				File archivo = audioRecibir.getFile();
				StaticSoundMethods.playSound(archivo);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			


			
			

			client.close();
			server.close();
			


		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
	}
	
}
