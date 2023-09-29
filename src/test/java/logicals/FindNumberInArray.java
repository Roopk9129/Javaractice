package logicals;

public class FindNumberInArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int b = 8;
		boolean isPresent = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				isPresent = true;
				break;
			}
		}
		if (isPresent) {
			System.out.println(b + " given number is present");
		} else {
			System.out.println(b + " given number is not present");
		}
	}
}
