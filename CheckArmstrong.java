/**
 * 
 * created by charles hammock
 * 
 * It is a armstrong Number as 3^3 + 7^3 + 0^3 = 370.
 */

import java.io.*;
import java.util.*;
public class CheckArmstrong {
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