package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
	// Variables
	private Scanner bookScan, lineScanner;
	private File book;
	private String out;
	
	private ArrayList<String> words;
	
	
	// Constructor
	public Reader(File book) {
		this.book = book;
		
		words = new ArrayList<String>();
		
		try {
			bookScan = new Scanner(book);
			read(bookScan);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Method to read from book attribute
	public void read(Scanner bookScan) throws FileNotFoundException {
		
		if (bookScan.hasNextLine())
		{
			// Create string
			String line = bookScan.nextLine();
			// Advance line in bookScan
			read(bookScan);
			
			// Scan the previously created line
			lineScanner = new Scanner(line);
			lineScanner.useDelimiter(" ");
			
			readLine(lineScanner);
		}
	}
	
	// Scan line, add words to Array words
	public void readLine(Scanner lineScanner)
	{
		if (lineScanner.hasNext())
		{
			words.add(lineScanner.next());
			readLine(lineScanner);
		}
	}
	
	// Prints words to console
	public void printWords()
	{
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
	
	// Get array of words
	public ArrayList<String> getArray(){
		return words;
		
	}

}
