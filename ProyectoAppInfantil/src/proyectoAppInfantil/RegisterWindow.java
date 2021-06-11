package proyectoAppInfantil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.InputMethodListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.InputMethodEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class RegisterWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordInsert;
	private JPasswordField passwordConfirm;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textNickName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterWindow window = new RegisterWindow();
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
	public RegisterWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombreProgenitor = new JLabel("Nombre Progenitor");
		lblNombreProgenitor.setBounds(44, 58, 126, 16);
		frame.getContentPane().add(lblNombreProgenitor);
		
		textField_4 = new JTextField();
		textField_4.setBounds(44, 86, 189, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(44, 163, 189, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(259, 163, 188, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce Password");
		lblNewLabel_1.setBounds(44, 376, 145, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordInsert = new JPasswordField();
		passwordInsert.setBounds(44, 407, 189, 26);
		frame.getContentPane().add(passwordInsert);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setOpaque(true);
		btnNewButton.setBounds(310, 482, 117, 71);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar Password");
		lblNewLabel_2.setBounds(44, 454, 135, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordConfirm = new JPasswordField();
		passwordConfirm.setBounds(44, 482, 189, 26);
		frame.getContentPane().add(passwordConfirm);
		
		
		//AVATAR BUTTONS ///////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 102));
		panel.setBounds(473, 0, 327, 578);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnAvatar_1 = new JButton("");
		btnAvatar_1.setSize(new Dimension(100, 100));
		btnAvatar_1.setPreferredSize(new Dimension(100, 100));
		btnAvatar_1.setLocation(new Point(0, 2));
		btnAvatar_1.setSelected(true);
		btnAvatar_1.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_1.setIconTextGap(0);
		btnAvatar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_1.setOpaque(true);
		btnAvatar_1.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-alpaca.gif")));
		btnAvatar_1.setBounds(36, 65, 100, 100);
		panel.add(btnAvatar_1);
		
		JButton btnAvatar_2 = new JButton("");
		btnAvatar_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_2.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-avocado.gif")));
		btnAvatar_2.setSize(new Dimension(100, 100));
		btnAvatar_2.setSelected(true);
		btnAvatar_2.setPreferredSize(new Dimension(100, 100));
		btnAvatar_2.setOpaque(true);
		btnAvatar_2.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_2.setLocation(new Point(0, 2));
		btnAvatar_2.setIconTextGap(0);
		btnAvatar_2.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_2.setBounds(185, 65, 100, 100);
		panel.add(btnAvatar_2);
		
		JButton btnAvatar_3 = new JButton("");
		btnAvatar_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_3.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-squidGuitar.gif")));
		btnAvatar_3.setSize(new Dimension(100, 100));
		btnAvatar_3.setSelected(true);
		btnAvatar_3.setPreferredSize(new Dimension(100, 100));
		btnAvatar_3.setOpaque(true);
		btnAvatar_3.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_3.setLocation(new Point(0, 2));
		btnAvatar_3.setIconTextGap(0);
		btnAvatar_3.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_3.setBounds(36, 189, 100, 100);
		panel.add(btnAvatar_3);
		
		JButton btnAvatar_4 = new JButton("");
		btnAvatar_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_4.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-lion.gif")));
		btnAvatar_4.setSize(new Dimension(100, 100));
		btnAvatar_4.setSelected(true);
		btnAvatar_4.setPreferredSize(new Dimension(100, 100));
		btnAvatar_4.setOpaque(true);
		btnAvatar_4.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_4.setLocation(new Point(0, 2));
		btnAvatar_4.setIconTextGap(0);
		btnAvatar_4.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_4.setBounds(185, 189, 100, 100);
		panel.add(btnAvatar_4);
		
		JButton btnAvatar_7 = new JButton("");
		btnAvatar_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_7.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-unicorn.gif")));
		btnAvatar_7.setSize(new Dimension(100, 100));
		btnAvatar_7.setSelected(true);
		btnAvatar_7.setPreferredSize(new Dimension(100, 100));
		btnAvatar_7.setOpaque(true);
		btnAvatar_7.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_7.setLocation(new Point(0, 2));
		btnAvatar_7.setIconTextGap(0);
		btnAvatar_7.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_7.setBounds(36, 452, 100, 100);
		panel.add(btnAvatar_7);
		
		JButton btnAvatar_8 = new JButton("");
		btnAvatar_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_8.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-cat.gif")));
		btnAvatar_8.setSize(new Dimension(100, 100));
		btnAvatar_8.setSelected(true);
		btnAvatar_8.setPreferredSize(new Dimension(100, 100));
		btnAvatar_8.setOpaque(true);
		btnAvatar_8.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_8.setLocation(new Point(0, 2));
		btnAvatar_8.setIconTextGap(0);
		btnAvatar_8.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_8.setBounds(185, 452, 100, 100);
		panel.add(btnAvatar_8);
		
		JButton btnAvatar_5 = new JButton("");
		btnAvatar_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_5.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-monkey.gif")));
		btnAvatar_5.setSize(new Dimension(100, 100));
		btnAvatar_5.setSelected(true);
		btnAvatar_5.setPreferredSize(new Dimension(100, 100));
		btnAvatar_5.setOpaque(true);
		btnAvatar_5.setMargin(new Insets(0, 0, 0, 0));
		btnAvatar_5.setLocation(new Point(0, 2));
		btnAvatar_5.setIconTextGap(0);
		btnAvatar_5.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnAvatar_5.setBounds(36, 323, 100, 100);
		panel.add(btnAvatar_5);
		
		JButton btnAvatar_6 = new JButton("");
		btnAvatar_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_6.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-dog.gif")));
		btnAvatar_6.setSize(new Dimension(100, 100));
		btnAvatar_6.setSelected(true);
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
		frame.getContentPane().add(lblApellidoProgenitor1);
		
		JLabel lblNombreAlumno = new JLabel("Nombre Alumno");
		lblNombreAlumno.setBounds(44, 225, 126, 16);
		frame.getContentPane().add(lblNombreAlumno);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(44, 253, 189, 26);
		frame.getContentPane().add(textField_9);
		
		JLabel lblApellidoAlumno1 = new JLabel("1er Apellido Alumno");
		lblApellidoAlumno1.setBounds(44, 294, 145, 16);
		frame.getContentPane().add(lblApellidoAlumno1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(44, 330, 189, 26);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(259, 330, 188, 26);
		frame.getContentPane().add(textField_11);
		
		JLabel lblEdadAlumno = new JLabel("Edad Alumno");
		lblEdadAlumno.setBounds(258, 225, 126, 16);
		frame.getContentPane().add(lblEdadAlumno);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(259, 254, 188, 27);
		frame.getContentPane().add(comboBox);
		
		JLabel lbloApellidoProgenitor2 = new JLabel("2o Apellido Progenitor");
		lbloApellidoProgenitor2.setBounds(259, 127, 145, 16);
		frame.getContentPane().add(lbloApellidoProgenitor2);
		
		JLabel lblApellidoAlumno2 = new JLabel("2o Apellido Alumno");
		lblApellidoAlumno2.setBounds(259, 294, 126, 16);
		frame.getContentPane().add(lblApellidoAlumno2);
		
		JLabel lblTitle = new JLabel("FORMULARIO DE REGISTRO");
		lblTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblTitle.setBounds(137, 6, 223, 28);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblPasswordError = new JLabel("Debes escribir el mismo password");
		lblPasswordError.setVisible(false);
		lblPasswordError.setForeground(new Color(204, 51, 51));
		lblPasswordError.setBounds(44, 520, 223, 16);
		frame.getContentPane().add(lblPasswordError);
		
		textNickName = new JTextField();
		textNickName.setColumns(10);
		textNickName.setBounds(258, 404, 189, 26);
		frame.getContentPane().add(textNickName);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario");
		lblNombreDeUsuario.setBounds(258, 376, 126, 16);
		frame.getContentPane().add(lblNombreDeUsuario);
		
		JLabel lblNombreUsuarioNoDisponible = new JLabel("Nombre de Usuario NO disponible");
		lblNombreUsuarioNoDisponible.setVisible(false);
		lblNombreUsuarioNoDisponible.setForeground(new Color(255, 51, 51));
		lblNombreUsuarioNoDisponible.setBounds(246, 442, 215, 16);
		frame.getContentPane().add(lblNombreUsuarioNoDisponible);
		
		
		
		
		
		passwordConfirm.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if (Arrays.equals(passwordConfirm.getPassword(), passwordInsert.getPassword())) {
					lblPasswordError.setVisible(false);
					} else {
						lblPasswordError.setVisible(true);
					}
				
			}
		});
		
		
		textNickName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				
			}
		});
		
		
		//RECOGER DATOS USUARIO  ////////////////////////////////////////////////////////////////////////////////////////////
		
		String nombreUsuario;
		String apellido1Usuario;
		String apellido2Usuario;
		String nickNameUsuario;
		String nombreProgenitor;
		String apellido1Progenitor;
		String apellido2Progenitor;
		
		
		
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
		
		
		//PRUEBAS AUDIO  ////////////////////////////////////////////////////////////////////////////////////////////////////
        //mirar si puedo enganchar a socket buscando socket y audioimputstream
		File bso = new File("C:\\Users\\bernivila\\git\\DAWProject\\ProyectoAppInfantil\\src\\audioFiles\\bso\\bensound-buddy.wav");
		
		File bsoMAC = new File("/Users/berni/git/JavaProjects/ProyectoAppInfantil/src/audioFiles/bso/bensound-buddy.wav");
		
			try {
		
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bso);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-20.0f); // Reduce volume by 10 decibels.
			} catch(Exception ex) {
			System.out.println("Error playing sound.");
			ex.printStackTrace();
			}
			
	}
}
