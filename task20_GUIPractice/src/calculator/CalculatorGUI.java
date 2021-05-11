package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorGUI {

	private JFrame frmCalculatorGUI;
	
	//added to use from main window
	public JFrame getFrmCalculatorGUI() {
		return frmCalculatorGUI;
	}
	
	public void setFrmCalculatorGUI(JFrame frmCalculatorGUI) {
		this.frmCalculatorGUI = frmCalculatorGUI;
	}
	
	//Calculator calc = new Calculator();
	//ActionListener digitL = new DigitListener(calc,textField);
	//ActionListener opL = new OperatorListener(calc, textField);


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI window = new CalculatorGUI();
					window.frmCalculatorGUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculatorGUI = new JFrame();
		
		frmCalculatorGUI.getContentPane().setBackground(new Color(204, 204, 255));
		frmCalculatorGUI.setBackground(new Color(204, 204, 255));
		frmCalculatorGUI.setBounds(100, 100, 489, 619);
		frmCalculatorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {112, 112, 112, 112};
		gridBagLayout.rowHeights = new int[] {110, 50, 80, 80, 80, 80, 80, 10};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		frmCalculatorGUI.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblShowResult = new JLabel("RESULT");
		lblShowResult.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 50));
		lblShowResult.setBackground(new Color(0, 0, 204));
		GridBagConstraints gbc_lblShowResult = new GridBagConstraints();
		gbc_lblShowResult.gridwidth = 4;
		gbc_lblShowResult.insets = new Insets(0, 0, 5, 0);
		gbc_lblShowResult.gridx = 0;
		gbc_lblShowResult.gridy = 0;
		frmCalculatorGUI.getContentPane().add(lblShowResult, gbc_lblShowResult);
		
		JLabel lblShowOperation = new JLabel("Operation");
		lblShowOperation.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		lblShowOperation.setBackground(new Color(153, 102, 204));
		GridBagConstraints gbc_lblShowOperation = new GridBagConstraints();
		gbc_lblShowOperation.gridwidth = 4;
		gbc_lblShowOperation.insets = new Insets(0, 0, 5, 0);
		gbc_lblShowOperation.gridx = 0;
		gbc_lblShowOperation.gridy = 1;
		frmCalculatorGUI.getContentPane().add(lblShowOperation, gbc_lblShowOperation);
		
		JButton btn_AC = new JButton("AC");
		btn_AC.setBackground(new Color(204, 204, 255));
		btn_AC.setBorderPainted(false);
		btn_AC.setFont(new Font("Tahoma", Font.PLAIN, 50));
		GridBagConstraints gbc_btn_AC = new GridBagConstraints();
		gbc_btn_AC.fill = GridBagConstraints.BOTH;
		gbc_btn_AC.insets = new Insets(0, 0, 5, 5);
		gbc_btn_AC.gridx = 0;
		gbc_btn_AC.gridy = 2;
		frmCalculatorGUI.getContentPane().add(btn_AC, gbc_btn_AC);
		
		JButton btn_negative = new JButton("+/-");
		btn_negative.setBackground(new Color(204, 204, 255));
		btn_negative.setBorderPainted(false);
		btn_negative.setFont(new Font("Tahoma", Font.PLAIN, 50));
		GridBagConstraints gbc_btn_negative = new GridBagConstraints();
		gbc_btn_negative.fill = GridBagConstraints.BOTH;
		gbc_btn_negative.insets = new Insets(0, 0, 5, 5);
		gbc_btn_negative.gridx = 1;
		gbc_btn_negative.gridy = 2;
		frmCalculatorGUI.getContentPane().add(btn_negative, gbc_btn_negative);
		
		JButton btn_perCent = new JButton("%");
		btn_perCent.setBackground(new Color(204, 204, 255));
		btn_perCent.setBorderPainted(false);
		btn_perCent.setFont(new Font("Tahoma", Font.PLAIN, 50));
		GridBagConstraints gbc_btn_perCent = new GridBagConstraints();
		gbc_btn_perCent.fill = GridBagConstraints.BOTH;
		gbc_btn_perCent.insets = new Insets(0, 0, 5, 5);
		gbc_btn_perCent.gridx = 2;
		gbc_btn_perCent.gridy = 2;
		frmCalculatorGUI.getContentPane().add(btn_perCent, gbc_btn_perCent);
		
		JButton btn_division = new JButton("\t\u00F7");
		btn_division.setFont(new Font("Tahoma", Font.PLAIN, 55));
		btn_division.setBackground(new Color(153, 102, 204));
		btn_division.setBorderPainted(false);
		GridBagConstraints gbc_btn_division = new GridBagConstraints();
		gbc_btn_division.fill = GridBagConstraints.BOTH;
		gbc_btn_division.insets = new Insets(0, 0, 5, 0);
		gbc_btn_division.gridx = 3;
		gbc_btn_division.gridy = 2;
		frmCalculatorGUI.getContentPane().add(btn_division, gbc_btn_division);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBackground(new Color(204, 204, 255));
		btn_7.setBorderPainted(false);
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_7 = new GridBagConstraints();
		gbc_btn_7.fill = GridBagConstraints.BOTH;
		gbc_btn_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn_7.gridx = 0;
		gbc_btn_7.gridy = 3;
		frmCalculatorGUI.getContentPane().add(btn_7, gbc_btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBackground(new Color(204, 204, 255));
		btn_8.setBorderPainted(false);
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_8 = new GridBagConstraints();
		gbc_btn_8.fill = GridBagConstraints.BOTH;
		gbc_btn_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn_8.gridx = 1;
		gbc_btn_8.gridy = 3;
		frmCalculatorGUI.getContentPane().add(btn_8, gbc_btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBackground(new Color(204, 204, 255));
		btn_9.setBorderPainted(false);
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_9 = new GridBagConstraints();
		gbc_btn_9.fill = GridBagConstraints.BOTH;
		gbc_btn_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn_9.gridx = 2;
		gbc_btn_9.gridy = 3;
		frmCalculatorGUI.getContentPane().add(btn_9, gbc_btn_9);
		
		JButton btn_multiplication = new JButton("x");
		btn_multiplication.setBackground(new Color(204, 204, 255));
		btn_multiplication.setBorderPainted(false);
		btn_multiplication.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_multiplication = new GridBagConstraints();
		gbc_btn_multiplication.fill = GridBagConstraints.BOTH;
		gbc_btn_multiplication.insets = new Insets(0, 0, 5, 0);
		gbc_btn_multiplication.gridx = 3;
		gbc_btn_multiplication.gridy = 3;
		frmCalculatorGUI.getContentPane().add(btn_multiplication, gbc_btn_multiplication);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBackground(new Color(204, 204, 255));
		btn_4.setBorderPainted(false);
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_4 = new GridBagConstraints();
		gbc_btn_4.fill = GridBagConstraints.BOTH;
		gbc_btn_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn_4.gridx = 0;
		gbc_btn_4.gridy = 4;
		frmCalculatorGUI.getContentPane().add(btn_4, gbc_btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBackground(new Color(204, 204, 255));
		btn_5.setBorderPainted(false);
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_5 = new GridBagConstraints();
		gbc_btn_5.fill = GridBagConstraints.BOTH;
		gbc_btn_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn_5.gridx = 1;
		gbc_btn_5.gridy = 4;
		frmCalculatorGUI.getContentPane().add(btn_5, gbc_btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBackground(new Color(204, 204, 255));
		btn_6.setBorderPainted(false);
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_6 = new GridBagConstraints();
		gbc_btn_6.fill = GridBagConstraints.BOTH;
		gbc_btn_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn_6.gridx = 2;
		gbc_btn_6.gridy = 4;
		frmCalculatorGUI.getContentPane().add(btn_6, gbc_btn_6);
		
		JButton btn_substraction = new JButton("-");
		btn_substraction.setBackground(new Color(204, 204, 255));
		btn_substraction.setBorderPainted(false);
		btn_substraction.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_substraction = new GridBagConstraints();
		gbc_btn_substraction.fill = GridBagConstraints.BOTH;
		gbc_btn_substraction.insets = new Insets(0, 0, 5, 0);
		gbc_btn_substraction.gridx = 3;
		gbc_btn_substraction.gridy = 4;
		frmCalculatorGUI.getContentPane().add(btn_substraction, gbc_btn_substraction);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBackground(new Color(204, 204, 255));
		btn_1.setBorderPainted(false);
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_1 = new GridBagConstraints();
		gbc_btn_1.fill = GridBagConstraints.BOTH;
		gbc_btn_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn_1.gridx = 0;
		gbc_btn_1.gridy = 5;
		frmCalculatorGUI.getContentPane().add(btn_1, gbc_btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBackground(new Color(204, 204, 255));
		btn_2.setBorderPainted(false);
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_2 = new GridBagConstraints();
		gbc_btn_2.fill = GridBagConstraints.BOTH;
		gbc_btn_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn_2.gridx = 1;
		gbc_btn_2.gridy = 5;
		frmCalculatorGUI.getContentPane().add(btn_2, gbc_btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBackground(new Color(204, 204, 255));
		btn_3.setBorderPainted(false);
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_3 = new GridBagConstraints();
		gbc_btn_3.fill = GridBagConstraints.BOTH;
		gbc_btn_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn_3.gridx = 2;
		gbc_btn_3.gridy = 5;
		frmCalculatorGUI.getContentPane().add(btn_3, gbc_btn_3);
		
		JButton btn_addition = new JButton("+");
		btn_addition.setBackground(new Color(204, 204, 255));
		btn_addition.setBorderPainted(false);
		btn_addition.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_addition = new GridBagConstraints();
		gbc_btn_addition.fill = GridBagConstraints.BOTH;
		gbc_btn_addition.insets = new Insets(0, 0, 5, 0);
		gbc_btn_addition.gridx = 3;
		gbc_btn_addition.gridy = 5;
		frmCalculatorGUI.getContentPane().add(btn_addition, gbc_btn_addition);
		
		JButton btn_0 = new JButton("0");
		btn_0.setBorderPainted(false);
		btn_0.setBackground(new Color(204, 204, 255));
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_0 = new GridBagConstraints();
		gbc_btn_0.fill = GridBagConstraints.BOTH;
		gbc_btn_0.insets = new Insets(0, 0, 0, 5);
		gbc_btn_0.gridx = 0;
		gbc_btn_0.gridy = 6;
		frmCalculatorGUI.getContentPane().add(btn_0, gbc_btn_0);
		
		JButton btn_point = new JButton(".");
		btn_point.setBackground(new Color(204, 204, 255));
		btn_0.setBorderPainted(false);
		btn_point.setFont(new Font("Tahoma", Font.PLAIN, 55));
		GridBagConstraints gbc_btn_point = new GridBagConstraints();
		gbc_btn_point.insets = new Insets(0, 0, 0, 5);
		gbc_btn_point.fill = GridBagConstraints.BOTH;
		gbc_btn_point.gridx = 1;
		gbc_btn_point.gridy = 6;
		frmCalculatorGUI.getContentPane().add(btn_point, gbc_btn_point);
		
		JButton btn_equal = new JButton("=");
		btn_0.setBorderPainted(false);
		btn_equal.setBackground(new Color(204, 204, 255));
		btn_equal.setMargin(new Insets(0, 0, 0, 0));
		btn_equal.setFont(new Font("Tahoma", Font.PLAIN, 63));
		GridBagConstraints gbc_btn_equal = new GridBagConstraints();
		gbc_btn_equal.gridwidth = 2;
		gbc_btn_equal.fill = GridBagConstraints.BOTH;
		gbc_btn_equal.gridx = 2;
		gbc_btn_equal.gridy = 6;
		frmCalculatorGUI.getContentPane().add(btn_equal, gbc_btn_equal);
		
		
		
	}

}
