package Logics1;

public class AdditionofTwoArrayss {

	public static void main(String[] args) {
		int[] a = { 5, 2, 6, 7, 3 };
		int[] b = { 2, 1, 7, 4, 2 };
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			c[i] = a[i] + b[i];

		}
		for (int y = 0; y < c.length; y++) {
			System.out.println(c[y]);
		}
	}

}
