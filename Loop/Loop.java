package com.Recursion.Loop;

import java.util.Scanner;

public class Loop {
    
    static private Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        //code
        System.out.println("Please enter count value: ");
        int count = scanner.nextInt();
        printEven(count);
    }

    public static void printEven(int count){

        if (count > 0) {
            if (count % 2 == 0 ) {
                System.out.println(count + " is even");
            }
            printEven(count - 1);
        }
    }


}
