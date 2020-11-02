package com.Recursion.Factorial;

import java.util.Scanner;

;public class Factorial {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Please input the digit to factorial: ");
        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }
}
