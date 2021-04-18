public class Theatre extends Event{
    private String theatres;

    public Theatre(String title, int releaseYear, int age) {
        super(title, releaseYear, age);
    }

    public String getTheatres() {
        return theatres;
    }

    public void setTheatres(String theatres) {
        this.theatres = theatres;
    }
}
