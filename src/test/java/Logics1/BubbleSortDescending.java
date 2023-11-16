package Logics1;

public class BubbleSortDescending {

	public static void main(String[] args) {
		int[] a = { 1, 8, 6, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.println(a[i]);

		}
	}

}
