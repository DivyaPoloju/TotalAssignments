

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrenceWithHashmap {
	static void count_characters(char[] str_array) {
		HashMap<Character, Integer> my_map = new HashMap<Character, Integer>();

		for (char c : str_array) {
			if (my_map.containsKey(c)) {
				my_map.put(c, my_map.get(c) + 1);
			} else {
				my_map.put(c, 1);
			}
		}
		for (Map.Entry entry : my_map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		char[] JavaCharArray = { 'A', 'P', 'P', 'L', 'E' };
		count_characters(JavaCharArray);
	}
}