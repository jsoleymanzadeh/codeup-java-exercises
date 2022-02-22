package movies;

public class Movie {
    private String name;
    private String category;

    public String getTitle() {
        return this.name;
    }

    public String getGenre() {
        return this.category;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
}