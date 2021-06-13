package addNumbers;

import java.util.ArrayList;
import java.util.Random;

public class AddNumbersLogic {

	private ArrayList<Integer> numList = new ArrayList<Integer>();

	private int numSum;
	private int tempNum;
	private int targetNum;


	public AddNumbersLogic() {
		this.targetNum = generateNumber();
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
	
	
	public int generateNumber() {
		Random randomNumber = new Random();
		int targetNumber = randomNumber.nextInt(20);
		return  targetNumber;
	}
	
	public void addNumber(int tempNum) {
		numList.add(tempNum);
	}
	
	
	public void tryNumber(int tempNum) {
			boolean correcto = true;
			numSum += tempNum;
			addNumber(tempNum);
	
			if (numSum > targetNum) {
				numSum -= tempNum;
				numList.remove(numList.size() - 1);
				correcto = false;
				//System.out.println("Te has pasado, prueba otra vez");
			}
	
			//System.out.println(numList);
	
	}



}
