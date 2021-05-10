package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class DigitListener implements ActionListener {

	private CalculatorLogic calc;
	private JTextField display;

	public DigitListener(CalculatorLogic calc, JTextField display) {
		this.calc = calc;
		this.display = display;
	}

	public void actionPerformed(ActionEvent e) {
		calc.pressDigit(Integer.parseInt(e.getActionCommand()));
		Integer n = calc.getOperand();
		display.setText(n.toString());
	}
}
