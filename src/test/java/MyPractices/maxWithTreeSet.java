package MyPractices;

import java.util.ArrayList;
import java.util.TreeSet;

public class maxWithTreeSet {

	public static void main(String[] args) {
		int a[] = { 1009, 6, 11, 12, 89, 9, 1000, 1000 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);

		}
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.addAll(list);
		System.out.println(set);

		System.out.println(set.first());
	}

}
