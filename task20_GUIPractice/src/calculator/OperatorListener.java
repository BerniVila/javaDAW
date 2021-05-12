package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class OperatorListener implements ActionListener {

	private CalculatorLogic calc;
	private JLabel display;

	public OperatorListener(CalculatorLogic calc, JLabel display) {
		this.calc = calc;
		this.display = display;
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		switch (command.charAt(0)) {
		case '=':
			calc.pressEqual();
			display.setText(Double.toString(calc.getResult()));
			break;
		case 'D':
			calc.pressDelete();
			display.setText(calc.getDisplay());
			break;
		case 'A':
			calc.pressReset();
			display.setText(calc.getDisplay());
			break;
		default:
			calc.pressOperator(command.charAt(0));
			display.setText(calc.getDisplay());

		}

	}
}// añadir cpdigo para agregar AC, mejor con un switch
