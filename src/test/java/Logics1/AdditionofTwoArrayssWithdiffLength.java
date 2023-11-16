package Logics1;

public class AdditionofTwoArrayssWithdiffLength {

	public static void main(String[] args) {
		int a[] = { 5, 2, 6, 7, 3 };
		int[] b = { 2, 1, 7, 4, 11, 100 };
		int length = a.length;
		
		if (a.length < b.length) {
			length = b.length;
		}
		
		for (int i = 0; i < length; i++) {
			try {
				System.out.println(a[i] + b[i]);
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
