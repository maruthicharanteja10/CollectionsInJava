package ArraylistInterface;

import java.util.ArrayList;

public class ArrayListArrayMethods {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(20);
		a1.add(50);
		a1.add("sql");
		System.out.println(a1);
		a1.toArray();
		System.out.println(a1);
		a1.add("java");
		Object[] arr = a1.toArray();
		System.out.println(a1);
		
	}
}
