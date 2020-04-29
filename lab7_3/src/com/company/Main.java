package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n=3;
        int m=2;
        System.out.println(factorial(n)/(factorial(m)*factorial(n-m)));
    }
    private static int factorial(int n) {
        if (n <= 1)
            return 1;
         else
            return n * factorial(n-1);
    }
}