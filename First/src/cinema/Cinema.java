package cinema;

import java.util.Arrays;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        char[][] a = new char[7][8];
        fillCinema(a);
        printCinema(a);
    }
    static void printCinema(char[][] a) {
        System.out.println("Cinema:");
        System.out.print(" ");
        for (int i = 1; i < 9; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int i = 1; i <= 7; i++) {
            System.out.print(i);
            for (int j = 0; j < a[i-1].length; j++) {
                System.out.print(" " + a[i-1][j]);
            }
            System.out.println();
        }
    }
    static void fillCinema(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            Arrays.fill(a[i], 'S');
        }
    }
}