package BlockingQueueInterface;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeueMethods {
	public static void main(String[] args) {
		// add,addAll,addFirst,addLast,clear,contains
		// containsAll,descendingIterator,drainTo,element,equals
		// forEach,getFirst,getLast,isEmpty,iterator,offer
		// offerFirst,offerlast,peek,peekFirst,peekLast
		// poll,pollFirst,pollLast,pop,push,put,putFirst,putLast
		// remainingCapacity,remove,removeAll,removeFirst,removeFirstOccurrence
		// removeLast,removeLastoccurrence,retainAll,size,spliterator
		// take,takeFirst,takeLast,toArray
		LinkedBlockingDeque ld = new LinkedBlockingDeque();
		ld.add(1);
		ld.add(2);
		ld.add(3);

		System.out.println(ld);
		ld.addFirst(4);
		ld.addLast(5);
		System.out.println(ld);
		System.out.println(ld.getFirst());
		System.out.println(ld.getLast());
		ld.add(3);
		ld.add(10);
		ld.add(18);
		ld.offer(10);
		ld.offerFirst(11);
		ld.offerLast(15);
		System.out.println(ld);
		System.out.println(ld.peek());// retrieves element at head of queue
		System.out.println(ld.peekFirst());
		System.out.println(ld.peekLast());
		System.out.println("--------");
		System.out.println(ld.poll());
		System.out.println(ld.pollFirst());
		System.out.println(ld.pollLast());
		System.out.println("--------");
		System.out.println(ld.pop());
		ld.push(18);
		try {
			ld.put(26);
			ld.putFirst(22);
			ld.putLast(35);
			System.out.println(ld);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ld.remove();
		System.out.println(ld);
		ld.removeFirst();
		System.out.println(ld);
		ld.removeLast();
		System.out.println(ld);
		ld.removeFirstOccurrence(3);// remove frst element which comes first
		System.out.println(ld);
		ld.removeLastOccurrence(10);
		System.out.println(ld);
		System.out.println("----------");
		try {
			ld.take();
			System.out.println(ld);
			ld.takeFirst();
			// Retrieves and removes the first element of this deque, waitingif necessary
			// until an element becomes available.
			ld.takeLast();
			System.out.println(ld);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
