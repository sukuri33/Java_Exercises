package Day25_Assignments.MovieTask;

public class MovieObject {

    public static void main(String[] args) {


        Movie newMovie = new Movie("USA","Java Developer: Zero to Hero","04/18/2022","Kuzzat Altay");
        String[] casts = {"Ozzy","Ali","Intisar","Baha","Adilina"};
        newMovie.Genre = "Adventure, Comedy, Thriller";
        newMovie.addCasts(casts);
        System.out.println(newMovie);

    }


}


/*
2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2022
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
 */

