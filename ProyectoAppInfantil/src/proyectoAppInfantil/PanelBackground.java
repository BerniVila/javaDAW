package proyectoAppInfantil;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class PanelBackground extends javax.swing.JPanel{

	public PanelBackground() {
		this.setSize(1600, 900);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Dimension screenSize = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/images/backgrounds/chalk3.jpg"));
		g.drawImage(imagenFondo.getImage(), 0, 0, 1600, 900, null);
		
		setOpaque(false);
		super.paintComponent(g);
	}
	
}
