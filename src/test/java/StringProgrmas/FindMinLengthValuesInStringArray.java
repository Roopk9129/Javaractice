package StringProgrmas;

public class FindMinLengthValuesInStringArray {

	public static void main(String[] args) {
		String str[] = { "abcd", "a", "bcdf", "edf", "d" };
		String minLen = str[0];

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < minLen.length()) {
				minLen = str[i];
			}

		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() == minLen.length()) {
				System.out.print(str[i] + " ");
			}

		}
	}

}
