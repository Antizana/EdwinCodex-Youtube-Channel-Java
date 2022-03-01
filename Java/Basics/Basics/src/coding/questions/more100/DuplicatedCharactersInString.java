package coding.questions.more100;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatedCharactersInString {

	public static void main(String[] args) {
		String string = "Hello World!".toLowerCase();
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < string.length(); i++) {
			String currChar = "" +  string.charAt(i);
			if (map.get(currChar) != null) {
				map.put(currChar, map.get(currChar) + 1);
			} else {
				map.put(currChar, 1);
			}
		}
		System.out.println(string);
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey());
			}
		}
	}

}
