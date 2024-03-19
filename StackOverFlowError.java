// package com.company.dynamicProgramming;

import java.math.BigInteger;

public class StackOverFlowError {

    public static int factorial(int n){
        System.out.println("checking value of one"+n);
        //int value;
        if(n==1){
            return 1;

        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("System started>>>>>");
        //int result = StackOverFlowError.factorial(100);
        System.out.println("System ended>>>>>"+StackOverFlowError.factorial(50012));
    }

}