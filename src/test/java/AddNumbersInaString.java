
public class AddNumbersInaString {

	public static void main(String[] args) {
		String s = "s19b65";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			boolean isDig = Character.isDigit(s.charAt(i));

			if (isDig) {
				int n = s.charAt(i) - 48;
				sum = n+sum;
			}

		}
		System.out.println(sum);
	}

}
