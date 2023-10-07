package Logics1;

public class Findmulof3MaxNumbers {

	public static void main(String[] args) {
		int a[] = { 12, 16, 8, 5 };
		int len = a.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);

		}
		int mul = 1;
		for (int i = 0; i < 3; i++) {
			mul = mul * a[i];
		}
		System.out.println(mul);

	}

}
