package com.lambda.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Ansari on 3/4/2019
 */
public class AggregateMap {

    public static void main(String[] args) {
        IntStream.range(1,10)
                .forEach(System.out::println);

        //find average of the numbers squared
        Arrays.stream(new int [] {1,3,5,7,9})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);

        //map doubles to ints
        Stream.of(3.2, 4.7, 8.1, 9.2)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);

    }
}
