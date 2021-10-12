/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex41;

import java.io.*;
import java.util.Arrays;

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
                    new FileReader("C:\\Users\\owent\\Desktop\\taylor-cop3330-assignment3\\exercise41_input.txt"));

            // Reads lines from input file and finds the number of names to parse
            while (br.readLine() != null) {
                names++;
            }

            // Second BufferedReader to re-read input file data
            BufferedReader br2 = new BufferedReader(
                    new FileReader("C:\\Users\\owent\\Desktop\\taylor-cop3330-assignment3\\exercise41_input.txt"));

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

        // Method to sort input array alphabetically
        Arrays.sort(inputs);

        // Second try catch block for exception handling
        try {

            // BufferedWriter object to output to a text file
            // Replace with your own filepath
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\owent\\Desktop\\taylor-cop3330-assignment3\\exercise41_output.txt"));

            // Writes top of list to output file
            bw.write("Total of " + names + " names\n");
            bw.write("-----------------\n");

            // Traverses input array, writes now sorted names in array to output file
            for (int i = 0; i < names; i++) {
                bw.write(inputs[i] + "\n");
            }

            // Closes BufferedWriter
            bw.close();
        } catch (Exception ignored) {
        }
    }
}