package lab10;

import java.util.ArrayList;

public class Searching {

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
			return "Found Frequency: " + wordArray.get(index).getFreq();
		else
			return null;
	}
}
