// Capitolul 2, sarcina 2.16
// Write an application that asks the user to enter two integers, obtains
// them from the user and displays the larger number followed by the words "is larger". If the numbers
// are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        //  main method begins execution of Java application
        Scanner input = new Scanner(System.in);

        int x; // First Number
        int y; // Second Number

        System.out.print("Enter first integer: "); // Prompt
        x = input.nextInt(); // Read first number from the user

        System.out.print("Enter second integer: "); // Prompt
        y = input.nextInt(); // Read second
        // number from the user

        if (x > y)                                // If the first
            System.out.printf("%d is larger%n", x);

        if (x < y)                                // If the second
            System.out.printf("%d is larger%n", y);

        if (x == y)
            System.out.println("These numbers are equal%n");
    } // end method main
} // end class ComparingIntegers