package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
	String name, company;
	int salary;

	public Employee(String name, String company, int salary) {
		this.name = name;
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee :name=" + name + ", company=" + company + ", salary=" + salary ;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Virat", "Amazon", 100000);
		Employee e2 = new Employee("Charan", "TCS", 30000);
		Employee e3 = new Employee("Teja", "Flipkart", 90000);
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		// Using For loop
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("--------------------------");
		// Using For-Each loop
		for (Employee e : a1) {
			System.out.println(e);
		}
		System.out.println("--------------------------");
		// Using Iterator
		Iterator x = a1.listIterator();
		while (x.hasNext()) {
			System.out.println(x.next());
		}

	}
}
