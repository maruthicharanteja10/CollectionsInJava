package Programs;

import java.util.ArrayList;

public class ForwardAndBackwardOfSet {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Virat");
		a1.add("MSD");
		a1.add("Rahul");
		a1.add("Sachin");
		a1.add("Rohith");
		a1.add("Pant");
		a1.add("Iyer");
		a1.add("Jadeja");
		System.out.println("---Forward-Direction---");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println();
		System.out.println("---BackwardDirection---");
		for(int i=a1.size()-1;i>=0;i--) {
			System.out.println(a1.get(i));
		}
	}
}
