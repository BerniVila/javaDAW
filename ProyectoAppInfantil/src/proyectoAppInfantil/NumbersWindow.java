package proyectoAppInfantil;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class NumbersWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumbersWindow window = new NumbersWindow();
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
	public NumbersWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 255));
		frame.setBounds(100, 100, 1920, 1080);
		//ImageIcon fondoIcon = new ImageIcon(NumbersWindow.class.getResource("/images/numbers/one.gif"));
		//Image fondo = fondoIcon.getImage();
		//Image img = Toolkit.getDefaultToolkit().getImage("/images/backgrounds/claseFondoBig.jpg");
		//frame.setIconImage(img);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(153, 153, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setAutoscrolls(true);
		btnNewButton.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/one.gif")));
		btnNewButton.setBounds(147, 157, 135, 267);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(153, 153, 255));
		btnNewButton_1.setAutoscrolls(true);
		btnNewButton_1.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/two.gif")));
		btnNewButton_1.setBounds(352, 29, 135, 267);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(153, 153, 255));
		btnNewButton_2.setAutoscrolls(true);
		btnNewButton_2.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/three.gif")));
		btnNewButton_2.setBounds(386, 266, 177, 267);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(new Color(153, 153, 255));
		btnNewButton_3.setAutoscrolls(true);
		btnNewButton_3.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/four.gif")));
		btnNewButton_3.setBounds(707, 18, 224, 267);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(153, 153, 255));
		btnNewButton_4.setAutoscrolls(true);
		btnNewButton_4.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/five.gif")));
		btnNewButton_4.setBounds(1073, 29, 222, 309);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(new Color(153, 153, 255));
		btnNewButton_5.setAutoscrolls(true);
		btnNewButton_5.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/six.gif")));
		btnNewButton_5.setBounds(76, 640, 230, 267);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(new Color(153, 153, 255));
		btnNewButton_6.setAutoscrolls(true);
		btnNewButton_6.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/seven.gif")));
		btnNewButton_6.setBounds(449, 617, 217, 267);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setContentAreaFilled(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setBorder(null);
		btnNewButton_7.setBackground(new Color(153, 153, 255));
		btnNewButton_7.setAutoscrolls(true);
		btnNewButton_7.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/eight.gif")));
		btnNewButton_7.setBounds(696, 315, 135, 267);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setContentAreaFilled(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.setBorder(null);
		btnNewButton_8.setBackground(new Color(153, 153, 255));
		btnNewButton_8.setAutoscrolls(true);
		btnNewButton_8.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/nine.gif")));
		btnNewButton_8.setBounds(783, 661, 230, 289);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setContentAreaFilled(false);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBackground(new Color(153, 153, 255));
		btnNewButton_9.setAutoscrolls(true);
		btnNewButton_9.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/zeroSmall.gif")));
		btnNewButton_9.setBounds(1417, 412, 207, 309);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setContentAreaFilled(false);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.setBorder(null);
		btnNewButton_10.setBackground(new Color(153, 153, 255));
		btnNewButton_10.setAutoscrolls(true);
		btnNewButton_10.setIcon(new ImageIcon(NumbersWindow.class.getResource("/images/numbers/one.gif")));
		btnNewButton_10.setBounds(1265, 454, 135, 267);
		frame.getContentPane().add(btnNewButton_10);
	}
	
	
	
	public class JPanelBackground extends JPanel {
		 
		// Atributo que guardara la imagen de Background que le pasemos.
		private Image background;
	 
		// Metodo que es llamado automaticamente por la maquina virtual Java cada vez que repinta
		public void paintComponent(Graphics g) {
	 
			/* Obtenemos el tamaño del panel para hacer que se ajuste a este
			cada vez que redimensionemos la ventana y se lo pasamos al drawImage */
			int width = this.getSize().width;
			int height = this.getSize().height;
	 
			// Mandamos que pinte la imagen en el panel
			if (this.background != null) {
				g.drawImage(this.background, 0, 0, width, height, null);
			}
	 
			super.paintComponent(g);
		}
	 
		// Metodo donde le pasaremos la dirección de la imagen a cargar.
		public void setBackground(String imagePath) {
			
			// Construimos la imagen y se la asignamos al atributo background.
			this.setOpaque(false);
			this.background = new ImageIcon(imagePath).getImage();
			repaint();
		}
	 
	}

}
