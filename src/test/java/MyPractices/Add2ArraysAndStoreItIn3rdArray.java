package MyPractices;

public class Add2ArraysAndStoreItIn3rdArray {
	public static void main(String[] args) {
		int a[] = { 20, 6, 8, 5 };
		int b[] = { 6, 4, 10, 99, 60 };
		int len = a.length;
		int c[] = new int[len];

		if (a.length < b.length) {
			len = b.length;

		}
		for (int i = 0; i < len; i++) {

			try {
				c[i] = a[i] + b[i];
				System.out.println(c[i]);
			} catch (Exception e) {
				if (a.length > b.length) {
					System.out.println(a[i]);

				} else {
					System.out.println(b[i]);
				}
			}
		}
	}
}
