package StringProgrmas;

public class StingPalandrome {

	public static void main(String[] args) {
		String str = "DAD";
		String rev = "";
		char[] ch = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		if (str.equals(rev)) {
			System.out.println("Palandrome");

		} else {
			System.out.println("Not a Palandrome");
		}
	}

}
