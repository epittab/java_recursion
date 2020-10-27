package com.Recursion.ReverseString;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static String reverse;
    

    public static void main(String[] args) {

        System.out.println("Please input string to reverse: " + "\r");
        String word = scanner.nextLine();
        int index = word.length();
        reverse = reverseString(word, index);
        System.out.println(reverse);

    }
    
    public static String reverseString(String word, int index) {
        //base case
        if (index < 2) {
            return word.charAt(0) + "";
        }
        //recursive case
        return word.charAt(index-1) + reverseString(word, index-1);
    }

}
