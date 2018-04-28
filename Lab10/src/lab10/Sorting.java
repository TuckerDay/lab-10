//***************************************************************
//Author: Tucker Day and Catey Meador
//File: Sorting.java
//Last Changed Date: 4/28/18
//***************************************************************

package lab10;

import java.util.ArrayList;

public class Sorting {
	
	public static void selectionSort (ArrayList<Word> wordArray)
	{ 
		int min;
		Word temp;
		for (int index = 0; index < wordArray.size()-1; index++)
		{ 
			min = index; 
			for (int scan = index+1; scan < wordArray.size(); scan++)
				if (wordArray.get(scan).getFreq() > wordArray.get(index).getFreq())
					min = scan; 
				// Swap the values 
				temp = wordArray.get(min);
				wordArray.set(min,  wordArray.get(index));
				wordArray.set(index, temp);
		} 
	}
	
	public static void insertionSort (ArrayList<Word> wordArray) 
	{ 
		for ( int index = 1; index < wordArray.size(); index++)
		{ 
			Integer key = wordArray.get(index).getFreq(); 
			int position = index;
		
			// Shift larger values to the right 
			while ( position > 0 && key < wordArray.get(position-1).getFreq()) 
			{ 
				wordArray.set(position, wordArray.get(position-1));
				position--; 
			} 
			wordArray.set(position, wordArray.get(index));
		}
	}

}