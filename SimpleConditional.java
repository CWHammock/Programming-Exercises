/**
 * 
 * 
 * created by charles hammock
 * 
 * Print the sentence according to the value of the 
 * integer which you had taken as an input. 
 */

import java.io.*;
import java.util.*;
public class SimpleConditional {
    	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age < 10) {
			System.out.println("I am happy as having no responsibilities.");
		}else if (age < 18) {
			System.out.println("I am still happy but starts feeling pressure of life.");
		}else {
			System.out.println("I am very much happy as i handled the pressure very well.");
		}
	}
}