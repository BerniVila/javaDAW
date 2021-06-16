package proyectoAppInfantil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Pista_tienes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pista_tienes window = new Pista_tienes();
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
	public Pista_tienes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 455, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPista_1 = new JLabel("");
		lblPista_1.setBounds(238, 6, 161, 341);
		lblPista_1.setBorder(null);
		lblPista_1.setIcon(new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_uno.png")));
		frame.getContentPane().add(lblPista_1);
		
		JLabel lblNewLabel = new JLabel("TIENES");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(48, 71, 90, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
		lblNewLabel_1.setBounds(27, 185, 129, 120);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
