package Assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class FindOcceranceUsingSet {

	public static void main(String[] args) {
		String s = "TestYantra";
		String str = s.toLowerCase();

		ArrayList<Object> list = new ArrayList<Object>();
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();

		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			set.addAll(list);
			Object[] larr = list.toArray();
			Object[] sarr = set.toArray();
			if(larr[i+1]==sarr[i-1]) {
				count++;
			}
			

		}System.out.println(set+" "+count);
		System.out.println(list);

	}

}
