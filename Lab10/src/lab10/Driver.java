package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		// File reading variables
		File bookFile1 = new File("./src/lab10/Coyote.txt");
		File bookFile2 = new File("./src/lab10/Coyote and the Bitterroot Valley.txt");
		
		ArrayList<String> bookArray1, bookArray2;
		
		ArrayList<Word> wordArray;
		
		
		// Read book 1
		Reader reader1 = new Reader(bookFile1);
		bookArray1 = new ArrayList<String>(reader1.getArray());
		
		// Read book 2
		Reader reader2 = new Reader(bookFile2);
		bookArray2 = new ArrayList<String>(reader2.getArray());
			/*for (int i = 0; i < bookArray2.size(); i++) {
				System.out.println(bookArray2.get(i));*/
		
		// Create array of Word objects that hold word String and word frequency
		wordArray = new ArrayList<Word>();
		
		// For each word in book array: see if word is in countArray
		for (int i = 0; i < bookArray1.size(); i++) {
			
			// if the word is in the book array, increment its frequency
			
			// if the word is not in the array, create it
		}		
		
	}

}
