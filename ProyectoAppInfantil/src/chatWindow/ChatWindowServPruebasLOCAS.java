package chatWindow;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Insets;
import javax.swing.JTextField;
import proyectoAppInfantil.NumbersWindow;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;


public class ChatWindowServPruebasLOCAS {

	private JFrame serverWindow;
	private JTextField textField;
	private JButton btnConnectServer;
	//private JButton btnConnectClient;
	private int port;
	private String serverIP;
	private BufferedReader input;
	private PrintStream output;
	private String user;
//	private JButton btnDisconnect;

	JTextArea textChatPanel;
	Socket socket;
	Socket client;

	private final int NOT_CONNECTED = 1;
	private final int CONNECTED = 2;
	private int state = NOT_CONNECTED;
	private JScrollPane scrollPane;
	
	
	
	// added to use from main window
	public JFrame getServerWindow() {
		return serverWindow;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatWindowServPruebasLOCAS window = new ChatWindowServPruebasLOCAS();
					window.serverWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

	/**
	 * Create the application.
	 */
	public ChatWindowServPruebasLOCAS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		serverWindow = new JFrame();
		serverWindow.getContentPane().setBackground(new Color(102, 102, 204));
		serverWindow.setBounds(100, 100, 675, 422);
		serverWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		serverWindow.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 4, 480, 237);
		serverWindow.getContentPane().add(scrollPane);

		textChatPanel = new JTextArea(10, 20);
		scrollPane.setViewportView(textChatPanel);
		textChatPanel.setEditable(false);


		btnConnectServer = new JButton("Conectar con alumnos");
		btnConnectServer.setBounds(88, 316, 273, 55);
		btnConnectServer.setMargin(new Insets(10, 10, 10, 10));
		btnConnectServer.setBorderPainted(false);
		btnConnectServer.setOpaque(true);
		btnConnectServer.setBackground(new Color(0, 153, 102));
		serverWindow.getContentPane().add(btnConnectServer);
		

//		btnConnectClient = new JButton("Connect as Client");
//		btnConnectClient.setBounds(134, 324, 172, 55);
//		btnConnectClient.setOpaque(true);
//		btnConnectClient.setBorderPainted(false);
//		btnConnectClient.setBackground(new Color(51, 153, 204));
//		frame.getContentPane().add(btnConnectClient);
		
//		btnDisconnect = new JButton("Disconnect");
//		btnDisconnect.setBounds(13, 325, 115, 55);
//		btnDisconnect.setBorderPainted(false);
//		btnDisconnect.setOpaque(true);
//		btnDisconnect.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnDisconnect.setBackground(new Color(153, 51, 51));
//		btnDisconnect.setForeground(Color.WHITE);
//		serverWindow.getContentPane().add(btnDisconnect);

		textField = new JTextField();
		textField.setBounds(9, 256, 395, 48);
		serverWindow.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(true);
		updateEdition();

		JButton btnSend = new JButton("");
		btnSend.setBounds(409, 256, 80, 48);
		btnSend.setContentAreaFilled(false);
		btnSend.setMinimumSize(new Dimension(30, 29));
		btnSend.setMaximumSize(new Dimension(30, 29));
		btnSend.setIconTextGap(2);
		btnSend.setIcon(new ImageIcon(ChatWindowServPruebas.class.getResource("/images/icons/send-message-icon.png")));
		btnSend.setForeground(Color.WHITE);
		btnSend.setBackground(Color.WHITE);
		btnSend.setOpaque(true);
		serverWindow.getContentPane().add(btnSend);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBounds(502, 9, 75, 75);
		serverWindow.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBounds(589, 9, 75, 75);
		serverWindow.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBounds(501, 86, 75, 75);
		serverWindow.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBounds(588, 86, 75, 75);
		serverWindow.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBounds(501, 166, 75, 75);
		serverWindow.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBounds(588, 166, 75, 75);
		serverWindow.getContentPane().add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBounds(502, 243, 75, 75);
		serverWindow.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBounds(589, 243, 75, 75);
		serverWindow.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBounds(502, 319, 75, 75);
		serverWindow.getContentPane().add(btn_9);
		
		JButton btn_10 = new JButton("10");
		btn_10.setBounds(589, 319, 75, 75);
		serverWindow.getContentPane().add(btn_10);
		
		
		
		
		

		// events

		btnConnectServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame enterUserClient = new JFrame();
				user = JOptionPane.showInputDialog(serverWindow, "Que profe eres?");

				JFrame enterPort = new JFrame();
				String serverPort = JOptionPane.showInputDialog(serverWindow, "Que puerto quieres usar?");
				port = Integer.parseInt(serverPort);
				
//				String serverPort = "5012";
//				port = 5012;
				
				try {

					// Server Socket to wait for network requests
					ServerSocket server = new ServerSocket(port);
					serverWindow.setTitle(user + " conectado al puerto " + serverPort);

					// Client Socket
					//Socket client;
					client = server.accept();
					// setSoLinger closes the socket giving 10mS to receive the remaining data
					client.setSoLinger(true, 10);
					

					// an input reader to read from the socket
					input = new BufferedReader(new InputStreamReader(client.getInputStream()));
					// to print data out
					output = new PrintStream(client.getOutputStream());

					Reading2 chatInput = new Reading2(input, output, textChatPanel);
					chatInput.start();
					
									
					
					state = CONNECTED;
					updateEdition();

				} catch (IOException ex) {
					System.err.println(ex.getMessage());
				}
				
				
			}
		});



		// send Message
		
//		String message = "llevo 1 y he de llegar a 10";
//		output.flush();
//		output.println(message);
//		output.flush();
//		textChatPanel.append("\n" +  message + "\n");
		
		

		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = user + "  -->  " + textField.getText();

				output.flush();
				output.println(message);
				output.flush();

				textChatPanel.append("\n" +  message + "\n");
				textField.setText("");
				//System.out.println(textChatPanel.getText());

			}
		});
		
		
//		btnDisconnect.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					client.close();
//					socket.close();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//
//			}
//		});
		
		

		

	}

	public void updateEdition() {
		switch (state) {
		case CONNECTED:
			textField.setEnabled(true);
			break;
			
		case NOT_CONNECTED:
			textField.setEnabled(false);
			break;	
			
		default:
			break;
		}
	}
}
