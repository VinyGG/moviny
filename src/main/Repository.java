package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Repository {

    Scanner scan = new Scanner(System.in);

    Movie movie = new Movie();
    String[] starring = new String[2];
    int id = 0;
    private ArrayList<Movie> movies = new ArrayList<Movie>();

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void addMovie() {
        this.movie.setId(this.id + 1);
        this.id = this.id + 1;
        System.out.println("Nome: ");
        this.movie.setName(scan.next());
        System.out.println("Ano: ");
        this.movie.setYear(scan.nextInt());
        System.out.println("Categoria: ");
        this.movie.setCategory(scan.next());
        System.out.println("Diretor: ");
        this.movie.setDirector(scan.next());
        System.out.println("Estrelando: ");
        this.starring[0] = scan.nextLine();
        System.out.println("e: ");
        this.starring[1] = scan.nextLine();
        this.movie.setStarring(starring);
        System.out.println("Sinópse: ");
        this.movie.setSynopsis(scan.next());
    }

    public void showMovies() {

    }

}
