package chatWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextArea;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class ChatWindow {

	private JFrame frame;
	private JTextField textField;
	private JButton btnConnectServer;
	private JButton btnConnectClient;
	JTextArea textChatPanel;
	private int port;
	private String serverIP;
	private BufferedReader input;
	private PrintStream output;
	private String user;
	private JButton btnDisconnect;
	Socket socket;
	Socket client;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatWindow window = new ChatWindow();
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
	public ChatWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 128, 128, 128, 128, 128, 10 };
		gridBagLayout.rowHeights = new int[] { 48, 48, 96, 96, 96, 48, 48 };
		gridBagLayout.columnWeights = new double[] { 1.0 };
		gridBagLayout.rowWeights = new double[] { 1.0 };
		frame.getContentPane().setLayout(gridBagLayout);

		textChatPanel = new JTextArea();
		GridBagConstraints gbc_textChatPanel = new GridBagConstraints();
		gbc_textChatPanel.gridheight = 5;
		gbc_textChatPanel.gridwidth = 4;
		gbc_textChatPanel.insets = new Insets(0, 0, 5, 5);
		gbc_textChatPanel.fill = GridBagConstraints.BOTH;
		gbc_textChatPanel.gridx = 1;
		gbc_textChatPanel.gridy = 1;
		frame.getContentPane().add(textChatPanel, gbc_textChatPanel);

		btnConnectServer = new JButton("Connect as Server");
		btnConnectServer.setMargin(new Insets(10, 10, 10, 10));
		btnConnectServer.setBorderPainted(false);
		btnConnectServer.setOpaque(true);
		btnConnectServer.setBackground(new Color(0, 153, 102));
		GridBagConstraints gbc_btnConnectServer = new GridBagConstraints();
		gbc_btnConnectServer.fill = GridBagConstraints.BOTH;
		gbc_btnConnectServer.insets = new Insets(0, 0, 5, 5);
		gbc_btnConnectServer.gridx = 0;
		gbc_btnConnectServer.gridy = 2;
		frame.getContentPane().add(btnConnectServer, gbc_btnConnectServer);

		btnConnectClient = new JButton("Connect as Client");
		btnConnectClient.setOpaque(true);
		btnConnectClient.setBorderPainted(false);
		btnConnectClient.setBackground(new Color(51, 153, 204));
		GridBagConstraints gbc_btnConnectClient = new GridBagConstraints();
		gbc_btnConnectClient.fill = GridBagConstraints.BOTH;
		gbc_btnConnectClient.insets = new Insets(0, 0, 5, 5);
		gbc_btnConnectClient.gridx = 0;
		gbc_btnConnectClient.gridy = 3;
		frame.getContentPane().add(btnConnectClient, gbc_btnConnectClient);
		
		btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setBorderPainted(false);
		btnDisconnect.setOpaque(true);
		btnDisconnect.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDisconnect.setBackground(new Color(153, 51, 51));
		btnDisconnect.setForeground(Color.WHITE);
		GridBagConstraints gbc_btnDisconnect = new GridBagConstraints();
		gbc_btnDisconnect.insets = new Insets(0, 0, 5, 5);
		gbc_btnDisconnect.gridx = 0;
		gbc_btnDisconnect.gridy = 4;
		frame.getContentPane().add(btnDisconnect, gbc_btnDisconnect);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 6;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

		JButton btnSend = new JButton("");
		btnSend.setContentAreaFilled(false);
		btnSend.setMinimumSize(new Dimension(30, 29));
		btnSend.setMaximumSize(new Dimension(30, 29));
		btnSend.setIconTextGap(2);
		btnSend.setIcon(new ImageIcon(ChatWindow.class.getResource("/images/send-message-icon.png")));
		btnSend.setForeground(Color.WHITE);
		btnSend.setBackground(Color.WHITE);
		btnSend.setOpaque(true);
		GridBagConstraints gbc_btnSend = new GridBagConstraints();
		gbc_btnSend.fill = GridBagConstraints.BOTH;
		gbc_btnSend.insets = new Insets(0, 0, 0, 5);
		gbc_btnSend.gridx = 4;
		gbc_btnSend.gridy = 6;
		frame.getContentPane().add(btnSend, gbc_btnSend);

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

				} catch (IOException ex) {
					System.err.println(ex.getMessage());
				}
				
			}
		});

		btnConnectClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame enterUserClient = new JFrame();
				user = JOptionPane.showInputDialog(frame, "USER?");

				// boolean exit = false;// bandera para controlar ciclo del programa
				//Socket socket;// Socket para la comunicacion cliente servidor

				JFrame enterIp = new JFrame();
				serverIP = JOptionPane.showInputDialog(frame, "IP?");

				JFrame enterServer = new JFrame();
				String clientPort = JOptionPane.showInputDialog(frame, "Port?");
				port = Integer.parseInt(clientPort);

				try {

					socket = new Socket(serverIP, port);// open socket
					// To read from the server
					input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					// to write to the server
					output = new PrintStream(socket.getOutputStream());

					frame.setTitle(user + " connected with port " + clientPort + " on IP " + serverIP);

					Reading chatInput = new Reading(input, output, textChatPanel);
					chatInput.start();

				} catch (IOException ex) {
					System.err.println("Client -> " + ex.getMessage());
				}

			}
		});

		// send Message

		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = textField.getText();

				output.flush();
				output.println(message);
				output.flush();
				textChatPanel.setText(textChatPanel.getText() + "\n" +  user + "  -->  " + message + "\n");
				textField.setText("");

			}
		});
		
		
		btnDisconnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					socket.close();
					client.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
	}

}
