package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
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

		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for (Movie movie : list) {
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
		}
		System.out.println();

		System.out.println("Sorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
		System.out.println();

		System.out.println("Sorted by year");
		Collections.sort(list);
		for (Movie movie : list)
			System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName() + " ");
	}

}
