package lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		
		// File reading variables
		File bookFile1 = new File("./src/files/Coyote.txt");
		File bookFile2 = new File("./src/files/Coyote and the Bitterroot Valley.txt");
		
		ArrayList<String> bookArray1;
		ArrayList<String> bookArray2;
		
		ArrayList<Word> wordArray;
		ArrayList<Word> wordArray1;
		
		
		// Read book 1
		Reader reader1 = new Reader(bookFile1);
		bookArray1 = new ArrayList<String>(reader1.getArray());
		
		// Read book 2
		Reader reader2 = new Reader(bookFile2);
		bookArray2 = new ArrayList<String>(reader2.getArray());
		
		// Create array of Word objects that hold word String and word frequency
		wordArray = new ArrayList<Word>();
		wordArray1 = new ArrayList<Word>();
		
		//removes small words from bookArray1
		for (int i = 0; i < bookArray1.size(); i++)
		{			
			if (bookArray1.get(i).equalsIgnoreCase("the") || bookArray1.get(i).equalsIgnoreCase("and") || bookArray1.get(i).equalsIgnoreCase("it") ||
					bookArray1.get(i).equalsIgnoreCase("a")|| bookArray1.get(i).equalsIgnoreCase("on") || bookArray1.get(i).equalsIgnoreCase("in"))
			{
				bookArray1.remove(i);
				continue;
			}
				
			// creates word objects for every word in bookArray and adds it to wordArray
			else
			{
			Word newWord = new Word(bookArray1.get(i),1);
			wordArray.add(newWord);
			}
		}
		
		//removes multiples of words in wordArray
		for (int i = 0; i < wordArray.size(); i++)
		{				
			for (int j = 0; j < wordArray.size(); j++)
			{
				if (wordArray.get(i).getText().equals(wordArray.get(j).getText())&&i!=j)
				{
					wordArray.remove(j);
				}
			}
		}
			
		// For each word in book array: see if word is in wordArray
		// if the word is in wordArray, increment its frequency
		for (int i = 0; i < bookArray1.size(); i++)
		{
			for (int j = 0; j < wordArray.size(); j++)
			{	
				if (wordArray.get(j).getText().equalsIgnoreCase(bookArray1.get(i)))
				{
					wordArray.get(j).setFreq(wordArray.get(j).getFreq()+1);
					break;
				}
				else
				{
					continue;
				}
			}
		}
	
		//removes small words from bookArray2
		for (int i = 0; i < bookArray2.size(); i++)
		{			
			if (bookArray2.get(i).equalsIgnoreCase("the") || bookArray2.get(i).equalsIgnoreCase("and") || bookArray2.get(i).equalsIgnoreCase("it") ||
				bookArray2.get(i).equalsIgnoreCase("a")|| bookArray2.get(i).equalsIgnoreCase("on") || bookArray2.get(i).equalsIgnoreCase("in"))
			{
				bookArray2.remove(i);
				continue;
			}
					
			// creates word objects for every word in bookArray and adds it to wordArray1
			else
			{
				Word newWord = new Word(bookArray2.get(i),1);
				wordArray1.add(newWord);
			}
		}
		
		//removes multiples of words in wordArray1
		for (int i = 0; i < wordArray1.size(); i++)
		{				
			for (int j = 0; j < wordArray1.size(); j++)
			{
				if (wordArray1.get(i).getText().equals(wordArray1.get(j).getText())&&i!=j)
				{
					wordArray1.remove(j);
				}
			}
		}
				
		// For each word in bookArray2: see if word is in wordArray1
		// if the word is in wordArray1, increment its frequency
		for (int i = 0; i < bookArray2.size(); i++)
		{
			for (int j = 0; j < wordArray1.size(); j++)
			{	
				if (wordArray1.get(j).getText().equalsIgnoreCase(bookArray2.get(i)))
				{
					wordArray1.get(j).setFreq(wordArray1.get(j).getFreq()+1);
					break;
				}
				else
				{
					continue;
				}
			}
		}

		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		Sorting.selectionSort(wordArray);
		
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		Sorting.selectionSort(wordArray1);
		
		//Prints out top ten most frequent words in Coyote.txt plus their frequency in and percentage of the text
		//Also adds the top ten words to a String array
		String[] wordArrayTop10 = new String[10];
		String[] wordArray1Top10 = new String[10];
		
		System.out.println("Coyote.txt");
		for (int i = 1; i < 11; i++)
		{
			System.out.println(i + ". Word: " + wordArray.get(i).getText() + "\nFrequency: " + wordArray.get(i).getFreq() + "\nPercentage: " + (wordArray.get(i).getFreq()*100)/bookArray1.size() + "%");
			wordArrayTop10[i-1] = wordArray.get(i).getText();
		}
		System.out.println("\n");
		
		//Prints out top ten most frequent words in Coyote and the Bitterroot Valley.txt plus their frequency in and percentage of the text
		//Also adds the top ten words to a String array
		System.out.println("Coyote and the Bitterroot Valley.txt");
		for (int i = 1; i < 11; i++)
		{
			System.out.println(i + ". Word: " + wordArray1.get(i).getText() + "\nFrequency: " + wordArray1.get(i).getFreq() + "\nPercentage: " + (wordArray1.get(i).getFreq()*100)/bookArray2.size() + "%");
			wordArray1Top10[i-1] = wordArray1.get(i).getText();
		}
		
		System.out.println("\n");
		
		// Check to see which words the two top 10 String arrays have in common and prints out statements accordingly
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				if (wordArrayTop10[i].equals(wordArray1Top10[j]))
				{
					System.out.println("Coyote.txt and Coyote and the Bitterroot Valley.txt both contain " + "\"" + wordArrayTop10[i] + "\"" + " in their top 10 most frequent words.");
				}
			}
		}
		
		System.out.println("\n");
		
		//Example of how to search for frequency of word
		System.out.println(Searching.linearSearch(wordArray, "Coyote"));
		

	}

}