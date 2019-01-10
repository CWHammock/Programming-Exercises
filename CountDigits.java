/**
 * 
 * created by charles hammock
 * 
 * Every time you divide the input number by 10, one digit get reduced and you need to maintain a 
 * count of that until the input number reduced to 0. The count value is your answer. 
 * 34567/10 = 3456 count = 1 
 * 3456/10 = 345 count = 2 
 * 345/10 = 34 count = 3
 * 34/10 = 3 count = 4 
 * 3/10 = 0 count = 5
 */

import java.io.*;
import java.util.*;
public class CountDigits {
    	public static void main(String...strings) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int count = 0;
		while(true) {
			if (number / 10 == 0) {
				count++;
				break;
			}else {
				number /= 10;
				//System.out.print(number + " ");
				count++;
				//System.out.println(count);
			}
		}
		System.out.println(count);
	}
}