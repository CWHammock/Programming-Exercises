
import java.util.Scanner;


/**
 * created by warren hammock
 * Of all the given elements which are in the array, 
 * identify numbers that are present at odd index and add them. 
 * Identify even index numbers and add them. Subtract the smaller 
 * vale from the larger one.
 * input: number of elements in array \n numbers in array \n
 * 
 * e.g.
 * 6
 * 11 22 33 44 55 66
 * 33
 * 
 */



public class EvenOrOddWar {
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
		int answer = 0;
		answer = (totalEven > totalOdd ? totalEven - totalOdd : 
				totalOdd - totalEven);
		System.out.println(answer);
	}
}
