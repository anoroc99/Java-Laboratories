// Capitolul 5, sarcina 5.11
//Write an application that finds the smallest of several integers.
//Assume that the first value read specifies the number of values to input from the user.

import java.util.Scanner;

public class SmallestValue {
    // main method begins execution of Java application
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count; // Number of integers entered by user
        int number; // The numbers input by user
        int smallest = 0; // The smallest value

        System.out.print("Enter how many values you are going to input: ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++)
        {
            System.out.print("Enter number: ");
            number = input.nextInt();

            if (i == 1)            // Sets the first number as default smallest number
                smallest = number;

            if (number < smallest)
                smallest = number;
        }

        System.out.printf("The smallest number is %d%n", smallest);

    } // end method main
} // end class SmallestValue