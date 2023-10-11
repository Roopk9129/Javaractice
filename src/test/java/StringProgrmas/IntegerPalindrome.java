package StringProgrmas;

public class IntegerPalindrome {

	public static void main(String[] args) {
		int num = 121;
		int r;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Palyndrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

}
