package com.java8.puzzles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Deepak
 *
 */
public class Puzzle1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Bread");
        list.add("Butter");
        Stream<String> stream = list.stream();
        list.add("Eggs");
        //Due to late binding i.e., Streams are lazy. So, eggs will be displayed
        stream.forEach(System.out::println);
    }
}
