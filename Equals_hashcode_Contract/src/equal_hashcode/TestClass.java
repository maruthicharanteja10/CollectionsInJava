package equal_hashcode;

public class TestClass {
	private int val;

	TestClass(int val) {
		this.val = val;
	}

	public int getValue() {
		return val;
	}

	@Override
	public boolean equals(Object o) {
		// null check
		if (o == null) {
			return false;
		}
		// this instance check
		if (this == o) {
			return true;
		}
		// instanceof Check and actual value check
		if ((o instanceof TestClass) && (((TestClass) o).getValue() == this.val)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int result = 0;
		result = (int) (val / 11);
		return result;
	}
}
