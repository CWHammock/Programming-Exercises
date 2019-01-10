/**
 * 
 * created by charles hammock
 * 
 * Given the value of principal, interest and year. 
 * You can calculate the simple interest using the formula 
 * Sample Interest = (principal * interest * year)/100 
 * Round the value to the nearest integer and print it.
 */

import java.io.*;
import java.util.*;
public class CalculateInterest {
    	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		double principal = scanner.nextDouble();
		int interest = scanner.nextInt();
		int year = scanner.nextInt();
		

		
		int overInterest = (int)(principal * interest * year)/100;
		System.out.println(overInterest);
	}
}