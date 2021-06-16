package proyectoAppInfantil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Pista_tienes {

	private JFrame framePistaTienes;
	Icon[] listaPistas;

	// added to use from main window
	public JFrame getPista_tienes() {
		return framePistaTienes;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pista_tienes window = new Pista_tienes();
					window.framePistaTienes.setVisible(true);
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
		Icon unoIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_uno.png"));
		Icon dosIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_dos.png"));
		Icon tresIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_tres.png"));
		Icon cuatroIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_cuatro.png"));
		Icon cincoIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_cinco.png"));
		Icon seisIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_seis.png"));
		Icon sieteIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_siete.png"));
		Icon ochoIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_ocho.png"));
		Icon nueveIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_nueve.png"));
		Icon diezIcon = new ImageIcon(Pista_tienes.class.getResource("/images/pistas/dedos_diez.png"));

		listaPistas = new Icon[] { unoIcon, dosIcon, tresIcon, cuatroIcon, cincoIcon, seisIcon, sieteIcon, ochoIcon,
				nueveIcon, diezIcon };

		int numeroPista = Integer.valueOf(NumbersWindow.getSumaActual());
		Icon iconPista = listaPistas[numeroPista - 1];

		framePistaTienes = new JFrame();
		framePistaTienes.getContentPane().setBackground(new Color(153, 204, 153));
		framePistaTienes.getContentPane().setVisible(true);
		framePistaTienes.setAlwaysOnTop(true);
		framePistaTienes.setBounds(570, 500, 470, 413);
		framePistaTienes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		framePistaTienes.getContentPane().setLayout(null);

		JLabel lblPista = new JLabel("");
		lblPista.setBounds(150, 6, 299, 341);
		lblPista.setBorder(null);
		lblPista.setIcon(iconPista);
		framePistaTienes.getContentPane().add(lblPista);

		JLabel lblTienes = new JLabel("TIENES");
		lblTienes.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTienes.setBounds(48, 71, 90, 44);
		framePistaTienes.getContentPane().add(lblTienes);

		JLabel lblNumero = new JLabel(String.valueOf(numeroPista));
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNumero.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
		lblNumero.setBounds(27, 185, 129, 120);
		framePistaTienes.getContentPane().add(lblNumero);

	}
}
