/**
 * 
 * created by charles hammock
 * 
 * the lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical 
 * order or lexicographical product) is a generalization of the way the alphabetical order of words is based 
 * on the alphabetical order of their component letters.
 * 
 * input: line 1: number of words line 2 -> n names
 * 
 * 3
 * james
 * ted 
 * paul
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class LexSort {
	public static void main(String[] args) throws IOException {
		List<String> words = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String numberLinesString = bufferedReader.readLine();
		int numberLinesInts = Integer.parseInt(numberLinesString);
		for(int i = 0; i < numberLinesInts;i++) {
			words.add(bufferedReader.readLine());
		}
		Collections.sort(words);
		for(String name: words){
		    System.out.println(name);
		}

	}
}
