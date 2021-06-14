package proyectoAppInfantil;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class LoginWindow {


	private JFrame frame;
	private JTextField textNickname;
	
	
	
	// added to use from main window
	public JFrame getLoginWindow() {
		return frame;
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
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
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(480, 100, 640, 529);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 153, 102));
		panel.setBounds(0, 195, 640, 311);
		frame.getContentPane().add(panel);
		
		JButton btnAvatar_1 = new JButton("");
		btnAvatar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_1.setIcon(new ImageIcon(IDWindow.class.getResource("/images/avatars/avatar-alpaca.gif")));
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
		btnAvatar_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_2.setIcon(new ImageIcon(IDWindow.class.getResource("/images/avatars/avatar-avocado.gif")));
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
		btnAvatar_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_3.setIcon(new ImageIcon(IDWindow.class.getResource("/images/avatars/avatar-squidGuitar.gif")));
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
		btnAvatar_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_4.setIcon(new ImageIcon(IDWindow.class.getResource("/images/avatars/avatar-lion.gif")));
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
		btnAvatar_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_7.setIcon(new ImageIcon(IDWindow.class.getResource("/images/avatars/avatar-unicorn.gif")));
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
		btnAvatar_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_8.setIcon(new ImageIcon(IDWindow.class.getResource("/images/avatars/avatar-cat.gif")));
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
		btnAvatar_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_5.setIcon(new ImageIcon(IDWindow.class.getResource("/images/avatars/avatar-monkey.gif")));
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
		btnAvatar_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAvatar_6.setIcon(new ImageIcon(IDWindow.class.getResource("/images/avatars/avatar-dog.gif")));
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
		
		textNickname = new JTextField();
		textNickname.setBounds(192, 82, 226, 43);
		frame.getContentPane().add(textNickname);
		textNickname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Escribe tu nombre de Usuario");
		lblNewLabel_1.setBounds(213, 21, 205, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblEligeTuAvatar = new JLabel("Elige tu Avatar");
		lblEligeTuAvatar.setBounds(243, 153, 128, 32);
		frame.getContentPane().add(lblEligeTuAvatar);
		lblEligeTuAvatar.setForeground(new Color(0, 51, 51));
		lblEligeTuAvatar.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
	}
}
