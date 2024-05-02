package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie> {

	private double rating;
	private String name;
	private int year;

	public Movie(String name, double rating, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

//using comparable
	@Override
	public int compareTo(Movie other) {

		return this.year - other.year;
	}

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("pushpa", 8.3, 2021));
		list.add(new Movie("KGF", 8.7, 2022));
		list.add(new Movie("Jailer", 8.8, 2023));
		list.add(new Movie("Bahubali", 8.4, 2019));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie movie : list) {
			System.out.println(movie.name + " " + movie.year + " " + movie.rating);
		}
	}
}
