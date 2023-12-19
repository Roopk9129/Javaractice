package StringProgrmas;

public class FindLengthofString {

	public static void main(String[] args) {
		String s = "testyantra";
		int count = 0;
		char[] ch = s.toCharArray();
		for (char chh : ch) {
			count++;
		}
		System.out.println(count);
	}

}
