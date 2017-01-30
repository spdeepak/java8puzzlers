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
        ex.submit(() -> Files.write(Paths.get("sentence.txt"), sentence));
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
