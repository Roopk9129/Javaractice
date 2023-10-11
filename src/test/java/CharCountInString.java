
public class CharCountInString {

	public static void main(String[] args) {
		String s = "A566c1/(";
		int charCount = 0;
		int NumCount = 0;
		int splCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				charCount++;

			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				NumCount++;
			} else {
				splCount++;
			}

		}
		System.out.println(
				"Character Count: " + charCount + "\n" + "NumCount: " + NumCount + "\n" + "splCount: " + splCount);

	}

}
