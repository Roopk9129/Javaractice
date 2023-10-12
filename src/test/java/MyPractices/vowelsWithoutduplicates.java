package MyPractices;

import java.util.*;

public class vowelsWithoutduplicates {

	public static void main(String[] args) {
		String str = "roopkumar";
		int count = 0;
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				System.out.println(ch + " ");
			}
		}
		System.out.println(count);
	}

}
