package org.example;

import org.example.pg.PG176963;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PG176963 pg176963 = new PG176963();

        int[] result1 = pg176963.solution(
                new String[] {"may", "kein", "kain", "radi"},
                new int[] {5, 10, 1, 3},
                new String[][] {
                        {"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}
                }
        );

        int[] result2 = pg176963.solution(
                new String[] {"may", "kein", "kain", "radi"},
                new int[] {5, 10, 1, 3},
                new String[][] {
                        {"may"},
                        {"kein", "deny", "may"},
                        {"kon", "coni"}
                }
        );

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}