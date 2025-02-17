package linkedlistInterface;

import java.util.LinkedList;
import java.util.*;
public class LinkedlistIterator {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add("virat");
		li.add("msd");
		li.add(10);
		li.add("rohith");
		li.add("rahul");
		li.add("jadeja");
		Iterator x=li.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		System.out.println("----------------");
		ListIterator y=li.listIterator(2);//from specific index it return next values
		while(y.hasNext()) {
			System.out.println(y.next()+"-"+y.nextIndex());
		}
		System.out.println("----------------");
		while(y.hasPrevious()) {
			System.out.println(y.previous()+"-"+y.previousIndex());
		}
	}
}
