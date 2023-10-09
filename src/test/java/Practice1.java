
public class Practice1 {

	public static void main(String[] args) {
		int a[] = { 12, 5, 60, 20 };
		int i;
		for (i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}

		}
		System.out.println(a[i - a.length + 1]);
	}

}
