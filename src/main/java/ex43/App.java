/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex43;

import java.util.Scanner;
import java.io.*;

public class App {

    // Main method
    public static void main (String []args) {

        // Variable declaration
        Scanner sc = new Scanner(System.in);
        String currentPath, author, siteName;
        char js, css;

        // Prompts user for site name
        System.out.print("Site name: ");
        siteName = sc.nextLine();

        // Prompts user for author name
        System.out.print("Author: ");
        author = sc.nextLine();

        // Asks user if they want JavaScript folder or not
        System.out.print("Do you want a folder for JavaScript? ");
        js = sc.next().charAt(0);

        // Asks user if they want CSS folder or not
        System.out.print("Do you want a folder for CSS? ");
        css = sc.next().charAt(0);

        // Gets the current directory to make website folder
        currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;

        // Creates file object with the current path
        File userWebsite = new File(currentPath);

        // Creates the directory/folder for entered website
        boolean websiteCreated = userWebsite.mkdir();

        // Creates website folder with sub folders and files
        if(websiteCreated == true) {
            System.out.println("Created " + currentPath);

            // Try catch block to handle exceptions
            try {

                // Creates FileWriter object to write to index.html file
                FileWriter skeletonWriter = new FileWriter(new File(currentPath+"\\index.html"));

                // Writes data to the file
                skeletonWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeletonWriter.write("\t<meta author=\""+author+"\">\n");
                skeletonWriter.write("\t<title>"+siteName+"</title>\n");
                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");

                // Shows message upon successful creation
                System.out.println("Created " + currentPath+"\\index.html");

                // Check if the user wants a JavaScript folder
                if (js == 'Y' || js == 'y') {

                    // Creates js folder
                    File jsFolder = new File(currentPath+"\\js");
                    boolean jsCreated = jsFolder.mkdir();

                    // Shows success message if js folder is created, failure message otherwise
                    if(jsCreated == true) {
                        System.out.println("Created " + jsFolder+"\\");
                    }
                    else {
                        System.out.println("JavaScript folder not created.");
                    }
                }

                // Check if the user wants a CSS folder
                if (css == 'y' || css == 'Y') {

                    // Creates CSS folder
                    File cssFolder = new File(currentPath+"\\css");
                    boolean cssCreated = cssFolder.mkdir();

                    // Shows success message if CSS folder is created, failure message otherwise
                    if(cssCreated) {
                        System.out.println("Created " + cssFolder+"\\");
                    }
                    else {
                        System.out.println("CSS folder not created.");
                    }

                }

            } catch(IOException e) {
                System.out.println("index.html not created.");
            }

        }

        // Failure message if website is not created
        else {
            System.out.println("Website folder not created.");
        }
    }
}