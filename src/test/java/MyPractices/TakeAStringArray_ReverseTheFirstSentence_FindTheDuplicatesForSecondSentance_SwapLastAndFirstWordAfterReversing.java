package MyPractices;

public class TakeAStringArray_ReverseTheFirstSentence_FindTheDuplicatesForSecondSentance_SwapLastAndFirstWordAfterReversing {

	public static void main(String[] args) {
		String[] st = { "This is the first String Program", "Finding Duplicates in this string",
				"Swap first to last and last to first" };

		for (int i = 0; i < st.length; i++) {
			if (i == 0) {
				int len = st[i].length() - 1;
				for (int r = len; r >= 0; r--) {
					System.out.print(st[i].charAt(r));
				}

			} else if (i == 1) {
				String res = st[i].toLowerCase().replaceAll(" ", "");
				String sst = "";
				int count = 0;
				for (int d = 0; d < res.length(); d++) {
					for (int e = d + 1; e < res.length(); e++) {
						if (res.charAt(d) == res.charAt(e)) {
							sst = sst + res.charAt(d);
							count++;
							break;
						}
					}
				}
				System.out.println();
				System.out.println("Duplicates: " + sst);
				System.out.println("Count of Duplicates: " + count);

			} else {
				String[] sp = st[2].split(" ");
				String temp = sp[sp.length - 1];
				sp[sp.length - 1] = sp[0];
				sp[0] = temp;
				for (String sr : sp) {
					System.out.print(sr + " ");
				}
			}
		}
	}
}
