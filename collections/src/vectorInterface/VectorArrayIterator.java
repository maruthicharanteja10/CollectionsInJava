package vectorInterface;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorArrayIterator {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add("vector");
		v.add(50);
		v.add(20);
		// To Array
		v.toArray();
		System.out.println(v);
		// For Each method
		for (Object ve : v) {
			System.out.println(ve);
		}
		System.out.println("------------------");
		// Iterator
		Iterator x = v.iterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}
		System.out.println("-------------------");
		ListIterator y = v.listIterator();
		while (y.hasNext()) {
			System.out.println(y.next() + "-" + y.nextIndex());
		}
		System.out.println("-------------------");
		ListIterator z=v.listIterator();
		while(z.hasPrevious()) {
			System.out.println(z.previous());
		}
	}
}
