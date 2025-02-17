package TreesetInterface;

import java.util.TreeSet;

public class TreesetMethods {
	public static void main(String[] args) {
		// add,addAll,cieling,clear,comparator,contains,containsAll
		// descendingOrder,descendingSet,equals,first,floor,forEach
		// headset,higher,isEmpty,iterator,last,lower,pollfirst
		// pollLast,remove,removeAll,retainAll,size,subset,tailset
		// toArray,toString
		TreeSet t1 = new TreeSet();
		t1.add(55);
		t1.add(125);
		t1.add(18);
		t1.add(55);
		// t1.add(null); it gives null pointer exception
		t1.add(2);
		t1.add(40);
		t1.add(10);
		// t1.add("tej"); it gives class cast exception
		t1.add(285);
		System.out.println(t1);
		// It stores elements in sorted order[Ascending order]
		// duplicates are not allowed
		// null insertion is not possible
		// -----------------------------------------
		System.out.println(t1.ceiling(25));
		System.out.println(t1.ceiling(286));
		// it returns the least element which is greater than or equal
		// to the given number else it gives null
		System.out.println(t1.descendingSet());// order the data in descending order
		System.out.println(t1.first());// returns first element
		System.out.println(t1.last());// returns last element in the set
		System.out.println(t1.floor(20));
		// returns the greatest element less than or equal to given element
		System.out.println(t1.headSet(20));// returns elements less than that element
		System.out.println(t1.tailSet(20));// returns elements greater than that element
		System.out.println(t1.higher(20));// returns the highest element next
		System.out.println(t1.lower(20));// returns the lowest element last
		t1.pollFirst();// removes the first element
		System.out.println(t1);
		t1.pollLast();// removes the last element
		System.out.println(t1);
		System.out.println(t1.subSet(5, 45));// returns the subset of elements in the set
	}
}
