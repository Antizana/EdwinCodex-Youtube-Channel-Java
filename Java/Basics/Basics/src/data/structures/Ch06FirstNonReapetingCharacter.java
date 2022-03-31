package data.structures;

/**
 * FirstNonReapetingCharacter sample code for Youtube video
 * CH6
 * */

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ch06FirstNonReapetingCharacter {

	public static void main(String[] args) {
		String string = "HelloHoney";
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < string.length(); i++) {
			String currChar = "" + string.charAt(i);
			if (map.get(currChar) != null) {
				map.put(currChar, map.get(currChar) + 1);
			} else {
				map.put(currChar, 1);
			}
		}
		System.out.println(map);
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		boolean founded = false;
		while (it.hasNext() && !founded) {
			Map.Entry<String, Integer> entry = it.next();
			if (entry.getValue() == 1) {
				System.out.println("First non reapeted character: '" + entry.getKey() + "'");
				founded = true;
			}
		}
	}

}
