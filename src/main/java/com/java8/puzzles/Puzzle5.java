package com.java8.puzzles;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Deepak
 *
 */
public class Puzzle5 {

    public static void main(String[] args) {
        Map<String, String> oldSchool = new HashMap<String, String>() {

            {
                put("buildTool", "maven");
                put("lang", "java");
                put("db", "db2");
            }
        };
        System.out.println(oldSchool);
        Map<String, String> proper = new HashMap<String, String>() {

            {
                put("buildTool", "npm");
                put("lang", "javascript");
                put("db", "elastic");
            }
        };
        System.out.println(proper);
        oldSchool.replaceAll(proper::put);
        System.out.println(oldSchool);
    }
}
