/**
 * 
 * created by charles hammock
 * 
 * Of all the given elements, search the second largest element.
 */

import java.io.*;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfElements = scanner.nextInt();
		int[] numberArray = new int[numberOfElements];
		int maxOne = 0, maxTwo = 0;
		for(int i = 0; i < numberOfElements; i++) {
			numberArray[i] = scanner.nextInt();
			if(numberArray[i] > maxOne) {
				maxTwo = maxOne;
				maxOne = numberArray[i];
			}
		}
		
		System.out.println(maxTwo);
	}
}