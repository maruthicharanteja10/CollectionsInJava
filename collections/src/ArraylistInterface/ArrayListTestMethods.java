package ArraylistInterface;

import java.util.ArrayList;

public class ArrayListTestMethods {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(50);
		System.out.println(a1);
		a1.clone(); // clone method
		System.out.println(a1);
		System.out.println(a1.contains(10));// checks specific element contains in an arraylist
		ArrayList a2 = new ArrayList();
		System.out.println(a2.containsAll(a1));
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(50);
		System.out.println(a2.containsAll(a1));// checks arraylist contains collection of another arraylist
		System.out.println(a1.size());// finds the size of an array
		System.out.println(a1.equals(a2));// checks the two arraylist are equal or not
		System.out.println(a1.hashCode());// Generates the hashcode of arraylist
		System.out.println(a1.get(3));// Get element at specific index
		System.out.println(a1.isEmpty());// checks the arraylist is empty or not
		System.out.println(a1.indexOf(20));// it checks element from start
		System.out.println(a1.lastIndexOf(20));// checks element from end
		a1.set(1, "java");
		System.out.println(a1);
		a2.add("java");
		System.out.println(a1.retainAll(a2));

	}
}
