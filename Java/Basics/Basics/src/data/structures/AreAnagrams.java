package data.structures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreAnagrams {

	public static void main(String[] args) {
		System.out.println(areAnagrams("nameless", "salesmen"));
		System.out.println(areAnagramsSorted("nameless", "salesmen"));
	}
	
	public static boolean areAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		Map<String, Integer> lista1 = new HashMap<>();
		Map<String, Integer> lista2 = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			if (lista1.containsKey(str1.charAt(i)+"")) {
				lista1.put(str1.charAt(i)+"", lista1.get(str1.charAt(i)+"")+1);
			} else {
				lista1.put(str1.charAt(i)+"", 1);				
			}
			if (lista2.containsKey(str2.charAt(i)+"")) {
				lista2.put(str2.charAt(i)+"", lista2.get(str2.charAt(i)+"")+1);
			} else {
				lista2.put(str2.charAt(i)+"", 1);				
			}				
		}
		for (Map.Entry<String, Integer> entry : lista1.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if (val != lista2.get(key)) return false;
		}
		return true;
	}
	
	public static boolean areAnagramsSorted(String str1, String str2) {
		if (str1.length() != str2.length()) return false;
		char[] str1Chars = str1.toCharArray();
		char[] str2Chars = str2.toCharArray();
		Arrays.sort(str1Chars);
		Arrays.sort(str2Chars);
		return Arrays.equals(str1Chars, str2Chars);
	}

}
