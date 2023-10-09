package LogicsWithCollection;

import java.util.LinkedHashSet;

public class PrintPositionOfEachChar {

	public static void main(String[] args) {
		String str = "Tester";
		String s = str.toLowerCase();

		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));

		}
			for (Character chare : lh) {
				for (int i = 0; i < s.length(); i++) {
				if (chare == s.charAt(i)) {
					System.out.println(chare+" is in "+(i+1)+" position");
					break;
				}
			}

		}

	}

}
