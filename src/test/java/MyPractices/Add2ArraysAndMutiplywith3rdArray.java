package MyPractices;

public class Add2ArraysAndMutiplywith3rdArray {

	public static void main(String[] args) {
		int a[] = { 20, 6, 8, 5 };
		int b[] = { 6, 4, 10, 99 };
		int c[] = { 2, 6, 1 };

		int length = a.length;

		if (a.length < b.length) {
			length = b.length;
		} else if (b.length > c.length) {
			length = c.length;
		} else if (c.length > a.length) {
			length = c.length;
		}
		for (int i = 0; i < length; i++) {
			try {
				System.out.println((a[i] + b[i]) * c[i]);
			} catch (Exception e) {
				if (a.length > b.length) {
					System.out.println(a[i]);

				} else if (b.length > c.length) {
					System.out.println(b[i]);

				} else if (c.length > a.length) {
					System.out.println(c[i]);

				}
			}

		}
	}

}
