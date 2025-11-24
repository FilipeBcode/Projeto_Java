package br.wellcare.util;

public class IdGenerator {
    private static int counter = 1;

    public static int generate() {
        return counter++;
    }
}
