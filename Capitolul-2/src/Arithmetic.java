// Capitolul 2, sarcina 2.15
// Write an application that asks the user to enter two integers,
// obtains them from the user and prints their sum, product,
// difference and quotient (division). Use the techniques shown in Fig. 2.7.

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) { // main method begins execution of Java application
        Scanner input = new Scanner(System.in);

        int x; // First number
        int y; // Second number
        int sum; // Suma
        int difference; //Diferenta
        int product; //Produsul
        int division; //Impartirea

        System.out.print("Enter first integer: ");  // Prompt
        x = input.nextInt(); // Read first number from the user

        System.out.print("Enter second integer: "); // Prompt
        y = input.nextInt(); // Read first number from the user

        sum = x + y;
        difference = x - y;
        product = x * y;
        division = x / y;

        System.out.printf("The sum is %d%n", sum); //Display Sum
        System.out.printf("The difference is %d%n", difference); //Display Difference
        System.out.printf("The product is %d%n", product); //Display Product
        System.out.printf("The quotient is %d%n", division); //Display Division
    } // end method main
} // end class Arithmetic
