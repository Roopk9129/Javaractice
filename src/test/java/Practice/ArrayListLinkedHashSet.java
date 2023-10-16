package Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListLinkedHashSet {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(7);
		al.add(11);
		al.add(50);
		al.add(2);
		al.add(7);
		al.add(11);
		al.add(50);
		al.add(2);
		al.add(7);
		al.add(11);
		al.add(50);
		al.add(2);
		System.out.println(al);
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.addAll(al);
		
		System.out.println(tset);
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
	LinkedList<Object> li= new LinkedList<Object>();
	
//		set.addAll(al);
//		System.out.println(set);
	}

}
