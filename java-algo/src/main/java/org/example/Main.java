package org.example;

import org.example.pg.PG159994;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PG159994 pg159994 = new PG159994();

        String result1 = pg159994.solution(
                new String[] {"i", "drink", "water"},
                new String[] {"want", "to"},
                new String[] {"i", "want", "to", "drink", "water"}
        );

        System.out.println(result1);

        String result2 = pg159994.solution(
                new String[] {"i", "water", "drink"},
                new String[] {"want", "to"},
                new String[] {"i", "want", "to", "drink", "water"}
        );

        System.out.println(result2);
    }
}