package Mock;

import java.util.LinkedHashMap;

public class NumOcc {

	public static void main(String[] args) {
		String str = "india";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), i);
			}
		}
		System.out.println(map);
	}

}
