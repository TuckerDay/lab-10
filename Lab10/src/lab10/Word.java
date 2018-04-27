package lab10;

public class Word {
	
	// Attributes
	private String text;
	private int freq;

	//Constructor
	public Word(String text, int freq) {
		this.text = text;
		this.freq = freq;
	}

	
	// Getters and setters
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}
	
}
