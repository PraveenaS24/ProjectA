package com.chainsys.ProjectA.beans;

public class Movie {
	public String title;
	public String director;

	public Movie(String filmtitle, String filmdirector) {
		title = filmtitle;
		director = filmdirector;
		System.out.println(title);
		System.out.println(director);

	}
}
