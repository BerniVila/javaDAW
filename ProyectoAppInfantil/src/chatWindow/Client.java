package chatWindow;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client {

	/* Port 5002 */
	private final static int PORT = 5014;

	private final static String SERVER = "127.0.0.1";

	public static void main(String[] args) {
//		boolean exit = false;// bandera para controlar ciclo del programa
		Socket socket;// Socket para la comunicacion cliente servidor

		
		try {
			System.out.println("Client -> Start");
			socket = new Socket(SERVER, PORT);// open socket
			
			//Crear streams de audio
			ObjectOutputStream outObjeto = new ObjectOutputStream(socket.getOutputStream());
				
			//outObjeto.flush();
			//AUDIO FILE
			
			File fx = new File("C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\numberSounds\\uno16.wav");
			//File fx2 = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/fx/BOTW_Fanfare_SmallItem.wav");
			//File fx3 = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/numberSounds/elNumeroUno.wav");
			

//			AudioSerializable audioEnviar = new AudioSerializable(fx);
//			outObjeto.writeObject(audioEnviar);

			SoundSerializer soundSend = new SoundSerializer();
			outObjeto.writeObject(soundSend);
			
			//outObjeto.flush();// empty contents
			
			
		} catch (IOException ex) {
			System.err.println("Client -> " + ex.getMessage());
		}
	}
	
}
