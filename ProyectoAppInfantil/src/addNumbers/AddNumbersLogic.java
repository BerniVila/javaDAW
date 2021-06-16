package addNumbers;

import java.util.ArrayList;
import java.util.Random;

public class AddNumbersLogic {

	private ArrayList<Integer> numList = new ArrayList<Integer>();

	private int numSum;
	private int tempNum;
	private int targetNum;

	public AddNumbersLogic(int initialValue) {
		this.targetNum = generateNumber(initialValue);
	}

	public ArrayList<Integer> getNumList() {
		return numList;
	}

	public void setNumList(ArrayList<Integer> numList) {
		this.numList = numList;
	}

	public int getNumSum() {
		return numSum;
	}

	public void setNumSum(int numSum) {
		this.numSum = numSum;
	}

	public int getTempNum() {
		return tempNum;
	}

	public void setTempNum(int tempNum) {
		this.tempNum = tempNum;
	}

	public int getTargetNum() {
		return targetNum;
	}

	public void setTargetNum(int targetNum) {
		this.targetNum = targetNum;
	}

	public int generateNumber(int level) {
		Random randomNumber = new Random();
		int targetNumber;

		do {
			targetNumber = randomNumber.nextInt(level);
		} while (targetNumber <= 1);

		return targetNumber;
	}

	public void addNumber(ArrayList<Integer> numList, int tempNum) {
		numList.add(tempNum);
	}

	public String checkResult(ArrayList<Integer> numList, int targetNum) {
		String result = "";
		int tempSum = 0;
		for (int i = 0; i < numList.size(); i++) {
			tempSum += numList.get(i);
		}

		if (tempSum > targetNum) {
			result = "lose";
		}
		if (tempSum == targetNum) {
			result = "win";
		}
		if (tempSum < targetNum) {
			result = "try";
		}

		return result;
	}

	@Override
	public String toString() {
		return "[ " + numList + " ]";
	}

}
