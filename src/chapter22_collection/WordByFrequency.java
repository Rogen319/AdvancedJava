package chapter22_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WordByFrequency {

	public static void main(String[] args) {

		String text = "Good morning. Have a good class. Have a good visit. Have fun!";
		
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		
		String[] words = text.split("[ \n\t\r.,;:!?(){]");
		
		for(int i = 0; i < words.length; i++){
			String key = words[i].toLowerCase();
			
			if(key.length() > 0){
				if(map.get(key) == null){
					map.put(key, 1);
				}
				else{
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		List<WordOccurrence> record = new ArrayList<WordOccurrence>();
		
		for(Map.Entry<String, Integer> entry: entryset){
			System.out.println(entry.getValue() + "\t" + entry.getKey());
			// µœ÷∞¥¥ ∆µ≈≈–Ú
			WordOccurrence word = new WordOccurrence();
			word.word = entry.getKey();
			word.count = entry.getValue();
			record.add(word);
		}
		
		System.out.println();;
		
		Collections.sort(record);
		for(WordOccurrence word: record){
			System.out.println(word.count + "\t" + word.word);
		}
	}

}
