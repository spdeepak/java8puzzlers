package com.java8.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Deepak
 *
 */
public class Puzzle10 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Arnie", "Chuck", "Slay"));
        list.stream()
            .forEach(x ->
                {
                    System.out.println("List: " + x);
                    //The if statement is wrong never do x.equals("Chuck") do "Chuck".equals(x)
                    //It gives different answer when you use the above mentioned alternative
                    if (x.equals("Chuck")) {
                        System.out.println("Remove: " + x);
                        list.remove(x);
                    }
                });

        //NOTE: If you modify a collection while iteration you will get ConcurrentModificationException
        System.out.println(list);
    }
}
