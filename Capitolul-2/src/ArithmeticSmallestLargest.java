// Capitolul 2, sarcina 2.17
//Write an application that inputs three integers from the
//user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
// representation of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    //  main method begins execution of Java application
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x; // First number
        int y; // Second number
        int z; // Third number
        int sum; // Sum
        int product; // Product
        int average; // Average
        int smallest; // Smallest number
        int largest; // Largest number

        System.out.print("Enter first integer: "); // Prompt
        x = input.nextInt(); // Read first number from the user

        System.out.print("Enter second integer: "); // Prompt
        y = input.nextInt(); // Read second number from the user

        System.out.print("Enter third integer: "); // Prompt
        z = input.nextInt(); // // Read third number from the user

        sum = x + y + z; // Suma
        product = x * y * z; // Produsul
        average = sum / 3; // Media
        smallest = x; // Cel mai mic
        largest = x; // Cel mai mare

        if (y > largest)
            largest = y;
        if (z > largest)
            largest = z;

        if (y < smallest)
            smallest = y;
        if (z < smallest)
            smallest = z;

        System.out.printf("The sum is %d%n", sum);
        System.out.printf("The product is %d%n", product);
        System.out.printf("The average is %d%n", average);
        System.out.printf("The smallest integer is %d%n", smallest);
        System.out.printf("The largest integer is %d%n", largest);
    } // end method main
} // end class ArithmeticSmallestLargest
