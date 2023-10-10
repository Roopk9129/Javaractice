package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		hs.add(40);
		hs.add("hi");
		hs.add("hello");
		hs.add(20);
		hs.add(40);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		ArrayList<Object> list = new ArrayList<Object>(hs);
		list.add(10);
		list.add(50);
		list.add("hi");
		list.add(null);
		list.add(null);
		System.out.println(list);
		Iterator<Object> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
