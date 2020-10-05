// Capitolul 2, sarcina 2.25
//Write an application that reads an integer and determines and prints whether
//it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple
//of 2 leaves a remainder of 0 when divided by 2.]

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x; // Integer inputted by user

        System.out.print("Enter integer: "); // Prompt
        x = input.nextInt(); // Read integer

        if (x % 2 == 0) // If the integer is even
            System.out.println("The integer is even.");

        if (x % 2 == 1) // If the integer is odd
            System.out.println("The integer is odd.");
    } // end method main
} // end class OddEven