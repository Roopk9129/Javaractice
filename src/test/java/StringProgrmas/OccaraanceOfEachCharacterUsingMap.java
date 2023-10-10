package StringProgrmas;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccaraanceOfEachCharacterUsingMap {

	public static void main(String[] args) {
		String str = "TestYantra";
		String s = str.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map);

		}
		for (Entry<Character, Object> m : map.entrySet()) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (m.getKey() == s.charAt(i)) {
					count++;

				}
			}System.out.println(m.getKey()+" "+count);

		}
	}

}
