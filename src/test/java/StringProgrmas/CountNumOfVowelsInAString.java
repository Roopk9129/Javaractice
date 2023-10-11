package StringProgrmas;

public class CountNumOfVowelsInAString {

	public static void main(String[] args) {
		String str = "software";
		char[] ch = str.toCharArray();
		int VowelCount = 0;
		int consonents = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				VowelCount++;
			} else {
				consonents++;

			}

		}

		System.out.println("Vowels Count: " + VowelCount);
		System.out.println("Consonents Count: " + consonents);
	}

}
