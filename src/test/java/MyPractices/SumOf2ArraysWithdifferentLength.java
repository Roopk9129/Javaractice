package MyPractices;

public class SumOf2ArraysWithdifferentLength {

	public static void main(String[] args) {
		int a[] = { 6, 12, 24 };
		int b[] = { 12, 13, 14, 15 };
		if (a.length > b.length) {
			for (int i = 0; i < a.length; i++) {
				a[i] = a[i] + b[i];
				try {
					System.out.println(a[i]);
				} catch (Exception e) {

				}

			}
		} else {
			for (int j = 0; j < b.length; j++) {
				b[j] = b[j] + a[j];
				try {
					System.out.println(b[j]);	
				} catch (Exception e) {
				}
				

			}

		}
	}

}
