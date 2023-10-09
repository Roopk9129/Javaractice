package StringProgrmas;

public class AssignmentReverse {

	public static void main(String[] args) {
		String s = "I am from Bangalore";
		// o/p: e ro lagn aBmorfamI
		//      1 2   4     9

		String[] as = s.split(" ");
		for (String ss : as) {
			char[] ch = ss.toCharArray();
			for (int j = ss.length() - 1; j >= 0; j--) {
				System.out.print(ch[j]);

			}

		}

	}

}
