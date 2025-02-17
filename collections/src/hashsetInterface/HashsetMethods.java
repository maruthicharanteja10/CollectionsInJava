package hashsetInterface;

import java.util.*;

public class HashsetMethods {
	public static void main(String[] args) {
		// add,addAll,clear,clone,contains,containsAll
		// Equals,forEach,isEmpty,iterator,remove
		// removeAll,retainAll,size,toArray
		LinkedList li = new LinkedList();
		li.add("tej");
		li.add("charan");
		li.add(8);
		li.add(null);
		li.add(10);
		li.add(null);
		li.add("virat");
		li.add("tej");
		System.out.println(li);
		// It will store in the order of insertion
		// It will store duplicates
		// It will store null multiple times
		HashSet hs = new HashSet();
		hs.add("tej");
		hs.add("charan");
		hs.add(8);
		hs.add(null);
		hs.add(10);
		hs.add(null);
		hs.add("virat");
		hs.add("tej");
		System.out.println(hs);
		// It will not store in the order of insertion
		// It will not store duplicate
		// It will store null at once
	}
}
