package vectorInterface;

import java.util.Stack;

public class StackMethods {
	public static void main(String[] args) {
		// add,addAll,addElement,capacity,clear,clone,contains
		// containsAll,copyInto,elementat,elements,Empty
		// equals,firstelement,forEach,get,indexOf,insertElementAt
		// isEmpty,iterator,lastelement,lastindexof,listiterator
		// peek,pop,push,remove,removeAll,removeAllElements
		// removeElement,removeElementAt,replaceAll,retainAll
		// search,set,setElementAt,setSize,size,sort,sublist
		// toArray,toString
		Stack<Integer> s = new Stack<Integer>();
		// Push elements onto the stack
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s);
		System.out.println(s.search(2));
		System.out.println(s.peek());
		System.out.println(s.pop()); // 3
		System.out.println(s.pop()); // 2
		System.out.println(s.pop()); // 1
		// System.out.println(s.pop());//it gives Empty stack exception
		System.out.println(s.search(2));
		System.out.println(s.isEmpty());//checks if the stack is empty or not
	}
}
