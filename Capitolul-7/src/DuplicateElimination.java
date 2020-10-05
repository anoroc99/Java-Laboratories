// Capitolul 7, sarcina 7.12
//Use a one-dimensional array to solve the following problem:
//Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
//is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
//in which all five numbers are different. Use the smallest possible array to solve this problem. Display
//the complete set of unique values input after the user enters each new value.

import java.util.Scanner;

public class DuplicateElimination {
    // main method begins execution of Java application
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] num = new int[5]; // The array with 5 elements
        int unique = 0; // Unique numbers entered by user
        int Number;


        while (unique < num.length)
        {
            boolean duplicate = false;

            System.out.print("Enter number: ");
            Number = input.nextInt();


            while (Number < 10 || Number > 100)  // Check if the number is in interval
            {
                System.out.print("Invalid number.  Enter number between 10 and 100: ");
                Number = input.nextInt(0);
            }


            for (int i = 0; i < num.length; i++) // Checks duplicate
            {
                if (Number == num[i])
                {
                    System.out.print("Number has already been entered. \n");
                    duplicate = true;
                }

            }

            if (!duplicate)
            {
                num[unique] = Number;
                unique++;
            }

            // Displays the array
            for (int i = 0; i < unique; i++)
            {
                System.out.printf("%d ", num[i]);
            }
            System.out.println();

        }
    } // end method main
} // end class DuplicateElimination
