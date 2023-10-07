package Logics1;

public class firstMinNumInAnArray {

	public static void main(String[] args) {
		int a[] = { 20, 6, 9, 10, 11 };
		int l = a.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println(a[0]);

	}

}
