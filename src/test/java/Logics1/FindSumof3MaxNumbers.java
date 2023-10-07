package Logics1;

public class FindSumof3MaxNumbers {

	public static void main(String[] args) {
		int a[] = { 24, 23, 5, 10 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}
			System.out.print(a[i]+" ");

		}
		int sum = 0;
		for (int s = 0; s < 3; s++) {
			sum = sum + a[s];

		}
		System.out.println("The sum of 3 maximum num: " + sum);

	}

}
