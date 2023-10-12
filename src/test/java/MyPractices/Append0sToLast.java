package MyPractices;

public class Append0sToLast {

	public static void main(String[] args) {
		int a[] = { 2, 4,0,0, 7, 0, 7, 0 };
		int n = a.length - 1;
		int m = 0;
		int r[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				r[m] = a[i];
				m++;

			} else {
				r[n] = a[i];
				n--;
			}
		}
		for (int s : r) {
			System.out.println(s);
		}
	}

}
