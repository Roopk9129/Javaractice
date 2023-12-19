package StringProgrmas;

public class num {

	public static void main(String[] args) {
		int a[] = { -1, 3, 5, -6, 8, 8, 10, -9, 10, 4, -2, 7, 11, 11,4,4,4 };
		int fl = a[0];
		int sl = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > fl) {
				sl = fl;
				fl = a[i];
			} else if (a[i] > sl && a[i] < fl) {
				sl = a[i];

			}
		}
		System.out.println(fl);
		System.out.println(fl + " " + sl);
	}
}
