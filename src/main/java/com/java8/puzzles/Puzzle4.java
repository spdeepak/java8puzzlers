package com.java8.puzzles;

import java.util.stream.Stream;

/**
 * @author Deepak
 *
 */
public class Puzzle4 {

    public static void main(String[] args) {
        System.out.println(Stream.of(-3, -2, -1, 0, 1, 2, 3)
                                 .max((i, j) -> Math.max(i, j))
                                 .get());
    }
}
