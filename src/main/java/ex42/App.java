/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex42;

import java.io.*;

public class App {

    // Main method
    public static void main(String []args) {

        // Variable declaration
        int names = 0;
        String[] inputs = new String[0];

        // Try catch block to handle exceptions
        try {

            // BufferedReader object to input a text file
            // Replace with your own filepath
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\owent\\Desktop\\taylor-cop3330-assignment3\\exercise42_input.txt"));

            // Reads lines from input file and finds the number of names to parse
            while (br.readLine() != null) {
                names++;
            }

            // Second BufferedReader to re-read input file data
            BufferedReader br2 = new BufferedReader(
                    new FileReader("C:\\Users\\owent\\Desktop\\taylor-cop3330-assignment3\\exercise42_input.txt"));

            // Assigns a new string to inputs having length equal to number of names in input file
            inputs = new String[names];

            // Traverses input file, assigns each row to an element in the input string array
            for (int i = 0; i < names; i++) {
                inputs[i] = br2.readLine();
            }

            // Closes BufferedReader
            br.close();
        } catch (Exception ignored) {
        }

        // Prints title of table
        System.out.println("\nLast\t\t\t\tFirst\t\t\t\tSalary");
        System.out.println("-----------------------------------------------");

        // Replaces all commas in string array with tabs
        for (String input : inputs) {
            System.out.println(input.replaceAll(",", "\t\t\t\t"));
        }
    }
}