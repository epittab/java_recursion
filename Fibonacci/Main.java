package com.Recursion.Fibonacci;

import java.util.Scanner;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in); 
    private static int[] fibArray;

    public static void main(String[] args) {

        int digits = getNumber();
        printFib(digits);
        for (int i = 0; i < fibArray.length; i++) {
            System.out.println(fibArray[i]);
        }
    }

    public static int getNumber(){
        System.out.println("Please enter the number of fib digits to calculate: ");
        return scanner.nextInt();
    }

    public static int fib(int num){
        if (num == 1 || num == 2) {
            fibArray[num-1] = 1;
            return 1;
        } else {
            fibArray[num-1] = fib(num-1) + fib(num-2);
            return fibArray[num-1];
        }
    }

    public static void printFib(int digits){
        fibArray = new int[digits];
        fib(digits);
    }

}
