import java.util.Arrays;
import java.util.Scanner;

/**
 * created by warren hammock
 * Of all the given elements which are in the array, identify numbers 
 * that are odd and add them. Identify even numbers and add them. Multiply two 
 * values that you get after addition of odd numbers and even numbers.
 * Input: length of array \n numbers delimited by space \n
 * e.g. 
 * 6
 * 11 22 33 44 55 66
 * 13068
 * 
 */



public class AddEvenOdd {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int numOfArgs = scanner.nextInt();
		scanner.nextLine();
		String stringOfNums = scanner.nextLine();
		String[] lineOfNums = stringOfNums.split(" ");
		int totalEven = 0, totalOdd = 0;
		for(int i = 0;i < numOfArgs;i++) {			
			int nextNumber = Integer.parseInt(lineOfNums[i]);
			if(nextNumber % 2 == 0) {
				totalEven += nextNumber;
			}else {
				totalOdd += nextNumber;
			}
		}
		System.out.println(totalEven * totalOdd);
	}
}
