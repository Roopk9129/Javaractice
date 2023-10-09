package LogicsWithCollection;

import java.util.LinkedHashSet;

public class WordOccarnceWithString {
//need to work
	public static void main(String[] args) {
		String str = "I am I am from Bangalore";
		String[] split = str.split(" ");
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			lh.add(split[i]);
		}
		for (String st : split) {
			for (int i = 0; i < split.length; i++) {
				if (st.equals(split[i])) {
					System.out.println(st + " is repeting " + (i + 1) + " time");
					break;
				}
			}
		}
	}
}
