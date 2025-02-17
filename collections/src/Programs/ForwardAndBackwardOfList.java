package Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ForwardAndBackwardOfList {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("Virat");
		lhs.add("MSD");
		lhs.add("Rahul");
		lhs.add("Sachin");
		lhs.add("Rohith");
		lhs.add("Pant");
		lhs.add("Iyer");
		lhs.add("Jadeja");
		for (String hs : lhs) {
			System.out.println(hs);
		}
		System.out.println();
		System.out.println("---Method1---");
		ArrayList<String> a1 = new ArrayList<>(lhs);
		System.out.println("---Forward-Direction---");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("---BackwardDirection---");
		for (int i = a1.size() - 1; i >= 0; i--) {
			System.out.println(a1.get(i));
		}
		System.out.println();
		System.out.println("---Method2---");
		LinkedHashSet<String> lhs1 = new LinkedHashSet();
		lhs1.add("Virat");
		lhs1.add("MSD");
		lhs1.add("Rahul");
		lhs1.add("Sachin");
		lhs1.add("Rohith");
		lhs1.add("Pant");
		lhs1.add("Iyer");
		lhs1.add("Jadeja");
		for (String hs : lhs) {
			System.out.println(hs);
		}
		// Converting Collection to Array
		Object x[] = lhs.toArray();

		System.out.println("---Forward-Direction---");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("---BackwardDirection---");
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i]);
		}
	}
}
