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
		
		//removes small words from bookArray
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
			// if the word is in the book array, increment its frequency
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
	
		//removes multiples, keeps largest frequency
		/*for (int i = 0; i < wordArray.size(); i++)
		{
			for (int j = 0; j < wordArray.size(); j++)
			{
				if (wordArray.get(i).getText().equals(wordArray.get(j).getText()))
				{
					if (wordArray.get(i).getFreq()>wordArray.get(j).getFreq())
					{
						wordArray.remove(j);
					}
					else if (wordArray.get(i).getFreq()<wordArray.get(j).getFreq())
					{
						wordArray.remove(i);
					}
				}
			}
		}*/
		for (int i = 0; i < bookArray2.size(); i++)
		{			
			if (bookArray2.get(i).equalsIgnoreCase("the") || bookArray2.get(i).equalsIgnoreCase("and") || bookArray2.get(i).equalsIgnoreCase("it") ||
				bookArray2.get(i).equalsIgnoreCase("a")|| bookArray2.get(i).equalsIgnoreCase("on") || bookArray2.get(i).equalsIgnoreCase("in"))
			{
				bookArray2.remove(i);
				continue;
			}
					
				// creates word objects for every word in bookArray and adds it to wordArray
			else
			{
				Word newWord = new Word(bookArray2.get(i),1);
				wordArray1.add(newWord);
			}
		}
		
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
				
				// For each word in book array: see if word is in wordArray
				// if the word is in the book array, increment its frequency
		for (int i = 0; i < bookArray1.size(); i++)
		{
			for (int j = 0; j < wordArray1.size(); j++)
			{	
				if (wordArray1.get(j).getText().equalsIgnoreCase(bookArray1.get(i)))
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
		
		//removes multiples, keeps largest frequency
		/*for (int i = 0; i < wordArray1.size(); i++)
		{
			for (int j = 0; j < wordArray1.size(); j++)
			{
				if (wordArray1.get(i).getText().equals(wordArray1.get(j).getText()))
				{
					if (wordArray1.get(i).getFreq()>wordArray1.get(j).getFreq())
					{
						wordArray1.remove(j);
					}
					else if (wordArray1.get(i).getFreq()<wordArray1.get(j).getFreq())
					{
						wordArray1.remove(i);
					}
				}
			}
		}*/
		//Sorting.insertionSort(wordArray);
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
		
		
		//Sorting.insertionSort(wordArray1);
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
		
		//System.out.println(bookArray1);
		//System.out.println(wordArray.size());
		//System.out.println(bookArray2);
		//System.out.println(wordArray1.size());
		
		/*for (int i = 0; i < wordArray1.size(); i++)
		{
			System.out.println("Word: " + wordArray1.get(i).getText() + "\nFrequency: " + wordArray1.get(i).getFreq());
		}
		
		for (int i = 0; i < wordArray.size(); i++)
		{
			System.out.println("Word: " + wordArray.get(i).getText() + "\nFrequency: " + wordArray.get(i).getFreq());
		}*/
		
		/*int place = 1;
		for (int i = 1; i < 11; i++)
		{
			System.out.println(place + ". Word: " + wordArray.get(i).getText() + "\nFrequency: " + wordArray.get(i).getFreq() + "\nPercentage: " + (wordArray.get(i).getFreq()*100)/bookArray1.size() + "%");
			place++;
		}
		int place2 = 1;
		for (int i = 1; i < 11; i++)
		{
			System.out.println(place2 + ". Word: " + wordArray1.get(i).getText() + "\nFrequency: " + wordArray1.get(i).getFreq() + "\nPercentage: " + (wordArray1.get(i).getFreq()*100)/bookArray2.size() + "%");
			place2++;
		}*/
		System.out.println(Searching.linearSearch(wordArray, "Coyote"));
		

	}

}