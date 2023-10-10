package Assignment;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindOccarance {

	public static void main(String[] args) {
		String s = "TestYantra";
		String str = s.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();

		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), i);
		}
		for (Entry<Character, Object> m : map.entrySet()) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (m.getKey() == str.charAt(i)) {
					count++;
				}
			}

			System.out.print(m.getKey() + "-->" + count + " ");

		}

	}

}
