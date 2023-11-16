package StringProgrmas;

public class p2 {

	public static void main(String[] args) {
		int input[] = { 35, 37, 39 };
		int minimum = input[0];
		int maximum = input[input.length - 1];

		for (int i = minimum + 1; i < maximum; i++) {
			if (i != input[1] && i!=input[2]) {
				System.out.println(i);
			}

		}
	}

}
