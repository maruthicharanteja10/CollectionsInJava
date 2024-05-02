package equal_hashcode;

public class MainClass {
	 public static void main(String[] args) {
	      MainClass mainClass = new MainClass();
	      TestClass obj1 = new TestClass(1);
	      TestClass obj2 = new TestClass(1);
	      mainClass.test1(obj1, obj2);
	      TestClass obj3 = new TestClass(1);
	      TestClass obj4 = new TestClass(2);
	      mainClass.test2(obj3, obj4);
	   }
	   public void test1(TestClass obj1, TestClass obj2) {
	      if (obj1.equals(obj2)) {
	         System.out.println("Object One and Object Two are equal");
	      }
	      else {
	         System.out.println("Object One and Object Two are not equal");
	      }
	   }
	   public void test2(TestClass obj3, TestClass obj4) {
	      if (obj3.equals(obj4)) {
	         System.out.println("Object Three and Object Four are equal");
	      }
	      else {
	         System.out.println("Object Three and Object Four are not equal");
	      }
	   }
}
