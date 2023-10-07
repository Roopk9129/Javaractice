package Logics1;

public class Find1stAnd2ndMaxWithoutBSort {

	public static void main(String[] args) {
		int[] a = { 5, 10, 15, 6 };
		int fmax = a[0];
		int smax = a[0];
		for (int i = 0; i < a.length; i++) {
 			if (a[i] >= fmax) {
				if (a[i] != fmax) {
					smax = fmax;
				}
				fmax = a[i];
			} else if (smax == fmax || a[i] > smax) {
				smax = a[i];
			}
		}
		System.out.println(fmax + " " + smax);
	}

}
