package ArraylistInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListOfIteratorAndListIterator {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(50);
		for (Object o : a1) {
			System.out.println(o);
		}
		System.out.println("--------------------");
		Iterator x = a1.iterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}
		System.out.println("---------------------");
		ListIterator li=a1.listIterator(a1.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
