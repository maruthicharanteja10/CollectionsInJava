package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SortArraylist {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(80);
		a1.add(26);
		a1.add(53);
		a1.add(71);
		a1.add(8);
		a1.add(17);
		a1.add(44);
		a1.add(62);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println("--------------------------");
		// Using Treeset
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(80);
		a2.add(26);
		a2.add(53);
		a2.add(71);
		a2.add(8);
		a2.add(17);
		a2.add(44);
		a2.add(62);
		System.out.println(a2);
		TreeSet<Integer> t = new TreeSet<>(a1);
		System.out.println(t);
	}
}
