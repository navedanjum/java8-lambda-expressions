package com.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ansari on 3/3/2019
 */
public class StreamSample {
    public static void main(String[] args) {

        //example of stream
        Arrays.asList("Violet","Indigo", "Blue","Green","Yellow","Orange","Red")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        //example of Stream.of
        Stream.of("apple","banana","mango","pears","apricot","orange")
                .filter(fruit -> {
                    return fruit.startsWith("a");
                })
                .forEach(fruit -> System.out.println("Fruits starts with letter a : " + fruit));

        //using a stream and map operation to create a list of words in caps
        List<String> collected  = Stream.of("Java","Rocks")
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(collected);
        System.out.println(collected.toString());

    }
}
