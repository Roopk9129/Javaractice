package Logics1;

public class BubblesortAssending {

	public static void main(String[] args) {
		int[] a = { 5, 3, 1, 4 };
		int x = a.length;
		for (int i = 0; i < x; i++) {
			for (int j = i + 1; j < x; j++) {
				if (a[i] > a[j]) {

					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
//			System.out.println(a[i]);
		}
		for (int j = 0; j <= 3; j++) {
			System.out.println(a[j]);

		}
	}

}
