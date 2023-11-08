package LogicsWithCollection;

import java.util.LinkedHashSet;

public class OccuranceOfEachNoInArray {

	public static void main(String[] args) {
		int[] a = { 2, 3, 2, 5, 4, 5, 1 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer in : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (in == a[i]) {
					count++;
				}
			}
			System.out.println(in + " is repeating " + count + " time");
		}
	}
}
