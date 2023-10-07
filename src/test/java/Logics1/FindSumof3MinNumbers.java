package Logics1;

public class FindSumof3MinNumbers {

	public static void main(String[] args) {
		int a[] = { 20, 2, 9, 10, 11 };
		int l = a.length;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for (int s = 0; s < 3; s++) {
			sum = sum + a[s];

		}
		System.out.println("Sum of first 3 min numbers: " + sum);

	}

}
