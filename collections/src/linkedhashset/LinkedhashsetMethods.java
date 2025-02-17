package linkedhashset;

import java.util.LinkedHashSet;

public class LinkedhashsetMethods {
	public static void main(String[] args) {
		// add,addAll,clear,clone,contains,containsAll,equals,foreach
		// hashcode,isEmpty,iterator,notify,notifyAll,remove,RemoveAll
		// retainAll,size,toArray
		LinkedHashSet h1 = new LinkedHashSet();
		h1.add("virat");
		h1.add("rahul");
		h1.add(null);
		h1.add("virat");
		h1.add("msd");
		h1.add(null);
		h1.add(null);
		h1.add("rohith");
		h1.add("raina");
		System.out.println(h1);
		// It will store the elements in order of insertion
		// No duplicates are allowed
		// It wont allow null more than once
	}
}
