package Logics1;

public class PrintCombinationOfNums {

	public static void main(String[] args) {
		int[] a = { 7, 3, 8, 6, 5, 9, 2, 4, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 11) {
					System.out.println(a[i] + "+" + a[j] + "=" + "11");

				}

			}

		}
	}

}
