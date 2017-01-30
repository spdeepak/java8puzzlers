package com.java8.puzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Deepak
 *
 */
public class Puzzle2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Bread");
        list.add("Butter");
        list = list.subList(0, 2);
        Stream<String> stream = list.stream();
        list.add("Eggs");
        stream.forEach(System.out::println);
    }
}
