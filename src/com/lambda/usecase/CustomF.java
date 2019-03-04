package com.lambda.usecase;

/**
 * @author Ansari on 3/3/2019
 */
public class CustomF {

    public static void main(String[] args) {

        ICalculate add = (a,b) -> a+b;
        System.out.println(add.calc(10,16));

        //Subtract smaller from larger number
        ICalculate diff = (a,b) -> (a>b ? a-b : b-a);
        System.out.println(diff.calc(89,80));
        System.out.println(diff.calc(10,20));

        ICalculate mul = (x,y) -> x*y;
        System.out.println(mul.calc(10,20));

        ICalculate div = (a,b) -> (b!=0 ? a/b : 0);
        System.out.println(div.calc(6,2));
        System.out.println(div.calc(10,0));

    }
}
