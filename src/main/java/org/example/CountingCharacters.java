/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String word = input.next();
        String outputString = (word + " has " + word.length() + " characters.");

        System.out.println(outputString);

    }
}
