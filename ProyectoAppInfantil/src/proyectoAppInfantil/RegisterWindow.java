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
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(4, 94, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(69, 89, 189, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(69, 141, 189, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(262, 141, 188, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(69, 214, 189, 26);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(19, 284, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(92, 279, 189, 26);
		frame.getContentPane().add(passwordField_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(164, 465, 117, 35);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(19, 335, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(92, 330, 189, 26);
		frame.getContentPane().add(passwordField_3);
		
		
	}

}
