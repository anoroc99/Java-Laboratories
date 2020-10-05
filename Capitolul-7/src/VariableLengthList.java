// Capitolul 7, sarcina 7.14
//Write an application that calculates the product of a series
//of integers that are passed to method product using a variable-length argument list. Test your method
//with several calls, each with a different number of arguments.

public class VariableLengthList {
    public static void main(String[] args) {

        double num1 = 1.5;
        double num2 = 19.3;
        double num3 = 6.8;
        double num4 = 4.12;

        System.out.print("Num1 = 1.5\n"
                + "Num2 = 19.3\n"
                + "Num3 = 6.8\n"
                + "Num4 = 4.12\n");

        System.out.printf("Num1 * Num2 = %.2f%n", product(num1, num2));
        System.out.printf("Num1 * Num2 * Num3 = %.2f%n", product(num1, num2, num3));
        System.out.printf("Num1 * Num2 * Num4 = %.2f%n", product(num1, num2, num4));
        System.out.printf("Num1 * Num2 * Num4 = %.2f%n", product(num1, num2, num3, num4));
    } // end method main 

    // Calculates the product of a variable number of integers
    public static double product(double... numbers)
    {
        double product = 1;

        // Calculates the product of all numbers
        for (int i = 0; i < numbers.length; i++)
            product *= numbers[i];

        return product;
    } // end method product
} // end class VariableLengthList
