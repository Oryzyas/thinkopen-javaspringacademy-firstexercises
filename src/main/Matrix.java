package main;

import java.util.Arrays;

/* Esercizio: instanzia una matrice e visualizzala. */

public class Matrix {

    public static void main(String[] args) {
        final int n = 10;
        final int m = 20;
        int[][] matrice = new int[n][m];

        // Inizializza la matrice
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                matrice[i][j] = (int) (Math.random() * 100);

            }
        }

        // Visualizza la matrice

        printLine();
        System.out.println();

        for(int i = 0; i < n; ++i) {
            System.out.format("| %2d |", matrice[i][0]);

            for(int j = 1; j < m; ++j){
                System.out.format(" %2d |", matrice[i][j]);
            }

            System.out.println();

            printLine();
            System.out.println();
        }
    }

    private static void printLine() {
        for(int t = 0; t < 101; ++t) {
            System.out.print('-');
        }
    }

}
