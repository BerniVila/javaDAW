package proyectoAppInfantil;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Pista_llegar_a {


	private JFrame framePista_llegar_a;
	Icon[] listaPistas;

	// added to use from main window
	public JFrame getPista_llegar_a() {
		return framePista_llegar_a;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pista_llegar_a window = new Pista_llegar_a();
					window.framePista_llegar_a.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pista_llegar_a() {
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

		int numeroPista = Integer.valueOf(NumbersWindow.getObjetivoActual());
		Icon iconPista = listaPistas[numeroPista - 1];

		framePista_llegar_a = new JFrame();
		framePista_llegar_a.getContentPane().setBackground(new Color(153, 204, 153));
		framePista_llegar_a.getContentPane().setVisible(true);
		framePista_llegar_a.setAlwaysOnTop(true);
		framePista_llegar_a.setBounds(1050, 500, 546, 413);
		framePista_llegar_a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		framePista_llegar_a.getContentPane().setLayout(null);

		JLabel lblPista = new JLabel("");
		lblPista.setBounds(150, 75, 390, 310);
		lblPista.setBorder(null);
		lblPista.setIcon(iconPista);
		framePista_llegar_a.getContentPane().add(lblPista);

		JLabel lblTienes = new JLabel("NECESITAS LLEGAR A");
		lblTienes.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblTienes.setBounds(41, 6, 238, 44);
		framePista_llegar_a.getContentPane().add(lblTienes);

		JLabel lblNumero = new JLabel(String.valueOf(numeroPista));
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNumero.setFont(new Font("Comic Sans MS", Font.PLAIN, 99));
		lblNumero.setBounds(27, 185, 129, 120);
		framePista_llegar_a.getContentPane().add(lblNumero);

	}
}
