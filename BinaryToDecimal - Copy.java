import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * created by charles hammock
 * 
 * This is a traditional conversion which needs to be implemented in programming.
 * 
 * input: binary representation to decimal
 * 
 * e.g. 
 * 110
 * 6
 * 
 * 
 */



public class BinaryToDecimal {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bufferedReader.readLine();
		int decimal = Integer.parseInt(input, 2);
		System.out.println(decimal);
	}
}