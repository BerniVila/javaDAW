package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class OperatorListener implements ActionListener {

	private CalculatorLogic calc;
	private JLabel display;
	private JLabel opDisplay;

	public OperatorListener(CalculatorLogic calc, JLabel display, JLabel lblShowOperation) {
		this.calc = calc;
		this.display = display;
		this.opDisplay = lblShowOperation;
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		switch (command.charAt(0)) {
		case '=':
			calc.pressEqual();
			display.setText(Double.toString(calc.getResult()));
			opDisplay.setText(display.getText() + Double.toString(calc.getResult()));
			break;
		case 'D':
			calc.pressDelete();
			display.setText(calc.getDisplay());
			opDisplay.setText(Double.toString(calc.getResult()));
			break;
		case 'A':
			calc.pressReset();
			display.setText(calc.getDisplay());
			opDisplay.setText(calc.getDisplay());
			break;
		case '.':
			calc.pressPoint();
			display.setText(calc.getDisplay());
			opDisplay.setText(Double.toString(calc.getResult()));
			break;
		default:
			calc.pressOperator(command.charAt(0));
			display.setText(calc.getDisplay());
			//opDisplay.setText(Double.toString(calc.getResult()));
			//opDisplay.setText(Double.toString(calc.getOperand() + calc.getOperator()));
		}

	}
}
