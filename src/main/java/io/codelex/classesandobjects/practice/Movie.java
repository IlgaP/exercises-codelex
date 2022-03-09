package io.codelex.classesandobjects.practice;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String ratio) {
        this.title = title;
        this.studio = studio;
        this.rating = ratio;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public Movie[] getPG(Movie[] movie){
        Movie[] movies = new Movie[movie.length];

        int index = 0;
        for (int i = 0; i< movie.length;i++){
            if(movie[i].rating.equals("PG")){
                movies[index] = movie[i];
            }
        }
        return movie;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
