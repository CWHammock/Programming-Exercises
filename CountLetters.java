/**
 * 
 * created by charles hammock
 * 
 * string which is taken as input, it has 3 uppercase letters which is displayed on one line and 7 lowercase 
 * letters which is displayed on another line.
 */


import java.io.*;
import java.util.*;
public class CountingLetters {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String phrase = scanner.nextLine();
		scanner.close();
		char[] phraseArray = phrase.toCharArray();
		int capLetter = 0, lowLetter = 0;
		for(char letter: phraseArray) {
			if(Character.isUpperCase(letter)) {
				capLetter++;
				
			}
			if(Character.isLowerCase(letter)) {
				lowLetter++;
			}
		}
		System.out.println(capLetter);
		System.out.println(lowLetter);

	}
}