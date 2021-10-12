package ex46;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    int badger = 0, mushroom = 0, snake = 0;

    // Main method
    public void main(String[] args) throws IOException {

        // New file object to input a text file
        // Use your own input filepath
        File userFile = new File(
                "C:\\Users\\owent\\Desktop\\taylor-cop3330-assignment3\\exercise46_input.txt");
        Scanner sc = new Scanner(userFile);

        // Try catch block to handle exceptions
        try {

            // Traverses input file, counts number of times each word is found
            while (sc.hasNext()) {
                String word = sc.nextLine();

                switch (word.toLowerCase()) {
                    case "badger":
                        badger++;
                        break;
                    case "mushroom":
                        mushroom++;
                        break;
                    case "snake":
                        snake++;
                        break;
                }
            }
        } catch (Exception ignored) {
        }

        // Loops through number of times each word was found
        // Prints asterisk by name for each time the word was found
        System.out.println("badger: ");
        for (int i = 0; i < badger; i++) {
            System.out.println("*");
        }

        System.out.println("mushroom: ");
        for (int i = 0; i < mushroom; i++) {
            System.out.println("*");
        }

        System.out.println("snake: ");
        for (int i = 0; i < snake; i++) {
            System.out.println("*");
        }
    }
}