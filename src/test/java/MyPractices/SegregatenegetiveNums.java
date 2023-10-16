package MyPractices;

public class SegregatenegetiveNums {

	public static void main(String[] args) {
		int a[] = { +24, -1, -6, 666, -2, 12, 6 };
		int res[] = new int[a.length];
		int rescount = 0;
		int l = a.length - 1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				res[l] = a[i];
				l--;
			} else {
				res[rescount] = a[i];
				rescount++;
			}

		}
		for (Integer y : res) {
			System.out.println(y);

		}
	}

}
