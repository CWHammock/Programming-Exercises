/**
 * 
 * created by charles hammock
 * 
 * For a number, we will calculate its factorial by multiplying the number with the
 *  numbers which comes between 1(inclusive) and the number itself. 
 * For input as 5, its factorial will be 1*2*3*4*5 = 120. 
 * factorial of n (n!) = 1*2*3*4....n
 * 
 */

import java.io.*;
import java.util.*;
public class Factorial {
    	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int input;
		try {
			input = scanner.nextInt();
			if(input > 15) { 
				throw new Exception("Number too high..");
			}else {
				System.out.println(factorial(input));
			}
		}catch(InputMismatchException e) {
			System.out.println("I need an integer...");
		}
		
		
	}
	
	private static int factorial(int number) {
		int result = 1;
		for(int i = 1;i <= number;i++) {
			result *= i;
		}
		return result;
	}
}