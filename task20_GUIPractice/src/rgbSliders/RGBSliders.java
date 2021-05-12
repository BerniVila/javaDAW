package rgbSliders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
//import java.awt.event.InputMethodListener;
//import java.awt.event.InputMethodEvent;
import javax.swing.JTextField;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class RGBSliders {

	private JFrame frmRgbColorChooser;
	private JTextField textRedValue;
	private JTextField textGreenValue;
	private JTextField textBlueValue;
	
	//added to use from main window
		public JFrame getFrmRgbColorChooser() {
			return frmRgbColorChooser;
		}

		public void setFrmRgbColorChooser(JFrame frmRgbColorChooser) {
			this.frmRgbColorChooser = frmRgbColorChooser;
		}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RGBSliders window = new RGBSliders();
					window.getFrmRgbColorChooser().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RGBSliders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmRgbColorChooser(new JFrame());
		getFrmRgbColorChooser().setTitle("RGB Color Chooser");
		getFrmRgbColorChooser().getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		getFrmRgbColorChooser().getContentPane().setBackground(Color.DARK_GRAY);
		getFrmRgbColorChooser().setBounds(100, 100, 408, 473);
		getFrmRgbColorChooser().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getFrmRgbColorChooser().getContentPane().setLayout(null);

		JSlider redSlider = new JSlider();

		redSlider.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Red",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		redSlider.setName("Red");
		redSlider.setFont(new Font("Tahoma", Font.PLAIN, 13));
		redSlider.setForeground(new Color(255, 0, 0));
		redSlider.setToolTipText("Red Slider");
		redSlider.setMajorTickSpacing(25);
		redSlider.setMinorTickSpacing(5);
		redSlider.setPaintLabels(true);
		redSlider.setPaintTicks(true);
		redSlider.setMaximum(255);
		redSlider.setBackground(Color.GRAY);
		redSlider.setBounds(10, 33, 364, 67);
		getFrmRgbColorChooser().getContentPane().add(redSlider);

		JSlider greenSlider = new JSlider();

		greenSlider.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Green",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.GREEN));
		greenSlider.setToolTipText("Red Slider");
		greenSlider.setPaintTicks(true);
		greenSlider.setPaintLabels(true);
		greenSlider.setName("Red");
		greenSlider.setMinorTickSpacing(5);
		greenSlider.setMaximum(255);
		greenSlider.setMajorTickSpacing(25);
		greenSlider.setForeground(Color.GREEN);
		greenSlider.setFont(new Font("Tahoma", Font.PLAIN, 13));
		greenSlider.setBackground(Color.GRAY);
		greenSlider.setBounds(10, 111, 364, 67);
		getFrmRgbColorChooser().getContentPane().add(greenSlider);

		JSlider blueSlider = new JSlider();
		blueSlider.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Blue",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		blueSlider.setToolTipText("Red Slider");
		blueSlider.setPaintTicks(true);
		blueSlider.setPaintLabels(true);
		blueSlider.setName("Red");
		blueSlider.setMinorTickSpacing(5);
		blueSlider.setMaximum(255);
		blueSlider.setMajorTickSpacing(25);
		blueSlider.setForeground(Color.BLUE);
		blueSlider.setFont(new Font("Tahoma", Font.PLAIN, 13));
		blueSlider.setBackground(Color.GRAY);
		blueSlider.setBounds(10, 189, 364, 67);
		getFrmRgbColorChooser().getContentPane().add(blueSlider);

		JLabel lblHeader = new JLabel("CHOOSE A COLOUR");
		lblHeader.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHeader.setForeground(Color.WHITE);
		lblHeader.setBounds(107, 0, 180, 30);
		getFrmRgbColorChooser().getContentPane().add(lblHeader);

		JPanel jPanelColor = new JPanel();
		jPanelColor.setBounds(107, 268, 267, 141);
		getFrmRgbColorChooser().getContentPane().add(jPanelColor);
		
		JLabel lblRedValueLabel = new JLabel("RED");
		lblRedValueLabel.setForeground(Color.WHITE);
		
		lblRedValueLabel.setBounds(10, 279, 41, 27);
		getFrmRgbColorChooser().getContentPane().add(lblRedValueLabel);
		
		textRedValue = new JTextField();
				
		
		textRedValue.setBounds(64, 283, 33, 20);
		getFrmRgbColorChooser().getContentPane().add(textRedValue);
		textRedValue.setColumns(10);
		
		JLabel lblGreenValueLabel = new JLabel("GREEN");
		lblGreenValueLabel.setForeground(Color.WHITE);
		lblGreenValueLabel.setBounds(10, 318, 51, 27);
		getFrmRgbColorChooser().getContentPane().add(lblGreenValueLabel);
		
		textGreenValue = new JTextField();
		textGreenValue.setColumns(10);
		textGreenValue.setBounds(64, 322, 31, 20);
		getFrmRgbColorChooser().getContentPane().add(textGreenValue);

		JLabel lblBlueValueLabel = new JLabel("BLUE");
		lblBlueValueLabel.setForeground(Color.WHITE);
		lblBlueValueLabel.setBounds(10, 362, 41, 27);
		getFrmRgbColorChooser().getContentPane().add(lblBlueValueLabel);
		
		
		textBlueValue = new JTextField();
		textBlueValue.setColumns(10);
		textBlueValue.setBounds(64, 366, 33, 20);
		getFrmRgbColorChooser().getContentPane().add(textBlueValue);

		redSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				jPanelColor
						.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
				
				textRedValue.setText(String.valueOf(redSlider.getValue()));
			}
		});

		greenSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				jPanelColor
						.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
				
				textGreenValue.setText(String.valueOf(greenSlider.getValue()));
			}
		});

		blueSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				jPanelColor
						.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
				
				textBlueValue.setText(String.valueOf(blueSlider.getValue()));
			}
		});
		
		//redSlider.setValue(Integer.valueOf(textRedValue.getText()));
		/*
		 * textRedValue.addInputMethodListener(new InputMethodListener() { public void
		 * caretPositionChanged(InputMethodEvent event) {
		 * System.out.println("ha entrado"); } public void
		 * inputMethodTextChanged(InputMethodEvent event) {
		 * System.out.println("ha entrado");
		 * redSlider.setValue(Integer.valueOf(textRedValue.getText())); } });
		 */
		
		textRedValue.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				redSlider.setValue(Integer.valueOf(textRedValue.getText()));
			}
		});
		
		textGreenValue.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				greenSlider.setValue(Integer.valueOf(textGreenValue.getText()));
			}
		});
		
		textBlueValue.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				blueSlider.setValue(Integer.valueOf(textBlueValue.getText()));
			}
		});

	}
 
}


