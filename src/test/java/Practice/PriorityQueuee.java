package Practice;

import java.util.PriorityQueue;

public class PriorityQueuee {

	public static void main(String[] args) {
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.add(30);
		pq.add(60);
		pq.add(40);
		pq.add(50);
		pq.poll();
		System.out.println(pq);
	}

}
