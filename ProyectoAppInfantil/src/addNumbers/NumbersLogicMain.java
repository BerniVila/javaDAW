package addNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersLogicMain {
	
	public static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numSum = 0;
		int tempNum = 0;
		int targetNum;
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		System.out.println("Teclea el numero objetivo y pulsa enter");
		targetNum = tec.nextInt();
		
		
		do {
			System.out.println("Teclea un numero");
			tempNum = tec.nextInt();
			numSum += tempNum;
			numList.add(tempNum);
			
			
			if (numSum > targetNum) {
				numSum -= tempNum;
				numList.remove(numList.size()-1);
				System.out.println("Te has pasado, prueba otra vez");
			}
			
			System.out.println(numList);
			
		} while (numSum != targetNum);
		
		System.out.println("Conseguido!!!");
		
		
	}

}
