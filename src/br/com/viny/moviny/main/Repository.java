package br.com.viny.moviny.main;


import br.com.viny.moviny.main.Movie;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Repository {

    Scanner scan = new Scanner(System.in);
    String nome;

    Movie movie;
    String[] starring = new String[2];
    int id = 0;
    int idSearch;
    ArrayList<Movie> movies = new ArrayList<Movie>();

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void addMovie() {
        movie = new Movie();
        this.movie.setId(this.id + 1);
        this.id = this.id + 1;
        this.movie.setName(JOptionPane.showInputDialog("Nome"));
        this.movie.setYear(Integer.parseInt(JOptionPane.showInputDialog("Ano")));
        this.movie.setCategory(JOptionPane.showInputDialog("Categoria"));
        this.movie.setDirector(JOptionPane.showInputDialog("Diretor"));
        this.starring[0] = JOptionPane.showInputDialog("Estrelando");
        this.starring[1] = JOptionPane.showInputDialog("e");
        this.movie.setStarring(starring);
        this.movie.setSynopsis(JOptionPane.showInputDialog("Sinópse"));
        movies.add(this.movie);

        System.out.println("> FILME ADICIONADO COM SUCESSO!");
    }

    public void showMovies() {
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(" --- FICHA TÉCNICA ---");
            System.out.println("| ID: " + movies.get(i).getId());
            System.out.println("| NOME: " + movies.get(i).getName());
            System.out.println("| ANO: " + movies.get(i).getYear());
            System.out.println("| CATEGORIA: " + movies.get(i).getCategory());
            System.out.println("| DIRETOR: " + movies.get(i).getDirector());
            System.out.println("| ESTRELANDO: " + movies.get(i).getStarring()[0] + " e " + movies.get(i).getStarring()[1]);
            System.out.println("| SINÓPSE: " + movies.get(i).getSynopsis());
            System.out.println(" ---------------------");
            System.out.println();
        }
    }

    public void test1() {
        System.out.println(movies);
        System.out.println(movies.size());
    }
    public void test2() {
    }

}
