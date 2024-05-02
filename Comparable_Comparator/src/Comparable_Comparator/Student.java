package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

//comparable 
	@Override
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1, "teja", 20));
		students.add(new Student(2, "charan", 21));
		students.add(new Student(3, "maruthi", 22));
		students.add(new Student(3, "virat", 18));

		Collections.sort(students);

		for (Student student : students) {
			System.out.println(student.name + "-" + student.age);
		}
		System.out.println();

		// comparator

		Comparator<Student> ageComparator = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.age - s2.age;
			}
		};

		Collections.sort(students, ageComparator);

		for (Student student : students) {
			System.out.println(student.name + "-" + student.age);
		}

	}
}
