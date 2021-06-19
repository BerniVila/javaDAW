package chatWindow;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
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


public class ChatWindowCLIPruebasLOCAS {

	private JFrame frame;
	private JTextField textField;
//	private JButton btnConnectClient;
	private int port;
	private String serverIP;
	private BufferedReader input;
	private PrintStream output;
	private String user;
	private JButton btnDisconnect;

	JTextArea textChatPanel;
	Socket socket;
	Socket client;

	private final int NOT_CONNECTED = 1;
	private final int CONNECTED = 2;
	private int state = NOT_CONNECTED;
	private JScrollPane scrollPane;
	
	private String estadoJuego;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatWindowCLIPruebasLOCAS window = new ChatWindowCLIPruebasLOCAS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

	/**
	 * Create the application.
	 */
	public ChatWindowCLIPruebasLOCAS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 102, 204));
		frame.setBounds(100, 100, 675, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 4, 480, 237);
		frame.getContentPane().add(scrollPane);

		textChatPanel = new JTextArea(10, 20);
		scrollPane.setViewportView(textChatPanel);
		textChatPanel.setEditable(false);

		

//		btnConnectClient = new JButton("Connect as Client");
//		btnConnectClient.setBounds(134, 324, 172, 55);
//		btnConnectClient.setOpaque(true);
//		btnConnectClient.setBorderPainted(false);
//		btnConnectClient.setBackground(new Color(51, 153, 204));
//		frame.getContentPane().add(btnConnectClient);
		
		btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setBounds(13, 325, 115, 55);
		btnDisconnect.setBorderPainted(false);
		btnDisconnect.setOpaque(true);
		btnDisconnect.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDisconnect.setBackground(new Color(153, 51, 51));
		btnDisconnect.setForeground(Color.WHITE);
		frame.getContentPane().add(btnDisconnect);

		textField = new JTextField();
		textField.setBounds(9, 256, 395, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(true);
		updateEdition();

		JButton btnSend = new JButton("");
		btnSend.setBounds(409, 256, 80, 48);
		btnSend.setContentAreaFilled(false);
		btnSend.setMinimumSize(new Dimension(30, 29));
		btnSend.setMaximumSize(new Dimension(30, 29));
		btnSend.setIconTextGap(2);
		btnSend.setIcon(new ImageIcon(ChatWindowCLIPruebasLOCAS.class.getResource("/images/icons/send-message-icon.png")));
		btnSend.setForeground(Color.WHITE);
		btnSend.setBackground(Color.WHITE);
		btnSend.setOpaque(true);
		frame.getContentPane().add(btnSend);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(502, 9, 75, 75);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(589, 9, 75, 75);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(501, 86, 75, 75);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(588, 86, 75, 75);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(501, 166, 75, 75);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBounds(588, 166, 75, 75);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(502, 243, 75, 75);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("New button");
		btnNewButton_1_3.setBounds(589, 243, 75, 75);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_4_1 = new JButton("New button");
		btnNewButton_4_1.setBounds(502, 319, 75, 75);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_1_3_1 = new JButton("New button");
		btnNewButton_1_3_1.setBounds(589, 319, 75, 75);
		frame.getContentPane().add(btnNewButton_1_3_1);
		
		
		
		
		

		// events


		
		
		

//		btnConnectClient.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
				
//				JFrame enterUserClient = new JFrame();
//				user = JOptionPane.showInputDialog(frame, "USER?");

				// boolean exit = false;// bandera para controlar ciclo del programa


//				JFrame enterIp = new JFrame();
//				serverIP = JOptionPane.showInputDialog(frame, "IP?");
		
		
				serverIP = "127.0.0.1";

				JFrame enterServer = new JFrame();
				String clientPort = JOptionPane.showInputDialog(frame, "Port?");
				port = Integer.parseInt(clientPort);

				try {

					socket = new Socket("127.0.0.1", port);// open socket
					// To read from the server
					input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					// to write to the server
					output = new PrintStream(socket.getOutputStream());

					frame.setTitle("Conectado por puerto " + clientPort + " a IP " + serverIP);

					Reading2 chatInput = new Reading2(input, output, textChatPanel);
					chatInput.start();
					
					state = CONNECTED;
					updateEdition();

				} catch (IOException ex) {
					System.err.println("Client -> " + ex.getMessage());
				}

//			}
//		});
				
				
				

		// send Message

		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = user + "  -->  " + textField.getText();

				output.flush();
				output.println(message);
				output.flush();

				textChatPanel.append("\n" +  message + "\n");
				textField.setText("");
				System.out.println(textChatPanel.getText());

			}
		});
		
		
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					client.close();
					socket.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		

		

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
	
	
	public void setEstadoJuego(String estadoJuego) {
		this.estadoJuego = estadoJuego;
	}
	
	public String getEstadoJuego() {
		return estadoJuego;
	}
	
	
}
