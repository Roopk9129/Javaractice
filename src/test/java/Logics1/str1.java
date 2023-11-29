package Logics1;

public class str1 {

	public static void main(String[] args) {
		// !iH !I yh!w kick!
		String str = "!Hi !I wh!y kick!";
		String[] starr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String st : starr) {
			for (int i = st.length() - 1; i >= 0; i--) {
				if (st.charAt(i) != '!') {
					sb.append(st.charAt(i));
				}
				if (st.charAt(i) == '!') {
					sb.append(st.charAt(i));
				}
			}
		}
		System.out.println(sb);
	}
}
