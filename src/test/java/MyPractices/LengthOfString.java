package MyPractices;

public class LengthOfString {

	public static void main(String[] args) {

		String str = "length";
		System.out.println(str.length());

		int count = 0;
		char[] ch = str.toCharArray();
		for (Character c : ch) {
			count++;
		}
		System.out.println(count);
	}

}
