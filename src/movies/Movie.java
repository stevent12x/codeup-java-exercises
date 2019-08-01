package movies;

public class Movie{

    private String Name;
    private String Category;

    public Movie (String movieName) {
        Name = movieName;
        Category = "unassigned";
    }

    public Movie (String movieName, String movieCategory) {
        Name = movieName;
        Category = movieCategory;
    }

    public String getInfo() {
        return String.format("Title: %s \n Category: %s", Name, Category);
    }

}
