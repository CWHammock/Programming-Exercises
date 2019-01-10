/**
 * 
 * created by charles hammock
 * 
 * An n-digit number that is the sum of the nth powers of its digits is called an n-narcissistic number. 
 * For example, take the number 1634 
 * 1634 = 1^4 + 6^4 + 3^4 + 4^4 
 */

import java.io.*;
import java.util.*;
public class NarcissisticNumber {
    	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean isArmstrong = armstrongCheck(number);
		if(isArmstrong == true) {
			System.out.print("True");
		}else {
			System.out.print("False");
		}
	}
	
	private static boolean armstrongCheck(int number) {
		String numberString = Integer.toString(number);
		char[] numberCharArray = numberString.toCharArray();
		int sizeOfNumber = numberCharArray.length;
		int total = 0;
		for(int i = 0; i < numberCharArray.length; i++) {
			double numberInPosition = (double)Character.getNumericValue(numberCharArray[i]);
			int powerCalculation = (int) Math.pow(numberInPosition, ((double)sizeOfNumber));
			total += powerCalculation;
		}
		return (total == number);
	}
}