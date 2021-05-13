package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class DigitListener implements ActionListener {

	private CalculatorLogic calc;
	private JLabel display;
	private JLabel opDisplay;

	public DigitListener(CalculatorLogic calc, JLabel lblShowResult, JLabel lblShowOperation) {
		this.calc = calc;
		this.display = lblShowResult;
		this.opDisplay = lblShowOperation;
	}

	public void actionPerformed(ActionEvent e) {
		calc.pressDigit(Double.parseDouble(e.getActionCommand()));
		Double n = calc.getOperand();
		display.setText(n.toString());
		opDisplay.setText(n.toString() + calc.getOperator());
	}
}
