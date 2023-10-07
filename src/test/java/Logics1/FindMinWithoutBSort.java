package Logics1;

public class FindMinWithoutBSort {

	public static void main(String[] args) {
		int[] a = { 22, 9, 7, 10 };
		int fmax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (fmax > a[i]) {
				fmax = a[i];
			}
		}
		System.out.println(fmax);
	}

}
