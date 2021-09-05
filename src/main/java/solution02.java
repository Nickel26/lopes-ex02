import java.util.Scanner;

public class solution02 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution
     *  Copyright 2021 Nicholas Lopes
     */
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        //Prompt user for input string
        //Store input with string
        //Print input with input length
        System.out.print("What is the input string?");

        String input = in.nextLine();
        System.out.printf("%s has %d characters.", input, input.length());
    }
}
