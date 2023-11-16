package StringProgrmas;

public class p3 {

	public static void main(String[] args) {
		int[] input = { 7, 11, 14 };

		int c1 = input[0];
		int c2 = input[1];
		int c3 = input[2];
		
		while (c1 < c2) {
			c1++;
			if (c1 != 11) {
				System.out.println(c1);
			}
		}
		for (; c2 < c3;) {
			c2++;
			if (c2 != 14) {
				System.out.println(c2);
			}
		}
		
		
	}
}
