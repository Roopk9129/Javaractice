package StringProgrmas;

import java.util.LinkedHashSet;

public class CountVowelsWithoutDuplicates {

	public static void main(String[] args) {
		String str = "India";
		String strL = str.toLowerCase();
		char[] ch1 = strL.toCharArray();
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for (int i = 0; i < ch1.length; i++) {
			lh.add(ch1[i]);
		}
		int count=0;
		for (Character ch : lh) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
					|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				count++;
				System.out.print(ch+" ");
			}
			
		}System.out.println(count);
	}

}
