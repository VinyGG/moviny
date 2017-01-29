package br.com.viny.moviny.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Start {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int opc;
        Repository repo = new Repository();
        UI ui = new UI();

        do {
            JOptionPane.showInputDialog(ui.menu);
            opc = scan.nextInt();

            switch (opc) {
                case 1: {
                    repo.addMovie();
                    System.in.read();
                    break;
                }
                case 3: {
                    repo.showMovies();
                    System.in.read();
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
