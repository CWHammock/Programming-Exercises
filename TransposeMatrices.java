/**
 * 
 * created by charles hammock
 * 
 * The transpose of a matrix is a new matrix whose rows are the columns of the original.
 * input: 
 * example 3 by 3 martix:  * line 1 row and column length * line 2 1-3 of matrix * line 3 4-6 matrix *line 4 7-9 matrix
 * 
 * 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9 
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TransposeMatrix {
	public static void main(String[] args) throws IOException {
		//get first or second matrices input
		BufferedReader buff = null;
		buff = new BufferedReader(new InputStreamReader(System.in));
		int rowMax = 0, columnMax = 0;
		
		int[][] oldMatrices;
				
		//read in original matrix
		String oldMString = buff.readLine();
		int[] oldMArray = stringToIntArray(oldMString);
		rowMax = oldMArray[0];
		columnMax = oldMArray[1];
		oldMatrices = new int[rowMax][columnMax];
		for(int rowStart = 0;rowStart < rowMax;rowStart++) {
			String rowLine = buff.readLine();
			int[] rowString = stringToIntArray(rowLine);
			for(int columnStart = 0;columnStart < columnMax;columnStart++) {
				oldMatrices[rowStart][columnStart] = rowString[columnStart];
			}
		}
		
		//transpose matrices
		int[][] transposedMatrices = transposeMatrix(oldMatrices);
		
		//print transposed matrices		
		for(int[] row: transposedMatrices) {
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
	
	private static int[][] transposeMatrix(int[][] matricesOne){
		int[][] transpose = new int[matricesOne.length][matricesOne[0].length];
		int transColumCount = 0;
		int transRowCount = 0;
		for(int i = 0;i < matricesOne.length;i++) {
			for(int j = 0; j < matricesOne[0].length;j++) {
				transpose[j][i] = matricesOne[i][j];
			}
		}
		return transpose;
	}

}
