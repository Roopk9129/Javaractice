package StringProgrmas;

public class NoOfUpperAndLowerCharInString {

	public static void main(String[] args) {
		String str = "UppErCase";
		char[] ch = str.toCharArray();
		int uppercase = 0;
		int Lowercase = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				uppercase++;

			} else if (ch[i] >= 'a' && ch[i] <= 'z') {
				Lowercase++;

			}
		}
		System.out.println("Uppercase: " + uppercase + "\n" + "Lowercase: " + Lowercase);

	}

}
