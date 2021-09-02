/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Glaspey
 */

import java.util.Scanner;

public class Solution02 {
    /*
     Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.
        's' = String representing user input
        print "input string: "
        'x' = s.length()
        print "'s' has 'x' characters"
     */

    public static void main(String[] args) {

        //declare variables
        Scanner in = new Scanner(System.in);
        String s;

        System.out.printf("What is the input string? ");
        s = in.nextLine();
        int x = s.length();
        System.out.printf("%s has %d characters",s,x);
    }
}
