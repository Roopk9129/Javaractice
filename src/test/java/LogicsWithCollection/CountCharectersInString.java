package LogicsWithCollection;

import java.util.LinkedHashSet;

public class CountCharectersInString {

	public static void main(String[] args) {
		String s = "Tester";
		String sl = s.toLowerCase();
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for (int i = 0; i < sl.length(); i++) {
			hs.add(sl.charAt(i));

		}
		for (Character ch : hs) {
			int count = 0;
			for (int i = 0; i < sl.length(); i++) {
				if (ch == sl.charAt(i)) {
					count++;
				}

			}
			System.out.println(ch + " is repeated " + count + " times");

		}
	}

}
