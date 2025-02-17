package vectorInterface;

import java.util.Vector;

public class VectorAddMethods {
	public static void main(String[] args) {
		Vector v = new Vector();
		// add,addAll
		// clear,clone,contains and containsAll
		// get,HashCode,indexOf,isEmpty,equals,size,toArray
		v.add(10);
		v.add(20);
		v.add(30);
		v.add("vector");
		v.add(50);
		v.add(20);
		System.out.println(v);
		v.addElement(40); // add element at end
		System.out.println(v);
		System.out.println(v.firstElement());// returns first element
		System.out.println(v.lastElement());// returns last element
		System.out.println(v.elementAt(3));// returns element at specific index
		System.out.println(v.indexOf(30));// returns index of an element
		System.out.println(v.lastIndexOf(20));// it returns last index of an elements are more than one time
		v.insertElementAt(60, 2);// inserts elements as specific index
		System.out.println(v);
		System.out.println(v.elements());
		System.out.println(v.capacity());// tells the capacity of vector
		v.add(20);
		System.out.println(v);
		v.removeElementAt(5);
		System.out.println(v);// removes element at specific index
		v.setElementAt("java", 6);// returns a element at specific index
		System.out.println(v);
		v.setSize(15);// returns null if no element is stored in that location
		System.out.println(v);

	}
}
