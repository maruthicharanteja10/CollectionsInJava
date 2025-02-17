package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SortInDescendingAndAscendingOrder {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(80);
		hs.add(26);
		hs.add(53);
		hs.add(71);
		hs.add(8);
		hs.add(17);
		hs.add(44);
		hs.add(62);
		System.out.println(hs);
		//Method-1
		TreeSet<Integer> t1=new TreeSet<>(hs);
		System.out.println(t1);
		System.out.println(t1.descendingSet());
		System.out.println("------------------------");
		//method-2
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
		Collections.sort(a1,Collections.reverseOrder());
		System.out.println(a1);
	}
}
