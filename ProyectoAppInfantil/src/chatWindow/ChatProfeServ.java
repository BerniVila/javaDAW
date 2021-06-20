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
import java.awt.Font;
import javax.swing.SwingConstants;


public class ChatProfeServ {


	private JFrame chatProfeServ;
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
	public JFrame getChatProfeServ() {
		return chatProfeServ;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatProfeServ window = new ChatProfeServ();
					window.chatProfeServ.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	

	/**
	 * Create the application.
	 */
	public ChatProfeServ() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		chatProfeServ = new JFrame();
		chatProfeServ.getContentPane().setBackground(new Color(102, 102, 204));
		chatProfeServ.setBounds(100, 100, 675, 422);
		chatProfeServ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chatProfeServ.getContentPane().setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 4, 480, 237);
		chatProfeServ.getContentPane().add(scrollPane);

		textChatPanel = new JTextArea(10, 20);
		scrollPane.setViewportView(textChatPanel);
		textChatPanel.setEditable(false);


		btnConnectServer = new JButton("Conectar con alumnos");
		btnConnectServer.setBounds(98, 316, 273, 67);
		btnConnectServer.setMargin(new Insets(10, 10, 10, 10));
		btnConnectServer.setBorderPainted(false);
		btnConnectServer.setOpaque(true);
		btnConnectServer.setBackground(new Color(0, 153, 102));
		chatProfeServ.getContentPane().add(btnConnectServer);
		

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
		chatProfeServ.getContentPane().add(textField);
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
		chatProfeServ.getContentPane().add(btnSend);
		
		JButton btn_1 = new JButton("1");
		btn_1.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_1.setForeground(new Color(255, 255, 255));
		btn_1.setBorderPainted(false);
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setOpaque(true);
		btn_1.setBackground(new Color(102, 153, 102));
		btn_1.setBounds(501, 4, 75, 75);
		chatProfeServ.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setOpaque(true);
		btn_2.setBorderPainted(false);
		btn_2.setBackground(new Color(0, 102, 153));
		btn_2.setForeground(new Color(255, 255, 255));
		btn_2.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_2.setBounds(588, 4, 75, 75);
		chatProfeServ.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBackground(new Color(255, 153, 102));
		btn_3.setBorderPainted(false);
		btn_3.setOpaque(true);
		btn_3.setForeground(new Color(255, 255, 255));
		btn_3.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_3.setBounds(501, 86, 75, 75);
		chatProfeServ.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("4");
		btn_4.setOpaque(true);
		btn_4.setForeground(new Color(255, 255, 255));
		btn_4.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_4.setBackground(new Color(255, 153, 204));
		btn_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4.setBorderPainted(false);
		btn_4.setBounds(588, 86, 75, 75);
		chatProfeServ.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBackground(new Color(51, 204, 204));
		btn_5.setBorderPainted(false);
		btn_5.setForeground(new Color(255, 255, 255));
		btn_5.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_5.setOpaque(true);
		btn_5.setBounds(501, 166, 75, 75);
		chatProfeServ.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setOpaque(true);
		btn_6.setForeground(new Color(255, 255, 255));
		btn_6.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_6.setBorderPainted(false);
		btn_6.setBackground(new Color(102, 102, 102));
		btn_6.setBounds(588, 166, 75, 75);
		chatProfeServ.getContentPane().add(btn_6);
		
		JButton btn_7 = new JButton("7");
		btn_7.setOpaque(true);
		btn_7.setForeground(new Color(255, 255, 255));
		btn_7.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_7.setBorderPainted(false);
		btn_7.setBackground(new Color(204, 153, 204));
		btn_7.setBounds(502, 243, 75, 75);
		chatProfeServ.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setForeground(new Color(255, 255, 255));
		btn_8.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_8.setOpaque(true);
		btn_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_8.setBorderPainted(false);
		btn_8.setBackground(new Color(204, 204, 102));
		btn_8.setBounds(589, 243, 75, 75);
		chatProfeServ.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setForeground(new Color(255, 255, 255));
		btn_9.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
		btn_9.setOpaque(true);
		btn_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_9.setBorderPainted(false);
		btn_9.setBackground(new Color(102, 0, 0));
		btn_9.setBounds(502, 319, 75, 75);
		chatProfeServ.getContentPane().add(btn_9);
		
		JButton btn_10 = new JButton("10");
		btn_10.setMargin(new Insets(0, 0, 0, 0));
		btn_10.setHorizontalAlignment(SwingConstants.TRAILING);
		btn_10.setOpaque(true);
		btn_10.setForeground(new Color(255, 255, 255));
		btn_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 31));
		btn_10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_10.setBorderPainted(false);
		btn_10.setBackground(new Color(102, 0, 204));
		btn_10.setBounds(589, 319, 75, 75);
		chatProfeServ.getContentPane().add(btn_10);
		
		
		
		
		

		// events

		btnConnectServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame enterUserClient = new JFrame();
				user = JOptionPane.showInputDialog(chatProfeServ, "Que profe eres?");

				JFrame enterPort = new JFrame();
				String serverPort = JOptionPane.showInputDialog(chatProfeServ, "Que puerto quieres usar?");
				port = Integer.parseInt(serverPort);
				
//				String serverPort = "5012";
//				port = 5012;
				
				try {

					// Server Socket to wait for network requests
					ServerSocket server = new ServerSocket(port);
					chatProfeServ.setTitle(user + " conectado al puerto " + serverPort);

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
		
		
		// BOTONES CON NUMERO //////////////////////////////////////////////////////
		
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("1");
				output.flush();

			}
		});
		
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("2");
				output.flush();

			}
		});
		
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("3");
				output.flush();

			}
		});
		
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("4");
				output.flush();

			}
		});
		
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("5");
				output.flush();

			}
		});
		
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("6");
				output.flush();

			}
		});
		
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("7");
				output.flush();

			}
		});
		
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("8");
				output.flush();

			}
		});
		
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("9");
				output.flush();

			}
		});
		
		btn_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.flush();
				output.println("10");
				output.flush();

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
