public class Main {
    public static Event validEvent(Event event) throws RuntimeException {
        if (event != null) {
            return event;
        }
        throw new RuntimeException("События не коректны");
    }

    public static Movie[] getMovies() {
        return new Movie[] {
                new Movie("Начало", 2010, 16),
                new Movie("Морской бой", 2012, 15),
                new Movie("Зелёная книга", 2018, 17)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[] {
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Гамлет", 1600, 18)
        };
    }

    public static void main(String[] args) throws RuntimeException {
        for(Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }
}