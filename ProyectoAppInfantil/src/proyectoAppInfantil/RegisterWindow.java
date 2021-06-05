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
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.JComboBox;
import java.awt.Font;

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
	private JPasswordField passwordField_2;
	private JPasswordField passwordField_3;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

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
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(44, 407, 189, 26);
		frame.getContentPane().add(passwordField_2);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(102, 153, 255));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setOpaque(true);
		btnNewButton.setBounds(295, 437, 117, 71);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar Password");
		lblNewLabel_2.setBounds(44, 445, 135, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(44, 482, 189, 26);
		frame.getContentPane().add(passwordField_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 102));
		panel.setBounds(473, 0, 327, 578);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setSize(new Dimension(100, 100));
		btnNewButton_1.setPreferredSize(new Dimension(100, 100));
		btnNewButton_1.setLocation(new Point(0, 2));
		btnNewButton_1.setSelected(true);
		btnNewButton_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1.setIconTextGap(0);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-alpaca.gif")));
		btnNewButton_1.setBounds(36, 65, 100, 100);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-avocado.gif")));
		btnNewButton_1_1.setSize(new Dimension(100, 100));
		btnNewButton_1_1.setSelected(true);
		btnNewButton_1_1.setPreferredSize(new Dimension(100, 100));
		btnNewButton_1_1.setOpaque(true);
		btnNewButton_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1.setLocation(new Point(0, 2));
		btnNewButton_1_1.setIconTextGap(0);
		btnNewButton_1_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnNewButton_1_1.setBounds(185, 65, 100, 100);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-squidGuitar.gif")));
		btnNewButton_1_2.setSize(new Dimension(100, 100));
		btnNewButton_1_2.setSelected(true);
		btnNewButton_1_2.setPreferredSize(new Dimension(100, 100));
		btnNewButton_1_2.setOpaque(true);
		btnNewButton_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_2.setLocation(new Point(0, 2));
		btnNewButton_1_2.setIconTextGap(0);
		btnNewButton_1_2.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnNewButton_1_2.setBounds(36, 189, 100, 100);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-lion.gif")));
		btnNewButton_1_1_1.setSize(new Dimension(100, 100));
		btnNewButton_1_1_1.setSelected(true);
		btnNewButton_1_1_1.setPreferredSize(new Dimension(100, 100));
		btnNewButton_1_1_1.setOpaque(true);
		btnNewButton_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1.setLocation(new Point(0, 2));
		btnNewButton_1_1_1.setIconTextGap(0);
		btnNewButton_1_1_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnNewButton_1_1_1.setBounds(185, 189, 100, 100);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("");
		btnNewButton_1_2_1.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-alpaca.gif")));
		btnNewButton_1_2_1.setSize(new Dimension(100, 100));
		btnNewButton_1_2_1.setSelected(true);
		btnNewButton_1_2_1.setPreferredSize(new Dimension(100, 100));
		btnNewButton_1_2_1.setOpaque(true);
		btnNewButton_1_2_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_2_1.setLocation(new Point(0, 2));
		btnNewButton_1_2_1.setIconTextGap(0);
		btnNewButton_1_2_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnNewButton_1_2_1.setBounds(36, 452, 100, 100);
		panel.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-alpaca.gif")));
		btnNewButton_1_1_1_1.setSize(new Dimension(100, 100));
		btnNewButton_1_1_1_1.setSelected(true);
		btnNewButton_1_1_1_1.setPreferredSize(new Dimension(100, 100));
		btnNewButton_1_1_1_1.setOpaque(true);
		btnNewButton_1_1_1_1.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_1_1.setLocation(new Point(0, 2));
		btnNewButton_1_1_1_1.setIconTextGap(0);
		btnNewButton_1_1_1_1.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnNewButton_1_1_1_1.setBounds(185, 452, 100, 100);
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-monkey.gif")));
		btnNewButton_1_3.setSize(new Dimension(100, 100));
		btnNewButton_1_3.setSelected(true);
		btnNewButton_1_3.setPreferredSize(new Dimension(100, 100));
		btnNewButton_1_3.setOpaque(true);
		btnNewButton_1_3.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_3.setLocation(new Point(0, 2));
		btnNewButton_1_3.setIconTextGap(0);
		btnNewButton_1_3.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnNewButton_1_3.setBounds(36, 323, 100, 100);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_2 = new JButton("");
		btnNewButton_1_1_2.setIcon(new ImageIcon(RegisterWindow.class.getResource("/images/avatars/avatar-alpaca.gif")));
		btnNewButton_1_1_2.setSize(new Dimension(100, 100));
		btnNewButton_1_1_2.setSelected(true);
		btnNewButton_1_1_2.setPreferredSize(new Dimension(100, 100));
		btnNewButton_1_1_2.setOpaque(true);
		btnNewButton_1_1_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_1_1_2.setLocation(new Point(0, 2));
		btnNewButton_1_1_2.setIconTextGap(0);
		btnNewButton_1_1_2.setBorder(new LineBorder(Color.BLACK, 2, true));
		btnNewButton_1_1_2.setBounds(185, 323, 100, 100);
		panel.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Elige un avatar para tu hijo/a");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(36, 24, 249, 16);
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
		
		
	}
}
