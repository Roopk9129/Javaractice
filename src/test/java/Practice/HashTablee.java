package Practice;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Random;

public class HashTablee {

	public static void main(String[] args) {
		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		Random r = new  Random();
		int key = r.nextInt(1000);
		ht.put(key, "hi");
		int key1 = r.nextInt(1000);
		ht.put(key1, 30);
		int key2 = r.nextInt(1000);
		ht.put(key2, 30);
		int key3 = r.nextInt(1000);
		ht.put(key3, "hello");
		System.out.println(ht);
		//map.put(null,50); //not allowed
		//map.put(50,null); //not allowed
		for(Entry<Object, Object> m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
			
		}

	}

}
