package linkedlistInterface;

import java.util.LinkedList;

public class LinkedlistMethods {
	public static void main(String[] args) {
		// add,addAll,addFirst,addLast,clear,contains
		// containsAll,descendingIterator,Element,equal
		// foreach,get,getfirst,getlast,hashcode,indexof
		// isempty,iterator,lastindexof,listiterator,offer
		// offerlast,peek,peekfirst,peeklast,poll,poll last
		// pop,push,remove,removeAll,removefirst,removefirstoccurrence
		// removelast,removelastoccurrence,retailAll
		// set,size,toArray,tostring
		LinkedList li = new LinkedList();
		li.add("virat");
		li.add("msd");
		li.add(10);
		li.add("rohith");
		li.add("rahul");
		li.add("jadeja");
		System.out.println(li);
		li.addFirst(10);// stores at first
		li.addLast(60);// stores at last
		System.out.println(li);
		System.out.println(li.get(3));// get at specific index
		System.out.println(li.getFirst());// get first element
		System.out.println(li.getLast());// get last element
		System.out.println(li.lastIndexOf(10));// returns the index which returns last
		li.offer(40);
		System.out.println(li);// adds element at last
		li.offerFirst("tej");// adds element at first
		System.out.println(li);
		li.offerLast("charan");
		System.out.println(li);
		System.out.println(li.peek());// returns first element
		System.out.println(li.peekFirst());// returns the first element
		System.out.println(li.peekLast());// returns the last element
		li.poll();
		System.out.println(li);// removes first element
		li.pollFirst();
		System.out.println(li);//removes first element
		li.pollLast();
		System.out.println(li);//removes the last element
		li.pop();
		System.out.println(li);//removes top element
		li.push("kohli");
		System.out.println(li);
	}
}
