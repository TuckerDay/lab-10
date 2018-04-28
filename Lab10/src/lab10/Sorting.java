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
	

}