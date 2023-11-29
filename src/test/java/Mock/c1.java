package Mock;

import java.util.LinkedHashMap;

public class c1 {

	public static void main(String[] args) {
		String str = "aabccaa";
		LinkedHashMap<Object, Integer> map = new LinkedHashMap<Object, Integer>();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			map.put(str.charAt(i), count);

			for (Object set : map.keySet()) {
				if (set.equals(str.charAt(i))) {
					count++;

				}

			}
			System.out.println(map.keySet() + " " + count);
		}

	}

}
