package BlockingQueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeueMethods {
	public static void main(String[] args) {
		// add,addAll,addFirst,addlast,clear,contains,containsAll
		// descendingOrder,element,equals,forEach,getFirst,getLast,iterator
		// offer,offerFirst,offerlast,peek,peekFirst,peekLast,poll
		// pollFirst,pollLast,pop,push,remove,removeAll,removeFirst
		// removeFirstOccurrence,removeLast,removeLastOccurrence,size,toArray
		Deque d = new ArrayDeque();
		d.add(2);
		d.add(6);
		d.add(8);
		System.out.println(d);
		d.addFirst(3);
		d.addLast(9);
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		System.out.println("--------");
		d.offer(4);
		d.offerFirst(20);
		d.offerLast(3);
		System.out.println(d);
		System.out.println(d.peek());
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		System.out.println("--------");
		d.push(30);
		System.out.println(d);
		d.pop();
		System.out.println(d);
		System.out.println(d.poll());
		System.out.println(d.pollFirst());
		System.out.println(d.pollLast());
		System.out.println(d);
		System.out.println("--------");
		d.remove();
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
		d.add(10);
		d.add(24);
		d.add(4);
		System.out.println(d);
		System.out.println("-----------------");
		Iterator x=d.descendingIterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
	}
}
