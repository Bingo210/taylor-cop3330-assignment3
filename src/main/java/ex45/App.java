package ex45;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    // Main method
    public static void main(String[] args) throws IOException {

        // New file object to input a text file
        // Use your own input filepath
        File userFile = new File (
                "C:\\Users\\owent\\Desktop\\taylor-cop3330-assignment3\\exercise45_input.txt");
        Scanner sc = new Scanner(userFile);

        // New scanner object for user's output filename
        Scanner sc2 = new Scanner(System.in);

        // Asks user for output filename
        System.out.print("\nEnter the name of Output File: ");
        String outputFile = sc2.next();

        // Creates new FileWriter object to write to a text file
        // Use your own output filepath
        FileWriter writer = new FileWriter(
                "C:\\Users\\owent\\Desktop\\taylor-cop3330-assignment3\\" + outputFile);

        // Try block to handle exceptions
        try {

            // Loop iterates as long as scanner has another token in its input
            while(sc.hasNext()) {

                // Reads entire line, replaces utilize with use
                String words = sc.nextLine();
                words = words.replaceAll("utilize", "use");

                // Writes updated text to output file
                writer.write(words + "\n");
            }
        } finally {
            sc.close();
        }

        // Closes writer file
        writer.close();
    }
}