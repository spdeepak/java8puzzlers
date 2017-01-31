package com.java8.puzzles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Deepak
 *
 */
public class Puzzle3 {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        List<String> sentence = Arrays.asList("Punish");

        //It's Callable and it matches the return type and the exception thrown by this is rethrown by callable interface
        //outside the method this line of code is executed
        ex.submit(() -> Files.write(Paths.get("sentence.txt"), sentence));

        //The bleow code does not execute as it throws a checked exception and it is not taken care of
        ex.submit(() ->
            {
                try {
                    Files.write(Paths.get("sentence.txt"), sentence);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
    }

}
