/**
 * 
 * by: Charles Hammock
 * If the given input is of type integer, then you need to print 'This input is of type Integer.'
 *  to the stdout, * else if the given input is of type float, then you need to print 'This
 *  input is of type Float.' to the stdout, else if the given input is of type string, then 
 * you need to print 'This input is of type string' to the stdout, else print 'This is something else' to the stdout.
 *
 *
 */
import java.io.*;
import java.util.*;
public class isInteger {
    public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        boolean isInteger = false;
        boolean isString = false;
        boolean isFloat = false;
        boolean isSomethingElse = false;
        int dotCounter = 0;
        char[] inputChars = statement.toCharArray();

        
        if(Character.isDigit(inputChars[0]) == true || inputChars[0] == '.' || inputChars[0] == '-') {
        	for(int i = 1;i < inputChars.length;i++) {
            	if(Character.isDigit(inputChars[i]) == true) {
            		continue;
            	}else {
            		if(inputChars[i] == '.') {dotCounter++;}
            		else {isSomethingElse = true;}
            	}
        	}
        	if(dotCounter == 1) {isFloat = true;}
        	if(dotCounter == 0 && isSomethingElse == false) {isInteger = true;}
        	if(dotCounter > 1) {isSomethingElse = true;}
        }else {
        	for(int x = 0;x < inputChars.length;x++) {
        		if(Character.isLetter(inputChars[x]) == false) {
        			isSomethingElse = true;
        		}
        	}
        	if(isSomethingElse == false) {isString = true;}
        }
        
		if(isInteger == true) {System.out.println("This input is of type Integer.");}
		else if(isString == true) {System.out.println("This input is of type string.");}
		else if(isFloat == true) {System.out.println("This input is of type Float.");}
		else {System.out.println("This is something else.");}

	}
	
}