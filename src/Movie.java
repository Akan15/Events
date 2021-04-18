public class Movie extends Event{
    private String movies;

    public Movie(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }
}
