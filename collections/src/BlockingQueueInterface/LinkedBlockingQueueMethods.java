package BlockingQueueInterface;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueMethods {
	public static void main(String[] args) {
		// add,addAll,clear,contains,containsAll,drainTo
		// equals,forEach,iterator,remainingcapcity
		// removeAll,retainAll,spliterator,take,toArray
		LinkedBlockingQueue lb = new LinkedBlockingQueue<>();
		lb.add(30);
		lb.add(20);
		lb.add(40);
		lb.add(50);
		System.out.println(lb);
		System.out.println(lb.remainingCapacity());
		System.out.println(lb.spliterator());
	}
}
