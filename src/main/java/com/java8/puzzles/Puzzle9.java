package com.java8.puzzles;

import java.util.function.Supplier;

/**
 * @author Deepak
 *
 */
public class Puzzle9 {

    static String str;

    public static void main(String[] args) {
        str = "hello";
        Supplier<String> s1 = str::toUpperCase;
        Supplier<String> s2 = () -> str.toUpperCase();
        str = "Hotel Echo Lima Lima oscar";
        //s1 is reference to an instance method
        //supplier is invoking the get method
        System.out.println(s1.get());
        //s2 is a closure i.e, a lambda it will be executed when it will be executed
        //supplier is given the contents of get method
        System.out.println(s2.get());
    }
}
