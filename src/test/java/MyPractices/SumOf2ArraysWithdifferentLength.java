package MyPractices;

public class SumOf2ArraysWithdifferentLength {

	public static void main(String[] args) throws Throwable{
		int a[] = { 6, 12, 24 };
		int b[] = { 12, 13, 14, 15 };
		if (a.length > b.length) {
			for (int i = 0; i < a.length; i++) {
				a[i] = a[i] + b[i];
				System.out.println(a[i]);

			}
		} else {
			for (int j = 0; j < b.length; j++) {
				b[j] = b[j] + a[j];
				System.out.println(b[j]);

			}

		}
	}

}
