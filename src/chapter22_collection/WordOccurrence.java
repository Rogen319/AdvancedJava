package chapter22_collection;

public class WordOccurrence implements Comparable<WordOccurrence> {

	String word;
	int count;
	
	@Override
	public int compareTo(WordOccurrence other) {
		if(count > other.count)
			return 1;
		else if(count < other.count)
			return -1;
		return 0;
	}

}
