/**
 * 
 * created by charles hammock
 * 
 * find the GCD of two numbers.
 * input: one line 2 numbers:
 * 81 81
 * return 81
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindGCD {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bufferedReader.readLine().split(" ");
		int firstNumber = Integer.parseInt(input[0]);
		int secondNumber = Integer.parseInt(input[1]);
		int result = getGCD(firstNumber, secondNumber);
		System.out.println(result);
		
		
	}
	
	private static int getGCD(int firstNumber, int secondNumber) {
		int gCD = 1;
		int maxPoint = firstNumber;
		if(secondNumber > maxPoint) {maxPoint = secondNumber;}
		for(int i = 1;i <= maxPoint;i++) {
			if(firstNumber % i == 0 && secondNumber % i == 0) {
				gCD = i;
			}
		}
		return gCD;
		
	}
}