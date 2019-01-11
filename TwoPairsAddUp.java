/**
 * 
 * created by charles hammock
 * 
 * take an integer input on first line which tells about the size 
 * of the array.Another line will have array elements separated by 
 * spaces. Last line will have an integer input that defines the 
 * number for which the pair has to be searched in the array. 
 * 
 * input: number of elements \n elements \n number to find \n
 * 
 * e.g.
 * 7
 * 33 12 -76 11 9 7 6
 * 20
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoPairsAddUp {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		//read first line for number of places
		String input = bufferedReader.readLine();
		int numberOfInputs = Integer.parseInt(input);
		//System.out.println("test: " + numberOfInputs); //test
		
		//create array of numberOfInputs places
		int inputs[] = new int[numberOfInputs];
		
		//grab line and seperate each number into array
		String[] numberString = bufferedReader.readLine().split(" ");
		
		//convert and place each string into inputs array
		for(int i = 0;i < numberString.length;i++) {
			inputs[i] = Integer.parseInt(numberString[i]);
		}
		
		//input number to find matching pair
		int numberToFindPair = Integer.parseInt(bufferedReader.readLine());
		
		boolean isPair = matchPairToSum(inputs, numberToFindPair);
		
		if(isPair = true) {System.out.println("True");}
		else {System.out.println("False");}
		
		
		
		
		
		
		
	}
	
	private static boolean matchPairToSum(int[] numberArray, int numberToFindPair) {
		boolean isFound = false;
		for(int numbers = 0;numbers < numberArray.length;numbers++) {
			for(int compare = 0;compare < numberArray.length;compare++) {
				if(numberArray[numbers] + numberArray[compare] == numberToFindPair) {
					isFound = true;
				}
			}
		}
		
		return isFound;
		
	}
}
