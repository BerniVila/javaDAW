package chatAyuda;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chatWindow.ChatWindow;
import chatWindow.Reading;

public class ChatAyudaServer {

	

	private JFrame frame;
	private JTextField textField;
	private JButton btnConnectServer;
	private int port;
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
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatAyudaServer window = new ChatAyudaServer();
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
	public ChatAyudaServer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 13, 480, 194);
		frame.getContentPane().add(scrollPane);

		textChatPanel = new JTextArea(20, 20);
		scrollPane.setColumnHeaderView(textChatPanel);
		textChatPanel.setEditable(false);

		

		btnConnectServer = new JButton("Connect as Server");
		btnConnectServer.setBounds(16, 13, 172, 91);
		btnConnectServer.setMargin(new Insets(10, 10, 10, 10));
		btnConnectServer.setBorderPainted(false);
		btnConnectServer.setOpaque(true);
		btnConnectServer.setBackground(new Color(0, 153, 102));
		frame.getContentPane().add(btnConnectServer);
		


		
		btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setBounds(44, 115, 115, 29);
		btnDisconnect.setBorderPainted(false);
		btnDisconnect.setOpaque(true);
		btnDisconnect.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDisconnect.setBackground(new Color(153, 51, 51));
		btnDisconnect.setForeground(Color.WHITE);
		frame.getContentPane().add(btnDisconnect);

		textField = new JTextField();
		textField.setBounds(200, 227, 395, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(true);
		updateEdition();

		JButton btnSend = new JButton("");
		btnSend.setBounds(600, 227, 80, 48);
		btnSend.setContentAreaFilled(false);
		btnSend.setMinimumSize(new Dimension(30, 29));
		btnSend.setMaximumSize(new Dimension(30, 29));
		btnSend.setIconTextGap(2);
		//btnSend.setIcon(new ImageIcon(ChatWindow.class.getResource("/images/send-message-icon.png")));
		btnSend.setForeground(Color.WHITE);
		btnSend.setBackground(Color.WHITE);
		btnSend.setOpaque(true);
		frame.getContentPane().add(btnSend);

		// events

		btnConnectServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame enterUserClient = new JFrame();
				user = JOptionPane.showInputDialog(frame, "USER?");

				JFrame enterPort = new JFrame();
				String serverPort = JOptionPane.showInputDialog(frame, "Port?");
				port = Integer.parseInt(serverPort);
				try {

					// Server Socket to wait for network requests
					ServerSocket server = new ServerSocket(port);
					frame.setTitle(user + " connected to port " + serverPort);

					// Client Socket
					//Socket client;
					client = server.accept();
					// setSoLinger closes the socket giving 10mS to receive the remaining data
					client.setSoLinger(true, 10);
					// an input reader to read from the socket
					input = new BufferedReader(new InputStreamReader(client.getInputStream()));
					// to print data out
					output = new PrintStream(client.getOutputStream());

					Reading chatInput = new Reading(input, output, textChatPanel);
					chatInput.start();
					
					state = CONNECTED;
					updateEdition();

				} catch (IOException ex) {
					System.err.println(ex.getMessage());
				}
				
			}
		});

//		btnConnectClient.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				JFrame enterUserClient = new JFrame();
//				user = JOptionPane.showInputDialog(frame, "USER?");
//
//				// boolean exit = false;// bandera para controlar ciclo del programa
//
//
//				JFrame enterIp = new JFrame();
//				serverIP = JOptionPane.showInputDialog(frame, "IP?");
//
//				JFrame enterServer = new JFrame();
//				String clientPort = JOptionPane.showInputDialog(frame, "Port?");
//				port = Integer.parseInt(clientPort);
//
//				try {
//
//					socket = new Socket(serverIP, port);// open socket
//					// To read from the server
//					input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//					// to write to the server
//					output = new PrintStream(socket.getOutputStream());
//
//					frame.setTitle(user + " connected with port " + clientPort + " on IP " + serverIP);
//
//					Reading chatInput = new Reading(input, output, textChatPanel);
//					chatInput.start();
//					
//					state = CONNECTED;
//					updateEdition();
//
//				} catch (IOException ex) {
//					System.err.println("Client -> " + ex.getMessage());
//				}
//
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
}
