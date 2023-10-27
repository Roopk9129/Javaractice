package MyPractices;

public class FindOnlyUnique {

	public static void main(String[] args) {
		String str = "Hi How Hi How are Why you Why";
		String[] sp = str.split(" ");
		for (int i = 0; i < sp.length; i++) {
			for (int j = i + 1; j < sp.length; j++) {
				if (!sp[i].equals(sp[j])) {
					System.out.println(sp[i]);
					break;

				}

			}

		}
	}

}
