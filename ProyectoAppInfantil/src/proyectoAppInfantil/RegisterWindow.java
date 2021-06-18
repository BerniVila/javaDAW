package proyectoAppInfantil;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class RegisterWindow {

	private JFrame registerFrame;
	private JTextField textField_ApellidoProgenitor2;
	private JTextField textField_NombreProgenitor;
	private JTextField textField_ApellidoProgenitor1;
	private JPasswordField passwordInsert;
	private JPasswordField passwordConfirm;
	private JTextField textField_NombreAlumno;
	private JTextField textField_ApellidoAlumno1;
	private JTextField textField_ApellidoAlumno2;
	private JTextField textField_NombreUsuario;
	private String avatar = "avatarInexistente";
	ConexionDB conexion;
	

	
	
	// added to use from main window
	public JFrame getRegisterWindow() {
		return registerFrame;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterWindow window = new RegisterWindow();
					window.registerFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegisterWindow() {
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
		
		
		registerFrame = new JFrame();
		registerFrame.setBounds(400, 150, 800, 600);
		registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		registerFrame.getContentPane().setLayout(null);
		
		JLabel lblNombreProgenitor = new JLabel("Nombre Progenitor");
		lblNombreProgenitor.setBounds(44, 58, 126, 16);
		registerFrame.getContentPane().add(lblNombreProgenitor);
		
		textField_NombreProgenitor = new JTextField();
		textField_NombreProgenitor.setBounds(44, 86, 189, 26);
		registerFrame.getContentPane().add(textField_NombreProgenitor);
		textField_NombreProgenitor.setColumns(10);
		
		textField_ApellidoProgenitor1 = new JTextField();
		textField_ApellidoProgenitor1.setBounds(44, 163, 189, 26);
		registerFrame.getContentPane().add(textField_ApellidoProgenitor1);
		textField_ApellidoProgenitor1.setColumns(10);
		
		textField_ApellidoProgenitor2 = new JTextField();
		textField_ApellidoProgenitor2.setBounds(259, 163, 188, 26);
		registerFrame.getContentPane().add(textField_ApellidoProgenitor2);
		textField_ApellidoProgenitor2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce Password");
		lblNewLabel_1.setBounds(44, 376, 145, 16);
		registerFrame.getContentPane().add(lblNewLabel_1);
		
		passwordInsert = new JPasswordField();
		passwordInsert.setBounds(44, 407, 189, 26);
		registerFrame.getContentPane().add(passwordInsert);
		
		JButton btnRegistro = new JButton("Registrarse");
		btnRegistro.setBorderPainted(false);
		btnRegistro.setBackground(new Color(102, 153, 255));
		btnRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistro.setOpaque(true);
		btnRegistro.setBounds(310, 482, 117, 71);
		registerFrame.getContentPane().add(btnRegistro);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar Password");
		lblNewLabel_2.setBounds(44, 454, 135, 16);
		registerFrame.getContentPane().add(lblNewLabel_2);
		
		passwordConfirm = new JPasswordField();
		passwordConfirm.setBounds(44, 482, 189, 26);
		registerFrame.getContentPane().add(passwordConfirm);
		
		
		//AVATAR BUTTONS ///////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 102));
		panel.setBounds(473, 0, 327, 578);
		registerFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAvatar_1 = new JButton("");
		btnAvatar_1.setName("alpaca");
		btnAvatar_1.setSize(new Dimension(100, 100));
		btnAvatar_1.setPreferredSize(new Dimension(100, 100));
		btnAvatar_1.setLocation(new Point(0, 2));
		btnAvatar_1.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_1.setIconTextGap(0);
		btnAvatar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAvatar_1.setOpaque(true);
		btnAvatar_1.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-alpaca.gif")));
		btnAvatar_1.setBounds(36, 65, 100, 100);
		panel.add(btnAvatar_1);
		
		JButton btnAvatar_2 = new JButton("");
		btnAvatar_2.setName("aguacate");
		btnAvatar_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_2.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-avocado.gif")));
		btnAvatar_2.setSize(new Dimension(100, 100));
		btnAvatar_2.setPreferredSize(new Dimension(100, 100));
		btnAvatar_2.setOpaque(true);
		btnAvatar_2.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_2.setLocation(new Point(0, 2));
		btnAvatar_2.setIconTextGap(0);
		btnAvatar_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnAvatar_2.setBounds(185, 65, 100, 100);
		panel.add(btnAvatar_2);
		
		JButton btnAvatar_3 = new JButton("");
		btnAvatar_3.setName("calamar");
		btnAvatar_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_3.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-squidGuitar.gif")));
		btnAvatar_3.setSize(new Dimension(100, 100));
		btnAvatar_3.setPreferredSize(new Dimension(100, 100));
		btnAvatar_3.setOpaque(true);
		btnAvatar_3.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_3.setLocation(new Point(0, 2));
		btnAvatar_3.setIconTextGap(0);
		btnAvatar_3.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_3.setBounds(36, 189, 100, 100);
		panel.add(btnAvatar_3);
		
		JButton btnAvatar_4 = new JButton("");
		btnAvatar_4.setName("leon");
		btnAvatar_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_4.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-lion.gif")));
		btnAvatar_4.setSize(new Dimension(100, 100));
		btnAvatar_4.setPreferredSize(new Dimension(100, 100));
		btnAvatar_4.setOpaque(true);
		btnAvatar_4.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_4.setLocation(new Point(0, 2));
		btnAvatar_4.setIconTextGap(0);
		btnAvatar_4.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_4.setBounds(185, 189, 100, 100);
		panel.add(btnAvatar_4);
		
		JButton btnAvatar_7 = new JButton("");
		btnAvatar_7.setName("unicornio");
		btnAvatar_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_7.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-unicorn.gif")));
		btnAvatar_7.setSize(new Dimension(100, 100));
		btnAvatar_7.setPreferredSize(new Dimension(100, 100));
		btnAvatar_7.setOpaque(true);
		btnAvatar_7.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_7.setLocation(new Point(0, 2));
		btnAvatar_7.setIconTextGap(0);
		btnAvatar_7.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_7.setBounds(36, 452, 100, 100);
		panel.add(btnAvatar_7);
		
		JButton btnAvatar_8 = new JButton("");
		btnAvatar_8.setName("gato");
		btnAvatar_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_8.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-cat.gif")));
		btnAvatar_8.setSize(new Dimension(100, 100));
		btnAvatar_8.setPreferredSize(new Dimension(100, 100));
		btnAvatar_8.setOpaque(true);
		btnAvatar_8.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_8.setLocation(new Point(0, 2));
		btnAvatar_8.setIconTextGap(0);
		btnAvatar_8.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_8.setBounds(185, 452, 100, 100);
		panel.add(btnAvatar_8);
		
		JButton btnAvatar_5 = new JButton("");
		btnAvatar_5.setName("monete");
		btnAvatar_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_5.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-monkey.gif")));
		btnAvatar_5.setSize(new Dimension(100, 100));
		btnAvatar_5.setPreferredSize(new Dimension(100, 100));
		btnAvatar_5.setOpaque(true);
		btnAvatar_5.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_5.setLocation(new Point(0, 2));
		btnAvatar_5.setIconTextGap(0);
		btnAvatar_5.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_5.setBounds(36, 323, 100, 100);
		panel.add(btnAvatar_5);
		
		JButton btnAvatar_6 = new JButton("");
		btnAvatar_6.setName("perro");
		btnAvatar_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_6.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-dog.gif")));
		btnAvatar_6.setSize(new Dimension(100, 100));
		btnAvatar_6.setPreferredSize(new Dimension(100, 100));
		btnAvatar_6.setOpaque(true);
		btnAvatar_6.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_6.setLocation(new Point(0, 2));
		btnAvatar_6.setIconTextGap(0);
		btnAvatar_6.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_6.setBounds(185, 323, 100, 100);
		panel.add(btnAvatar_6);
		
		JLabel lblNewLabel = new JLabel("Elige un avatar para tu hijo/a");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(46, 21, 228, 16);
		panel.add(lblNewLabel);
		
		JLabel lblApellidoProgenitor1 = new JLabel("1er Apellido Progenitor");
		lblApellidoProgenitor1.setBounds(44, 127, 145, 16);
		registerFrame.getContentPane().add(lblApellidoProgenitor1);
		
		JLabel lblNombreAlumno = new JLabel("Nombre Alumno");
		lblNombreAlumno.setBounds(44, 225, 126, 16);
		registerFrame.getContentPane().add(lblNombreAlumno);
		
		textField_NombreAlumno = new JTextField();
		textField_NombreAlumno.setColumns(10);
		textField_NombreAlumno.setBounds(44, 253, 189, 26);
		registerFrame.getContentPane().add(textField_NombreAlumno);
		
		JLabel lblApellidoAlumno1 = new JLabel("1er Apellido Alumno");
		lblApellidoAlumno1.setBounds(44, 294, 145, 16);
		registerFrame.getContentPane().add(lblApellidoAlumno1);
		
		textField_ApellidoAlumno1 = new JTextField();
		textField_ApellidoAlumno1.setColumns(10);
		textField_ApellidoAlumno1.setBounds(44, 330, 189, 26);
		registerFrame.getContentPane().add(textField_ApellidoAlumno1);
		
		textField_ApellidoAlumno2 = new JTextField();
		textField_ApellidoAlumno2.setColumns(10);
		textField_ApellidoAlumno2.setBounds(259, 330, 188, 26);
		registerFrame.getContentPane().add(textField_ApellidoAlumno2);
		
		JLabel lblEdadAlumno = new JLabel("Edad Alumno");
		lblEdadAlumno.setBounds(258, 225, 126, 16);
		registerFrame.getContentPane().add(lblEdadAlumno);
		
		JLabel lbloApellidoProgenitor2 = new JLabel("2o Apellido Progenitor");
		lbloApellidoProgenitor2.setBounds(259, 127, 145, 16);
		registerFrame.getContentPane().add(lbloApellidoProgenitor2);
		
		JLabel lblApellidoAlumno2 = new JLabel("2o Apellido Alumno");
		lblApellidoAlumno2.setBounds(259, 294, 126, 16);
		registerFrame.getContentPane().add(lblApellidoAlumno2);
		
		JLabel lblTitle = new JLabel("FORMULARIO DE REGISTRO");
		lblTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblTitle.setBounds(137, 6, 223, 28);
		registerFrame.getContentPane().add(lblTitle);
		
		JLabel lblPasswordError = new JLabel("Debes escribir el mismo password");
		lblPasswordError.setVisible(false);
		lblPasswordError.setForeground(new Color(204, 51, 51));
		lblPasswordError.setBounds(44, 520, 223, 16);
		registerFrame.getContentPane().add(lblPasswordError);
		
		textField_NombreUsuario = new JTextField();
		textField_NombreUsuario.setColumns(10);
		textField_NombreUsuario.setBounds(258, 404, 189, 26);
		registerFrame.getContentPane().add(textField_NombreUsuario);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setBounds(258, 376, 126, 16);
		registerFrame.getContentPane().add(lblNombreDeUsuario);
		
		JLabel lblNombreUsuarioNoDisponible = new JLabel("Nombre de Usuario NO disponible");
		lblNombreUsuarioNoDisponible.setVisible(false);
		lblNombreUsuarioNoDisponible.setForeground(new Color(255, 51, 51));
		lblNombreUsuarioNoDisponible.setBounds(246, 442, 215, 16);
		registerFrame.getContentPane().add(lblNombreUsuarioNoDisponible);
		
		JSpinner spinnerEdad = new JSpinner();
		spinnerEdad.setBounds(259, 253, 87, 26);
		registerFrame.getContentPane().add(spinnerEdad);
		
		
		//LISTA DE AVATARES ////////////////////////////////////////////////////////////////////////////////////////////
		
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
				isSelectedAvatar(avatarButtons);
			}
		});
		
		btnAvatar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_2.getName();
				isSelectedAvatar(avatarButtons);
			}
		});
		
		btnAvatar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_3.getName();
				isSelectedAvatar(avatarButtons);
			}
		});
		
		btnAvatar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_4.getName();
				isSelectedAvatar(avatarButtons);
			}
		});
		
		btnAvatar_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_5.getName();
				isSelectedAvatar(avatarButtons);
			}
		});
		
		btnAvatar_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_6.getName();
				isSelectedAvatar(avatarButtons);
			}
		});
		
		btnAvatar_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_7.getName();
				isSelectedAvatar(avatarButtons);
			}
		});
		
		btnAvatar_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				avatar = btnAvatar_8.getName();
				isSelectedAvatar(avatarButtons);
			}
		});
		
		
		
		passwordConfirm.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if (Arrays.equals(passwordConfirm.getPassword(), passwordInsert.getPassword())) {
					lblPasswordError.setVisible(false);
					btnRegistro.setEnabled(true);
					} else {
						lblPasswordError.setVisible(true);
						btnRegistro.setEnabled(false);
					}
				
			}
		});
		
		
		
		
		//RECOGER DATOS USUARIO  ////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				String nombreAlumno = textField_NombreAlumno.getText();
				String apellido1Alumno = textField_ApellidoAlumno1.getText();
				String apellido2Alumno = textField_ApellidoAlumno2.getText();
				int edadAlumno = Integer.valueOf(spinnerEdad.getValue().toString());
				String nombreUsuario = textField_NombreUsuario.getText();
				String nombreProgenitor = textField_NombreProgenitor.getText();
				String apellido1Progenitor = textField_ApellidoProgenitor1.getText();
				String apellido2Progenitor = textField_ApellidoProgenitor2.getText();
				String avatarName = avatar;
				String password = passwordConfirm.getPassword().toString();

				try {
					
					for (JButton button : avatarButtons) {
						if (button.getName().compareToIgnoreCase(avatar) == 0) {
							button.setEnabled(false);
						}
						if (avatar.compareToIgnoreCase("avatarInexistente") == 0){
							JOptionPane.showMessageDialog(registerFrame, "Has de escoger un avatar.",
									"Warning", JOptionPane.INFORMATION_MESSAGE);
							
							throw new NullAvatarException("Ha de escoger un avatar");
						}
					}
					
					
					conexion.crearUsuario(nombreUsuario, nombreAlumno , apellido1Alumno, apellido2Alumno, edadAlumno, avatarName, nombreProgenitor, apellido1Progenitor, apellido2Progenitor, password);
					JFrame frame = new JFrame();
					JOptionPane.showMessageDialog(frame, "Usuario " + nombreUsuario + " creado con exito",
							"Greeting", JOptionPane.INFORMATION_MESSAGE);
					registerFrame.setVisible(false);
					

				}catch (SQLIntegrityConstraintViolationException e1) {
					JOptionPane.showMessageDialog(registerFrame, "El usuario " + nombreUsuario + " ya existe, pruebe con otro.",
							"Warning", JOptionPane.INFORMATION_MESSAGE);
					e1.printStackTrace();
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NullAvatarException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		

		
		

		


			
	}
	
	//MARKING SELECTED AVATAR////////////////////////////////////////////////////////////////////////////////////////////

	public static void isSelectedAvatar(ArrayList<JButton> avatarButtons) {
		for (JButton avatar : avatarButtons) {
			if (avatar.isFocusOwner()) {
				avatar.setBorder(new LineBorder(Color.PINK, 10, false));
				
			} else {
				avatar.setBorder(new LineBorder(Color.BLACK, 2, false));
			}
		}
	}
}
