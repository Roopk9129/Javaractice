package Practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExcecution {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(20);
		al.add("hi");
		al.add("hello");
		al.add(30);
		al.add(null);
		System.out.println(al);
		List<Object> list = new ArrayList<Object>();
		list.add(40);
		list.add(50);
		list.add(10);
		list.add(5);
		System.out.println(list);
		list.addAll(al);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains("hello"));
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
