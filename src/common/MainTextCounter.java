package common;

import java.util.Scanner;

public class MainTextCounter {

    public static void main(String[] args) {

        // Create a TextCounter object
        TextCounter counter = new TextCounter();

        // Create a scanner to read the input
        Scanner scan = new Scanner(System.in);


        // Read lines until the user writes "stop"
        while (counter.isRunning()) {
            counter.count(scan.nextLine());

        }
//Get the number of characters and lines
        int letters = counter.getLetters();
        int rows = counter.getRows();

        // Display the results
        System.out.println("Characters:" + letters);
        System.out.println("Lines:" + rows);

        // Close the Scanner
        scan.close();
    }
}
