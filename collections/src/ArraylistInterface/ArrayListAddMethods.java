package ArraylistInterface;

import java.util.*;

public class ArrayListAddMethods {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		// Add method
		a1.add(10);// adds element at the end
		a1.add(20);
		a1.add(30);
		System.out.println(a1);
		a1.add(1, 40);// it specifies to add at specific index
		System.out.println(a1); // homogenousdata
		a1.add("tej");
		a1.add("jos");
		System.out.println(a1);// heterogenousdata
		// AddAll method
		ArrayList a2 = new ArrayList();
		a2.add("india");
		a2.addAll(a1);//It appends collection of data at the end of the a2
		System.out.println(a2);
		ArrayList a3=new ArrayList();
		a3.add("bharath");
		a3.add("AndhraPradesh");
		a3.add("Banglore");
		System.out.println(a3);
		a3.addAll(1, a1);
		System.out.println(a3);// Adds the collection of data at specific index in the arraylist
		

	}
}
