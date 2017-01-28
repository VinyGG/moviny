package br.com.viny.moviny.main;

import br.com.viny.moviny.main.Movie;
import java.util.ArrayList;
import java.util.Scanner;

public class Repository {

    Scanner scan = new Scanner(System.in);
    String nome;

    Movie movie = new Movie();
    String[] starring = new String[2];
    int id = 0;
    int idSearch;
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
        System.out.print("Nome: ");
        nome = scan.nextLine();
        System.out.println("NOME >"+nome);
        this.movie.setName(nome);
        System.out.print("Ano: ");
        this.movie.setYear(scan.nextInt());
        System.out.print("Categoria: ");
        this.movie.setCategory(scan.nextLine());
        System.out.print("Diretor: ");
        this.movie.setDirector(scan.nextLine());
        System.out.print("Estrelando: ");
        this.starring[0] = scan.nextLine();
        System.out.print("e: ");
        this.starring[1] = scan.nextLine();
        this.movie.setStarring(starring);
        System.out.print("Sinópse: ");
        this.movie.setSynopsis(scan.nextLine());
        movies.add(this.movie);
    }

    public void showMovies() {
        for (int i = 0; i < movies.size(); i++) {
            for (int j = 0; j < movies.size(); j++) {
                if (movies.get(j).getId() == i) {
                    idSearch = movies.indexOf(j);
                }
            }
            System.out.println("ID: " + movies.get(idSearch).getId());
            System.out.println("NOME: " + movies.get(idSearch).getName());
            System.out.println("ANO: " + movies.get(idSearch).getYear());
            System.out.println("CATEGORIA: " + movies.get(idSearch).getCategory());
            System.out.println("DIRETOR: " + movies.get(idSearch).getDirector());
            System.out.println("ESTRELANDO: " + movies.get(idSearch).getStarring()[0] + " e " + movies.get(idSearch).getStarring()[1]);
            System.out.println("SINÓPSE: " + movies.get(idSearch).getYear());
        }

    }

}
