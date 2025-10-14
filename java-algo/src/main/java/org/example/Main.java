package org.example;

import org.example.pg.PG159994;
import org.example.pg.PG178871;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PG178871 pg178871 = new PG178871();

        String[] result1 = pg178871.solution(
                new String[] {"mumu", "soe", "poe", "kai", "mine"},
                new String[] {"kai", "kai", "mine", "mine"}
        );

        System.out.println(result1);
        System.out.println(Arrays.toString(result1));
    }
}