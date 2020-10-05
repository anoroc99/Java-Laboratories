// Capitolul 2, sarcina 2.26
//Write an application that reads two integers, determines whether the first is a
//multiple of the second and prints the result. [Hint: Use the remainder operator.]

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1; // First integer
        int num2; // Second integer

        System.out.print("Enter first integer: "); // Prompt
        num1 = input.nextInt(); // Read first integer
        System.out.print("Enter second integer: "); // Prompt
        num2 = input.nextInt(); // Read second integer

        if (num2 % num1 == 0) // If the first number is a multiple 
            System.out.println("The first integer is a multiple of the second");
        else  // If the first integer isn't a multiple
            System.out.println("The first integer is not a multiple of the second");
    } // end method main
} // end class Multiple