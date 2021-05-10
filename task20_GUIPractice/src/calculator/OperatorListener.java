package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class OperatorListener implements ActionListener {

	private CalculatorLogic calc;
	private JTextField display;

	public OperatorListener(CalculatorLogic calc, JTextField display) {
		this.calc = calc;
		this.display = display;
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("=")) {
			calc.pressEqual();
			display.setText(Integer.toString(calc.getResult()));
		} else if (command.equals("C")) {
			calc.pressDelete();
			display.setText(calc.getResult);
		} else {

		}
	}
}
