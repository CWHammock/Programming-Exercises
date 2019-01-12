import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



/**
 * 
 * created by charles hammock
 * 
 * Given an unsorted array arr[0..n-1] of size n, find 
 * the minimum length subarray arr[s..e] such that sorting 
 * this subarray makes the whole array sorted. 
 * 
 * input: number length \n numbers \n
 * 
 * e.g.
 * 13
 * 1 2 4 7 10 11 7 12 3 7 16 18 19
 * 
 * output
 * 4 7 10 11 7 12 3 7
 * 
 */



public class IndexForOrdered {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int amountOfNumbers = scanner.nextInt();
		int[] unsortedArray = new int[amountOfNumbers];
		
		for(int i = 0;i < amountOfNumbers;i++) {
			unsortedArray[i] = scanner.nextInt();
		}
		
		int[] sortedArray = new int[amountOfNumbers];
		System.arraycopy(unsortedArray, 0, sortedArray, 0, amountOfNumbers);
		Arrays.sort(sortedArray);
		
		int firstIndex = 0;
		for(int i = 0;i < unsortedArray.length;i++) {
			if(sortedArray[i] != unsortedArray[i]) {
				firstIndex = i;
				break;
			}
		}
		
		int secondIndex = 0;
		for(int x = unsortedArray.length - 1; x > 0; x--) {
			if(sortedArray[x] != unsortedArray[x]) {
				secondIndex = x;
				break;
			}
		}
		
		for(;firstIndex <= secondIndex;firstIndex++) {
			System.out.print(unsortedArray[firstIndex] + " ");
		}
	}
}
