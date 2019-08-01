package movies;

public class Movie{
    private String Name;
    private String Category;

    public Movie(String name, String category) {
        Name = name;
        Category = category;
    }

    public Movie(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getCategory() {
        return Category;
    }
}
