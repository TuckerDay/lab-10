package lab10;

import java.util.ArrayList;

public class Searching {

	//Allows for searching of word in Word array, return frequency of word in story
	public static String linearSearch(ArrayList<Word> wordArray, String word) {
		int index = 0;
		boolean found = false;
		while (!found && index < wordArray.size()) {
			if (wordArray.get(index).getText().equalsIgnoreCase(word))
				found = true;
			else
				index++;
		}
		if (found)
			return "Found Frequency of " + word + ": " + wordArray.get(index).getFreq();
		else
			return null;
	}
}
