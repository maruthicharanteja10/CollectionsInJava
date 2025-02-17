package TreesetInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class IterarorAndDescendingIterator {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(55);
		t1.add(125);
		t1.add(18);
		t1.add(55);
		t1.add(2);
		t1.add(40);
		t1.add(10);
		t1.add(285);
		System.out.println(t1);
		Iterator x = t1.iterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}
		System.out.println("--------------");
		Iterator y = t1.descendingIterator();
		while (y.hasNext()) {
			System.out.println(y.next());
		}
	}
}
