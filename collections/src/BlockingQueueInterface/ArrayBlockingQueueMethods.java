package BlockingQueueInterface;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueMethods {
	public static void main(String[] args) {
		// add,addAll,clear,contains,containsAll,drainTo,element,equals
		// forEach,isEmpty,iterator,offer,peek,poll,put,remainingCapacity
		// remove,removeAll,retainAll,size,spliterator,take,toArray
		ArrayBlockingQueue<String> bq = new ArrayBlockingQueue<String>(8);
		System.out.println(bq.remainingCapacity());
		bq.add("A");
		bq.add("C");
		bq.add("B");
		System.out.println(bq);
		System.out.println(bq.remainingCapacity());
		ArrayBlockingQueue<String> bq1 = new ArrayBlockingQueue<String>(8);
		bq1.add("X");
		bq1.add("Y");
		bq1.add("Z");
		System.out.println(bq1);
		bq.drainTo(bq1);// it removes elements from bq and inserts into bq1
		System.out.println(bq);
		System.out.println(bq1);
		System.out.println("------------------");
		try {
			bq.put("M");
			// Inserts the specified element at the tail of this queue, waitingfor space to
			// become available if the queue is full.
			bq.put("N");
			bq.put("O");
			System.out.println(bq);
			bq.take();
			// Retrieves and removes the head of this queue, waiting if necessary until an
			// element becomes available
			System.out.println(bq);// removes head of the queue
			bq.put("P");
			bq.put("Q");
			bq.put("R");
			System.out.println(bq);
			System.out.println(bq.poll());
			// Retrieves and removes the head of this queue,or returns null if this queue is
			// empty.
			System.out.println(bq);
			System.out.println(bq.peek());
			// Retrieves, but does not remove, the head of this queue,or returns null if
			// this queue is empty.
			bq.offer("I");// inserts element at the end of queue
			System.out.println(bq);
			System.out.println(bq.element());
			// returns head of the queue and throws exception if its empty
			System.out.println(bq.remove());
			// Retrieves and removes the head of this queue. This method differsfrom poll
			// only in that it throws an exception if thisqueue is empty.
			System.out.println(bq);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
