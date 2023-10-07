package Practice;

import java.util.TreeSet;

public class TreeSett {

	public static void main(String[] args) {
		TreeSet<Object> set = new TreeSet<Object>();
		set.add(40);
		set.add(10);
		set.add(5);
		set.add(50);
		System.out.println(set);
		System.out.println(set.descendingSet());
		
	}

}
