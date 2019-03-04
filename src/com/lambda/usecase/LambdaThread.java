package com.lambda.usecase;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * @author Ansari on 3/3/2019
 */
public class LambdaThread {

    public static void main(String[] args) {
        // Anonymous Inner Class: Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run_1");
            }
        };

        // Lambda version of Runnable instance r2
        Runnable r2 = () -> System.out.println("Run_2");

        r1.run();
        r2.run();


        //Use of BiFunction interface from java.util.function
        BiFunction<Integer,Integer,String> concatInt =
                (num1, num2) -> Integer.toString(num1) + Integer.toString(num2);

        String concatStr = concatInt.apply(5,10);
        System.out.println(concatStr);
        System.out.println(concatInt.apply(100,200));


        //Use of Consumer functional interface
        Consumer<String> hello = (name) -> System.out.println("Hello, "+ name);

        List<String> nameList = Arrays.asList("Mike","Dan","Rick");
        for(String s: nameList){
            hello.accept(s);
        }

        //One argument function
        GreetingFunction greetings = (msg) -> System.out.println("Java Lambda " + msg);
        greetings.sayMessage("Execellent Course, Welcome!");

    }

}

//custom functional interface
@FunctionalInterface
interface GreetingFunction {
    void sayMessage(String message);
}
