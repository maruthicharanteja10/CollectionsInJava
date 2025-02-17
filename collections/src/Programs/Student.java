package Programs;

import java.util.ArrayList;

public class Student {
	String name, qualification;
	int yop;
	double perc;

	public Student(String name, int yop, String qualification, double perc) {
		super();
		this.name = name;
		this.qualification = qualification;
		this.yop = yop;
		this.perc = perc;
	}

	@Override
	public String toString() {
		return "Student :name=" + name + ", qualification=" + qualification + ", yop=" + yop + ", perc=" + perc;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Teja", 2023, "Btech", 92);
		Student s2 = new Student("virat", 2011, "Btech", 98);
		Student s3 = new Student("MSD", 2003, "Mtech", 80);
		Student s4 = new Student("rohith", 2007, "Btech", 34);
		Student s5 = new Student("jadeja", 2023, "Mtech", 75);
		Student s6 = new Student("rinku", 2022, "Btech", 88);
		Student s7 = new Student("bishoni", 2023, "Btech", 69);
		Student s8 = new Student("rahul", 2023, "BCA", 82);
		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		a1.add(s6);
		a1.add(s7);
		a1.add(s8);
		for (Student st : a1) {
			System.out.println(st);
		}
		System.out.println("---Question1---");
		// Question-1
		for (Student st2 : a1) {
			String q = st2.qualification;
			if (q.equalsIgnoreCase("btech")) {
				System.out.println(st2);
			}
		}
		System.out.println("---Question2---");
		for (Student st3 : a1) {
			if (st3.yop == 2023) {
				System.out.println(st3);
			}
		}
		System.out.println("---Question3---");
		for (Student st4 : a1) {
			if (st4.yop >= 2022 && st4.qualification.equalsIgnoreCase("btech")) {
				System.out.println(st4);
			}
		}
	}
}
