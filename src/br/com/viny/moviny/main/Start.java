package br.com.viny.moviny.main;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        Repository repo = new Repository();
        do {
            System.out.println();
            System.out.println("- Moviny v0.13 -");
            System.out.println("1 - ADICIONAR FILME");
            System.out.println("2 - APAGAR FILME");
            System.out.println("3 - MOSTRAR FILMES");
            System.out.println("0 - SAIR");
            System.out.print("> ");
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
                case 0: {
                    System.out.println("> PROGRAMA FINALIZADO!");
                    break;
                }

                case -1: {
                    repo.test1();
                    break;
                }
                case -2: {
                    repo.test2();
                    break;
                }
                default: {
                    System.out.println("> OPÇÃO INVÁLIDA!");
                }
            }
        } while (opc != 0);

    }

}
