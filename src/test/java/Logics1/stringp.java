package Logics1;

public class stringp {

	public static void main(String[] args) {
		String input = "I am from bangalore";
		String[] words = input.split(" ");
		StringBuilder reversed = new StringBuilder();
		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word);
			reversedWord.reverse();
			reversed.append(reversedWord);
			System.out.print(reversedWord + " ");
		}
	}
}
