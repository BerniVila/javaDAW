package calculator;

public class CalculatorLogic {

	private double operand1;
	private double operand2;
	private double result;
	private char operator;
	private boolean isFirstOperand = true;
	//private double accumulator;

	public CalculatorLogic() {

	}
	

	/**
	 * Returns the information that should be shown at the display of the calculator
	 * for its current state.
	 *
	 * @return The information to be shown at the display.
	 *
	 */
	public String getDisplay() {
		String display;
		if (isFirstOperand) {
			display = Double.toString(operand1);
		} else {

			display = Double.toString(operand2);
		}
		return display;
	}
	
	

	/**
	 * Notifies that the user has pressed a button with a digit.
	 *
	 * @param digit The digit the user has pressed (0 to 9).
	 *
	 */

	public void pressDigit(double digit) {
		if (isFirstOperand) {
			operand1 = operand1 * 10 + digit;
		} else {
			operand2 = operand2 * 10 + digit;
		}
	}

	public void pressOperator(char operator) {
		this.operator = operator;
		isFirstOperand = false;
	}

	public char getOperator() {
		return operator;
	}
	
	public double getOperand() {
		if (isFirstOperand)
			return operand1;
		else
			return operand2;
	}

	/**
	 * Notifies that the user has pressed the "=" button.
	 *
	 */
	public void pressEqual() {
		if (!isFirstOperand) {
			performOperation();
		}

	}

	public double getResult() {
		return result;
	}

	/**
	 * Notifies that the user has pressed the "C" button, which removes the last
	 * digit that was typed by the user.
	 *
	 */
	public void pressDelete() {
		if (isFirstOperand) {
			operand1 = operand1/10;
			if (operand1 <= 1) {
				operand1 = 0;
			}
		}else {
			operand2 /= 10;
			if (operand2 <= 1) {
				operand2 = 0;
			}
		}

	}

	/**
	 * Notifies that the user has pressed the "AC" button, which resets the state of
	 * the calculator to its initial state (display 0, accumulator 0, no pending
	 * operators.)
	 *
	 */
	
	 public void pressReset() { 
		// accumulator = 0;
		 operand1 = 0;
		 operand2 = 0;
		 //expectNewOperand(OPERATOR_NONE);
	  }
	 
	 public void pressPoint() {
		 if (isFirstOperand)
				operand1 /= 10;
			else
				operand2 /= 10;
	 }
	 
	 


	private void performOperation() {
		switch (operator) {
		case '+':
			result = operand1 + operand2;
			break;
		case '-':
			result = operand1 - operand2;
			break;
		case 'x':
			result = operand1 * operand2;
			break;
		case '\u00F7':
			// here we should take into account the possible division by 0
			result = operand1 / operand2;
			break;
		case '%':
			result = operand1 * (operand2 / 100);
			break;	

		}
		result = (Math.round(result * 1000000))/1000000.0;
		operand1 = result;
		operand2 = 0;
		operator = ' ';
		isFirstOperand = true;
	}


	


}
