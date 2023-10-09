package LogicsWithCollection;

import java.util.HashSet;

public class RemoveDuplicatesFromString {
// need to work
	public static void main(String[] args) {
		String st = "Tester";
		String su = st.toUpperCase();
		char[] ch = su.toCharArray();
		HashSet<Character> hs = new  HashSet<Character>();
		for(int i=0; i<st.length();i++) {
			for(char chh:ch) {
				hs.add(chh);
				
			}
			
		}System.out.println(hs);
	}

}
