/**
 * 
 * created by charles hammock
 * 
 * Two matrices must have an equal number of rows and columns to be added. The sum of two matrices A and B will be a 
 * matrix which has the same number of rows and columns as do A and B. The sum of A and B, denoted A + B, is computed
 *  by adding corresponding elements of A and B.
 * * example of 2(3 x 3) martix:  * line 1 row and column length * line 2 1-3 of matrix * line 3 4-6 matrix *line 4 7-9 matrix
 * 									continue same output for second matrix as first
 * 
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9 
 * 3 3
 * 2 3 4
 * 5 6 7
 * 7 8 9
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class AddMatrices {
	public static void main(String[] args) throws IOException {
		//get first or second matrices input
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));
		int rowMax = 0, columnMax = 0;
		
		int[][] matricesOne;
		int[][] matricesTwo;
		int[][] matricesSum;		
		
		//first matrix read in
		String firstMRCString = buff.readLine();
		int[] firstMRCArray = stringToIntArray(firstMRCString);
		rowMax = firstMRCArray[0];
		columnMax = firstMRCArray[1];
		matricesOne = new int[rowMax][columnMax];
		for(int rowStart = 0;rowStart < rowMax;rowStart++) {
			String rowLine = buff.readLine();
			int[] rowString = stringToIntArray(rowLine);
			for(int columnStart = 0;columnStart < columnMax;columnStart++) {
				matricesOne[rowStart][columnStart] = rowString[columnStart];
			}
		}
		
		//second matrix read in
		String secondMRCString = buff.readLine();
		int[] secondMRCArray = stringToIntArray(secondMRCString);
		rowMax = secondMRCArray[0];
		columnMax = secondMRCArray[1];
		matricesTwo = new int[rowMax][columnMax];
		for(int rowStart = 0;rowStart < rowMax;rowStart++) {
			String rowLine = buff.readLine();
			int[] rowString = stringToIntArray(rowLine);
			for(int columnStart = 0;columnStart < columnMax;columnStart++) {
				matricesTwo[rowStart][columnStart] = rowString[columnStart];
			}
		}
		
		matricesSum = sumMatrices(matricesOne, matricesTwo);
		for(int[] row: matricesSum) {
			for(int column: row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
	

	
	private static int[] stringToIntArray(String toConvert) {
		int[] intArray = new int[toConvert.length()];
		char[] stringCharArray = toConvert.toCharArray();
		int counter = 0;
		for(int i = 0; i < stringCharArray.length; i++) {
			if(stringCharArray[i] == ' ') {continue;}
			intArray[counter] = Character.getNumericValue(stringCharArray[i]);
			counter++;
		}
		return intArray;
		
	}
	
	private static int[][] sumMatrices(int[][] matricesOne, int[][] matricesTwo){
		int[][] sum = new int[matricesOne.length][matricesOne[0].length];
		for(int i = 0;i < sum.length;i++) {
			for(int j = 0; j < sum[0].length;j++) {
				sum[i][j] = matricesOne[i][j] + matricesTwo[i][j];
			}
		}
		return sum;
	}

}
