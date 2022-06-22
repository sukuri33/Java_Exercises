package Day25_Assignments.MovieTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

 String country,title,Genre,releaseDate,director;
 ArrayList<String> casts;

 public Movie(String country, String title, String releaseDate, String director) {
  this.country = country;
  this.title = title;
  this.releaseDate = releaseDate;
  this.director = director;
  this.casts  = new ArrayList<>();
 }

 public void addCasts(String[] casts){
  this.casts.addAll(Arrays.asList(casts));
 }

 public void addCast(String cast){
  casts.add(cast);
 }


 public String toString() {
  return "Movie{" +
          "country='" + country + '\'' +
          ", title='" + title + '\'' +
          ", Genre='" + Genre + '\'' +
          ", releaseDate='" + releaseDate + '\'' +
          ", director='" + director + '\'' +
          ", total number of casts=" + casts.size() +
          '}';
 }
}


/*
Movie Task:
	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String), casts (ArrayList<String>)
		Add a constructor to set the country, title, release date, and director of the Movie
	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
 */

