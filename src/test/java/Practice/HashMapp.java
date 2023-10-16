package Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapp {

	public static void main(String[] args) {
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(70, "hi");
		map.put(20, 30);
		map.put(5, 30);
		map.put(5, "hello");
		map.put(null, 50);
		map.put(60, null);
		map.put(null, 70);
		map.put(80, null);
		System.out.println(map);
		for (Entry<Integer, Object> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
	}

}
