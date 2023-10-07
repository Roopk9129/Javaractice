package Practice;

import java.util.LinkedHashSet;

public class LinkedHashSett {

	public static void main(String[] args) {
		LinkedHashSet<Object> LHS = new LinkedHashSet<Object>();
		LHS.add(40);
		LHS.add("hi");
		LHS.add("hello");
		LHS.add(20);
		LHS.add(40);
		System.out.println(LHS);
	}

}
