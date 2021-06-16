package chatWindow;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client {

	/* Port 5002 */
	private final static int PORT = 5011;

	private final static String SERVER = "127.0.0.1";

	public static void main(String[] args) {
//		boolean exit = false;// bandera para controlar ciclo del programa
		Socket socket;// Socket para la comunicacion cliente servidor

		
		try {
			System.out.println("Client -> Start");
			socket = new Socket(SERVER, PORT);// open socket
			
			
			//Crear streams de audio
			ObjectOutputStream outObjeto = new ObjectOutputStream(socket.getOutputStream());
				
			//AUDIO FILE
			
			File fx = new File("C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\fx\\BOTW_Fanfare_SmallItem.wav");
			File fx2 = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/fx/BOTW_Fanfare_SmallItem.wav");
			
			AudioSerializable audioEnviar = new AudioSerializable(fx2);
			outObjeto.writeObject(audioEnviar);


		} catch (IOException ex) {
			System.err.println("Client -> " + ex.getMessage());
		}
	}
	
}
