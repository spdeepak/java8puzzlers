package com.java8.puzzles;

import java.util.Optional;

/**
 * @author Deepak
 *
 */
public class Puzzle11 {

    public static void main(String[] args) {
        System.out.println(Optional.of("rtfm")
                                   .orElse(null));
        System.out.println(Optional.empty()
                                   .map(null)
                                   .orElse("rtfm"));
    }
}
