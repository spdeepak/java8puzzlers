package com.java8.puzzles;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Deepak
 *
 */
public class Puzzle7 {

    public static void main(String[] args) {
        List<String> kitties = Arrays.asList("Soft", null, "Purr");
        Comparator<String> kittiesComparator = Comparator.nullsLast(Comparator.naturalOrder());
        System.out.println(Collections.max(kitties, kittiesComparator));
        System.out.println(kitties.stream()
                                  .collect(Collectors.maxBy(kittiesComparator))
                                  .get());
        System.out.println(kitties.stream()
                                  .max(kittiesComparator)
                                  .get());
    }
}
