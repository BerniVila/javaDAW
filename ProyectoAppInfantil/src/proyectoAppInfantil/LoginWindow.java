package proyectoAppInfantil;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindow {

	private JFrame loginFrame;
	private JTextField textNombreUsuario;
	private String avatar = "avatarInexistente";
	ArrayList<String> listaUsuarios;
	ConexionDB conexion;

	// added to use from main window
	public JFrame getLoginWindow() {
		return loginFrame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		try {
			conexion = new ConexionDB();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		loginFrame = new JFrame();
		loginFrame.setBounds(480, 100, 620, 529);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 153, 102));
		panel.setBounds(0, 195, 640, 311);
		loginFrame.getContentPane().add(panel);

		JButton btnAvatar_1 = new JButton("");
		btnAvatar_1.setName("alpaca");
		btnAvatar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_1.setIcon(new ImageIcon(LoginWindow.class.getResource("/images/avatars/avatar-alpaca.gif")));
		btnAvatar_1.setSize(new Dimension(100, 100));
		btnAvatar_1.setSelected(true);
		btnAvatar_1.setPreferredSize(new Dimension(100, 100));
		btnAvatar_1.setOpaque(true);
		btnAvatar_1.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_1.setLocation(new Point(0, 2));
		btnAvatar_1.setIconTextGap(0);
		btnAvatar_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_1.setBounds(36, 32, 100, 100);
		panel.add(btnAvatar_1);

		JButton btnAvatar_2 = new JButton("");
		btnAvatar_2.setName("aguacate");
		btnAvatar_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_2.setIcon(new ImageIcon(LoginWindow.class.getResource("/images/avatars/avatar-avocado.gif")));
		btnAvatar_2.setSize(new Dimension(100, 100));
		btnAvatar_2.setSelected(true);
		btnAvatar_2.setPreferredSize(new Dimension(100, 100));
		btnAvatar_2.setOpaque(true);
		btnAvatar_2.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_2.setLocation(new Point(0, 2));
		btnAvatar_2.setIconTextGap(0);
		btnAvatar_2.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_2.setBounds(185, 32, 100, 100);
		panel.add(btnAvatar_2);

		JButton btnAvatar_3 = new JButton("");
		btnAvatar_3.setName("calamar");
		btnAvatar_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_3.setIcon(new ImageIcon(LoginWindow.class.getResource("/images/avatars/avatar-squidGuitar.gif")));
		btnAvatar_3.setSize(new Dimension(100, 100));
		btnAvatar_3.setSelected(true);
		btnAvatar_3.setPreferredSize(new Dimension(100, 100));
		btnAvatar_3.setOpaque(true);
		btnAvatar_3.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_3.setLocation(new Point(0, 2));
		btnAvatar_3.setIconTextGap(0);
		btnAvatar_3.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_3.setBounds(338, 32, 100, 100);
		panel.add(btnAvatar_3);

		JButton btnAvatar_4 = new JButton("");
		btnAvatar_4.setName("leon");
		btnAvatar_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_4.setIcon(new ImageIcon(LoginWindow.class.getResource("/images/avatars/avatar-lion.gif")));
		btnAvatar_4.setSize(new Dimension(100, 100));
		btnAvatar_4.setSelected(true);
		btnAvatar_4.setPreferredSize(new Dimension(100, 100));
		btnAvatar_4.setOpaque(true);
		btnAvatar_4.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_4.setLocation(new Point(0, 2));
		btnAvatar_4.setIconTextGap(0);
		btnAvatar_4.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_4.setBounds(485, 32, 100, 100);
		panel.add(btnAvatar_4);

		JButton btnAvatar_7 = new JButton("");
		btnAvatar_7.setName("unicornio");
		btnAvatar_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_7.setIcon(new ImageIcon(LoginWindow.class.getResource("/images/avatars/avatar-unicorn.gif")));
		btnAvatar_7.setSize(new Dimension(100, 100));
		btnAvatar_7.setSelected(true);
		btnAvatar_7.setPreferredSize(new Dimension(100, 100));
		btnAvatar_7.setOpaque(true);
		btnAvatar_7.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_7.setLocation(new Point(0, 2));
		btnAvatar_7.setIconTextGap(0);
		btnAvatar_7.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_7.setBounds(338, 161, 100, 100);
		panel.add(btnAvatar_7);

		JButton btnAvatar_8 = new JButton("");
		btnAvatar_8.setName("gato");
		btnAvatar_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_8.setIcon(new ImageIcon(LoginWindow.class.getResource("/images/avatars/avatar-cat.gif")));
		btnAvatar_8.setSize(new Dimension(100, 100));
		btnAvatar_8.setSelected(true);
		btnAvatar_8.setPreferredSize(new Dimension(100, 100));
		btnAvatar_8.setOpaque(true);
		btnAvatar_8.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_8.setLocation(new Point(0, 2));
		btnAvatar_8.setIconTextGap(0);
		btnAvatar_8.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_8.setBounds(485, 161, 100, 100);
		panel.add(btnAvatar_8);

		JButton btnAvatar_5 = new JButton("");
		btnAvatar_5.setName("monete");
		btnAvatar_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_5.setIcon(new ImageIcon(LoginWindow.class.getResource("/images/avatars/avatar-monkey.gif")));
		btnAvatar_5.setSize(new Dimension(100, 100));
		btnAvatar_5.setSelected(true);
		btnAvatar_5.setPreferredSize(new Dimension(100, 100));
		btnAvatar_5.setOpaque(true);
		btnAvatar_5.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_5.setLocation(new Point(0, 2));
		btnAvatar_5.setIconTextGap(0);
		btnAvatar_5.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_5.setBounds(36, 161, 100, 100);
		panel.add(btnAvatar_5);

		JButton btnAvatar_6 = new JButton("");
		btnAvatar_6.setName("perro");
		btnAvatar_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_6.setIcon(new ImageIcon(LoginWindow.class.getResource("/images/avatars/avatar-dog.gif")));
		btnAvatar_6.setSize(new Dimension(100, 100));
		btnAvatar_6.setSelected(true);
		btnAvatar_6.setPreferredSize(new Dimension(100, 100));
		btnAvatar_6.setOpaque(true);
		btnAvatar_6.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_6.setLocation(new Point(0, 2));
		btnAvatar_6.setIconTextGap(0);
		btnAvatar_6.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_6.setBounds(185, 161, 100, 100);
		panel.add(btnAvatar_6);

		textNombreUsuario = new JTextField();
		textNombreUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		textNombreUsuario.setBounds(28, 81, 226, 43);
		loginFrame.getContentPane().add(textNombreUsuario);
		textNombreUsuario.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("ESCRIBE TU NOMBRE DE USUARIO");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(28, 21, 242, 32);
		loginFrame.getContentPane().add(lblNewLabel_1);

		JLabel lblEligeTuAvatar = new JLabel("HAZ CLICK EN TU AVATAR");
		lblEligeTuAvatar.setBounds(28, 151, 226, 32);
		loginFrame.getContentPane().add(lblEligeTuAvatar);
		lblEligeTuAvatar.setForeground(new Color(0, 51, 51));
		lblEligeTuAvatar.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		JButton btnJugar = new JButton("JUGAR AHORA");
		btnJugar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnJugar.setOpaque(true);
		btnJugar.setBorderPainted(false);
		btnJugar.setBackground(new Color(102, 153, 204));
		btnJugar.setBounds(356, 38, 231, 131);
		loginFrame.getContentPane().add(btnJugar);

		// LISTA DE AVATARES
		// ////////////////////////////////////////////////////////////////////////////////////////////

		ArrayList<JButton> avatarButtons = new ArrayList<JButton>();
		avatarButtons.add(btnAvatar_1);
		avatarButtons.add(btnAvatar_2);
		avatarButtons.add(btnAvatar_3);
		avatarButtons.add(btnAvatar_4);
		avatarButtons.add(btnAvatar_5);
		avatarButtons.add(btnAvatar_6);
		avatarButtons.add(btnAvatar_7);
		avatarButtons.add(btnAvatar_8);

		btnAvatar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_1.getName();
				RegisterWindow.isSelectedAvatar(avatarButtons);
			}
		});

		btnAvatar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_2.getName();
				RegisterWindow.isSelectedAvatar(avatarButtons);
			}
		});

		btnAvatar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_3.getName();
				RegisterWindow.isSelectedAvatar(avatarButtons);
			}
		});

		btnAvatar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_4.getName();
				RegisterWindow.isSelectedAvatar(avatarButtons);
			}
		});

		btnAvatar_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_5.getName();
				RegisterWindow.isSelectedAvatar(avatarButtons);
			}
		});

		btnAvatar_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_6.getName();
				RegisterWindow.isSelectedAvatar(avatarButtons);
			}
		});

		btnAvatar_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_7.getName();
				RegisterWindow.isSelectedAvatar(avatarButtons);
			}
		});

		btnAvatar_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_8.getName();
				RegisterWindow.isSelectedAvatar(avatarButtons);
			}
		});

		
		
//		listaUsuarios = new ArrayList<String>();
//
//		try {
//			listaUsuarios = conexion.leerUsuarios();
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombreUsuario = textNombreUsuario.getText();
				
				try {
					//System.out.println(conexion.validarUsuario(nombreUsuario, avatar));
					boolean usuarioValido = conexion.validarUsuario(nombreUsuario, avatar);
					
					if (usuarioValido) {
						
						NumbersWindow numbersWindow = new NumbersWindow();
						numbersWindow.getNumbersWindow().setVisible(true);
						numbersWindow.setNombreUsuario(nombreUsuario);
						loginFrame.setVisible(false);
						
						
						
					}else {
						JOptionPane.showMessageDialog(loginFrame, "Algo ha ido mal",
								"Warning", JOptionPane.INFORMATION_MESSAGE);
					}
					

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

	}
}
