package ArraylistInterface;

import java.util.ArrayList;

public class ArrayListRemoveMethods {
	public static void main(String[] args) {
		ArrayList rcb = new ArrayList();
		rcb.add("virat");// adds element at the end
		rcb.add("siraj");
		rcb.add("faf");
		rcb.add("maxwell");
		rcb.add("bracewell");
		ArrayList csk = new ArrayList();
		csk.add("Dhoni");
		csk.add("bravo");
		csk.add("conway");
		csk.add("jadeja");
		csk.add("rayudu");
		System.out.println(rcb);
		System.out.println(csk);
		ArrayList ipl = new ArrayList();
		ipl.addAll(csk);
		ipl.addAll(rcb);
		System.out.println(ipl);
		rcb.remove("bracewell"); // remove a specific value
		System.out.println(rcb);
		csk.remove(2);
		System.out.println(csk);// remove a value at specific index
		ipl.clear(); // it clears all the elements in ipl at a time
		System.out.println(ipl);
		ipl.addAll(csk);
		ipl.addAll(rcb);
		System.out.println(ipl);
		ipl.removeAll(csk);// remove all elements from csk from ipl
		System.out.println(ipl);
		ipl.addAll(rcb);
		System.out.println(ipl);
		ipl.removeAll(ipl);
		System.out.println(ipl);// Remove all both csk and rcb seperately
		
	}
}
