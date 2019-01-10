/**
 * 
 * created by charles hammock
 * 
 * There are 7 prime numbers which lies in the given range.
 * They are 3, 5, 7, 11, 13, 17, 19
 */

import java.io.*;
import java.util.*;
public class CountingPrimes {
    	public static void main(String...strings) {
		Scanner scanner = new Scanner(System.in);
		int lowRange = scanner.nextInt();
		int highRange = scanner.nextInt();
		int[] noDivideByTwo = new int[highRange];
		int primeNumberCounter = 0;
		int counter = 0;
		//get all numbers that are not divisible by 2 in array
		for(int checkEven = 0;checkEven <= highRange; checkEven++) {
			if(checkEven % 2 == 0) {continue;}
			noDivideByTwo[counter] = checkEven;
			counter++;
		}
		for(int checkAll = 0; checkAll < noDivideByTwo.length; checkAll++) {
			//System.out.print(noDivideByTwo[checkAll] + " ");
			boolean isPrime = true;
			for(int checkIfDivisible = 0; checkIfDivisible < checkAll; checkIfDivisible++) {
				if(noDivideByTwo[checkIfDivisible] == 1) {continue; }
				if(noDivideByTwo[checkAll] == noDivideByTwo[checkIfDivisible]) {continue;}
				if(noDivideByTwo[checkAll] % noDivideByTwo[checkIfDivisible] == 0) {
					isPrime = false;
				}
			}
			if(isPrime == true && noDivideByTwo[checkAll] >= lowRange
					&& noDivideByTwo[checkAll] <= highRange) {
				if(noDivideByTwo[checkAll] == 1) {continue;}
				primeNumberCounter++;
								
			}
			
		}
		System.out.println(primeNumberCounter);

	}
}