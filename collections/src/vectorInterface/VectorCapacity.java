package vectorInterface;

import java.util.Vector;

public class VectorCapacity {
	public static void main(String[] args) {
		Vector v = new Vector();// default capacity 10
		Vector v1 = new Vector(100);// intial capacity 100
		Vector v2 = new Vector(v);// collection
		Vector v3 = new Vector(20, 10);// intial capacity-20 and incremental capacity-10
	}
}
