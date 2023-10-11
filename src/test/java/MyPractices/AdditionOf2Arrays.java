package MyPractices;

public class AdditionOf2Arrays {

	public static void main(String[] args) {
		int[] a = { 6, 7, 8, 9 };
		int[] b = { 15, 10, 2, 11 };
		int c[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println(a[i]+"+"+b[i]+"="+c[i]);

		}
//		for (int cc : c) {
//			System.out.println(cc);
//
//		}

	}

}
