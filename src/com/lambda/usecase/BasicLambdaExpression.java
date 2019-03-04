package com.lambda.usecase;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * @author Ansari on 3/2/2019
 */
public class BasicLambdaExpression {

    public static void main(String[] args) {
        /* Interface here can have at most 1 abstract method
        * 1. Predicate ==> Takes in one argument and returns a Boolean
        * 2. Consumer ==> Takes single argument and retuns no value
        * 3. Function ==> Takes one argument and produce a result
        *                 Changes one type to another
        * 4. Supplier ==> produces result of a given type
        * 5. UnaryOperator ==> takes 1 argument and return a value
        * 6. BinaryOperator ==> takes 2 argument and return one value
        * */


        //Predicate - use test method of Predicate
        Predicate<String> strLength = (s) -> s.length() < 10;
        System.out.println(strLength.test("NavedanjumAnsari"));
        System.out.println(strLength.test("Alpha"));

        //Consumer - use accept method of Consumer
        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("iiiiiiYUIM");

        //Function - use apply method of Function
        Function<Integer,String> num2str = (num) -> Integer.toString(num);
        System.out.println(num2str.apply(512));

        //Supplier - use get method of supplier
        Supplier<String> welcome = () -> "Welcome to the wonderland";
        System.out.println(welcome.get());

        //Binary operator - use apply method of BinaryOperator interface
        BinaryOperator<Integer> add = (a,b) -> a+b;
        System.out.println(add.apply(10,40));

        //UnaryOperator
        UnaryOperator<String> toLow = (s) -> s.toLowerCase();
        System.out.println(toLow.apply("mixCaSEleTTErs"));

    }
}
