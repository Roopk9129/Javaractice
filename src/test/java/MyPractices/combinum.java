package MyPractices;

public class combinum {
	public static void main(String[] args) {
		int[] a = { 6, 10, 1, 12, 5 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 11) {
					System.out.println(a[i] + "+" + a[j] + "=" + "11");
				}
			}
		}
	}
}
