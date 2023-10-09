package StringProgrmas;

public class ReverseString {

	public static void main(String[] args) {
		String s = "I am from Bangalore";
		String[] str = s.split(" ");
		int len = str.length;
		for (int i = len; i > 0; i--) {
			System.out.print(str[i - 1] + " ");
		}
	}

}
