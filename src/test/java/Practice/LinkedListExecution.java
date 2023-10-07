package Practice;

import java.util.LinkedList;

public class LinkedListExecution {

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(10);
		list.add(20);
		list.add("hi");
		list.add("hello");
		list.add(30);
		list.add(null);
		System.out.println(list);
		list.addFirst(list.getFirst());
		list.addLast(list.getLast());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
	
	
	}

}
