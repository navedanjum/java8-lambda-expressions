package com.lambda.usecase;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/**
 * @author Ansari on 3/3/2019
 */
public class LambdaMethod {

    public static void main(String[] args) {

        IntFunction<String> int2str = (num)-> Integer.toString(num);
        System.out.println("Intger changed to String: " + int2str.apply(10));

        //Static method toString referenced using :: lambda expression for methods
        IntFunction<String> int2string = Integer::toString;
        System.out.println("Integer 2 string " + int2str.apply(44));

        //Lamdas made using constructor
        Function<String, BigInteger> createBigInt = BigInteger::new;
        //equivalent of BigInteger b = new BigInteger("stringValue");

        //example of a lambda made from an instance method
        Consumer<String> print = System.out::println;
        print.accept("Example of using lambda syntax with instance method");

        //these two are the same using the static method concat
        UnaryOperator<String> greeting = x -> "Hello, ".concat(x);
        System.out.println(greeting.apply("World"));

        UnaryOperator<String> makeGreeting = "Hello, "::concat;
        System.out.println(makeGreeting.apply("Navedanjum"));

    }
}

