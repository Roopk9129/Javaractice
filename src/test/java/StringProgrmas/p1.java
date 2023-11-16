package StringProgrmas;

public class p1 {
	public static void main(String[] args) {
		int[] input = { 7, 11, 14};
		int minimum = input[0] +1;
		int maximum = input[input.length - 1];
		for (int i = minimum; i < maximum ; i++) {
			if (i != 11 && i!=input[2]) {
				System.out.println(i);
			}
		}
	}
}
