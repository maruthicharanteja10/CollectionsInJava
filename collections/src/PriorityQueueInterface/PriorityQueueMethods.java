package PriorityQueueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMethods {
	public static void main(String[] args) {
		// add,addAll,clear,comparator,contains,containsAll,element
		// equals,forEach,isEmpty,iterator,offer,peek,poll
		// remove,removeAll,size,toArray,retainAll
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(50);
		pq.add(18);
		pq.add(71);
		pq.add(6);
		pq.add(35);
		pq.add(10);// null values are accepted
		pq.add(13);
		// pq.add(null); null will not accept in the queue
		System.out.println(pq);
		System.out.println(pq.contains(18));
		System.out.println(pq.element());
		pq.offer(210);// inserts element in the queue
		System.out.println(pq);
		System.out.println(pq.peek());// retrieves the head of the queue
		pq.poll();// removes the head of the queue
		System.out.println(pq);
		// Iterator
		System.out.println("Iterator of pq elements");
		Iterator<Integer> x = pq.iterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}
	}
}
