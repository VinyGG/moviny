package br.com.viny.moviny.main;

import java.util.Scanner;
public class Start {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        Repository repo = new Repository();
        do {
            System.out.println("1 - Adicionar Filme");
            System.out.println("2 - Apagar Filme");
            System.out.println("3 - Mostrar Filmes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma Opção: ");
            opc = scan.nextInt();

            switch (opc) {
                case 1: {
                    repo.addMovie();
                    break;
                }
                case 3: {
                    repo.showMovies();
                    break;
                }
                default: {
                    System.out.println("Opção Inválida!");
                }
            }
        } while (opc != 0);

    }

}
