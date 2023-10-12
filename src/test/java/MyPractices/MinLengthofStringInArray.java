package MyPractices;

public class MinLengthofStringInArray {

	public static void main(String[] args) {
		String[] str = { "abc", "abcd", "ab", "ba" };
		String minLen = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < minLen.length()) {
				minLen = str[i];
			}
		}
		for (int j = 0; j < str.length; j++)
			if (str[j].length() == minLen.length()) {
				System.out.println(str[j] + " ");
			}
	}

}
