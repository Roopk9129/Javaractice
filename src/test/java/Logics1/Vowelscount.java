package Logics1;

public class Vowelscount {

	public static void main(String[] args) {
		String input = "i am from india";
		String vowels = "aeiou";
		int vowel = 0;
		int consonents = 0;

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				try {
				if (input.charAt(j)==vowels.charAt(i) ) {
					vowel++;
				} else if (input.charAt(i) != ' ') {
					consonents++;
				}
				}catch(Exception e) {
					
				}
			}
		}
		System.out.println("Vowels: " + vowel + "\n" + "Consonents: " + consonents);
	}
}
