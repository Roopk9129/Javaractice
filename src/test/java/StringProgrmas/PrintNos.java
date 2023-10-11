package StringProgrmas;

public class PrintNos {

	public static void main(String[] args) {
		// 1 3 7 15 31 63
		// 1+1+1=3 3+3+1=7 7+7+1=15
		int n = 1;

		for (int i = 0; i <= 6; i++) {
			System.out.println(n + " ");
			n = (n * 2) + 1;
		}

	}

}
