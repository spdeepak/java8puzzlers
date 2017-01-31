package com.java8.puzzles;

import java.util.Optional;

/**
 * @author Deepak
 *
 */
public class Puzzle8 {

    public static void main(String[] args) {
        class Dogcat implements Dog, Cat {
        }
        test(new Dogcat());
    }

    static void test(Object obj) {
        //Option A
        //        Dog& Catx = (Dog & Cat)obj;
        //        x.meow();
        //        x.bark();

        //Option B
        //        ((Consumer<? extends Dog & Cat>)(x-> {
        //            x.meow();
        //            x.bark();
        //            }
        //        )).accept((Dog& Cat)obj);

        //Option C
        Optional.of((Dog & Cat) obj)
                .ifPresent(x ->
                    {
                        x.meow();
                        x.bark();
                    });
    }

}

interface Cat {

    default void meow() {
        System.out.println("meow");
    }
}

interface Dog {

    default void bark() {
        System.out.println("bark");
    }
}