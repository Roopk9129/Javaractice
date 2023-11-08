package Logics1;

public class Append0sLastInArray {

	public static void main(String[] args) {
		int a[] = { 0, 4, 0, 0, 2, 6, 0, 0 };
		int[] b = new int[a.length];
		int m = 0;
		int n = a.length - 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[m] = a[i];
				m++;
			} else {
				b[n] = a[i];
				n--;
			}
		}
		for (int c = 0; c < b.length; c++) {
			System.out.print(b[c] + " ");

		}
	}

}
