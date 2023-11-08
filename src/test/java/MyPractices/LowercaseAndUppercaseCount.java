  package MyPractices;

public class LowercaseAndUppercaseCount {

	public static void main(String[] args) {
		String str = "UppErCaseLowerCaSe";
		String u = "";
		String l = "";
		int uppercase = 0;
		int lowercase = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				uppercase++;
				u = u + str.charAt(i);
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lowercase++;
				l = l + str.charAt(i);
			}
		}

		System.out.println("Uppercase: " + uppercase + "\n" + "Lowercase: " + lowercase);
		System.out.println("Uppeercase Chars: " + u + "\n" + "Lowercase Chars: " + l);
	}

}
