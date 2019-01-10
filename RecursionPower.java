/**
 * 
 * created by charles hammock
 * 
 * input base and power.  gives the solution.
 * 4^3 = 4*4*4 = 64
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionPower {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bufferedReader.readLine().split(" ");
		int base = Integer.parseInt(input[0]);
		int exponent = Integer.parseInt(input[1]);
		int total = 0;
		total = recursivePower(base, exponent);
		System.out.println(total);
		
	}
	
	private static int recursivePower(int base, int exponent) {
		if(exponent < 1) {
			return 1;
		}else {
			return (base * recursivePower(base, --exponent));
		}
		
	}
}