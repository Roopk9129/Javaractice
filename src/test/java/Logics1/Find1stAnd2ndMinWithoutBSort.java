package Logics1;

public class Find1stAnd2ndMinWithoutBSort {

	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 6 };
		int fmin = a[0];
		int smin = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= fmin) {
				if (a[i] != fmin) {
					smin = fmin;
				}
				fmin = a[i];
			} else if (smin == fmin || a[i] < smin) {
				smin = a[i];
			}
		}
		System.out.println(fmin + " " + smin);
	}

}
