package calculator;

public class CalculatorLogic {

	private int operand1;
	private int operand2;
	private char operator;
	private boolean isFirstOperand;

	public void pressDigit(int digit) {
		if (isFirstOperand) {
			operand1 = operand1 * 10 + digit;
		} else {
			operand2 = operand2 * 10 + digit;
		}
	}

	public void pressOperator(char operator) {
		this.operator = operator;
	}
}
