package Assignment;

import java.util.*;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		String str = "testyantra";
		Set<Object> set = new LinkedHashSet<Object>();

		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));

		}
		Object[] arr = set.toArray();
		for (Object object : arr) {
			System.out.println(object);
		}

	}

}
