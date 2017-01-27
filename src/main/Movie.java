package main;

public class Movie {

    private int id;
    private String name;
    private int year;
    private String category;
    private String director;
    private String[] starring = new String[2];
    private String synopsis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String categoryia) {
        this.category = categoryia;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getStarring() {
        return starring;
    }

    public void setStarring(String[] starring) {
        this.starring = starring;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }


}
