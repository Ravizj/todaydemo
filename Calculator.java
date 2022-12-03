package com.bridgelabz.basics;

public class Calculator {
//ravi kumar
//ravi kumar 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


    static void sum(int num1,int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static int multiply(int num1,int num2){
        int product = num1*num2;
        return product;
    }

    public static void main(String[] args) {
        sum(3,7);
        int result = multiply(4,8);
        System.out.println(result);

    }
}
