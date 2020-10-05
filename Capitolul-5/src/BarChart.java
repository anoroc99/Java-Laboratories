// Capitolul 5, sarcina 5.16
// One interesting application of computers is to display
//graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//number that’s read, your program should display the same number of adjacent asterisks. For example,
//if your program reads the number 7, it should display *******. Display the bars of asterisks after
//you read all five numbers.

import java.util.Scanner;

public class BarChart {
    // main method begins execution of Java application
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter five integers between 1 and 30 (space-separated),%n"
                + "Input a letter to end the program.%n");

        while(input.hasNextInt()) {  // Keeps iterating until a letter is output

            int number = input.nextInt();

            for(; number > 0; number--) {
                System.out.print("*");
            }

            System.out.println();
        }
    } // end method main
} // end class BarChart
