package main;

/* Esercizio: calcolare il fattoriale utilizzando la ricorsione. */
public class Fattoriale {

    public static void main(String[] args) {
        final int num = (int) (Math.random() * 11);

        System.out.println(num + "! = " + fattoriale(num));
    }

    private static int fattoriale(int num) {
        if(num > 1) {
            return num * fattoriale(num - 1);
        } else {
            return 1;
        }
    }
}
