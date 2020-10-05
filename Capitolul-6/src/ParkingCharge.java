// Capitolul 6, sarcina 6.8
//A parking garage charges a $2.00 minimum fee to park for up to three
//hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//for each customer who parked in the garage yesterday. You should enter the hours parked for each
//customer. The program should display the charge for the current customer and should calculate and
//display the running total of yesterday’s receipts. It should use the method calculateCharges to determine
//the charge for each customer.

import java.util.Scanner;

public class ParkingCharge {
    // main method begins execution of Java application
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double hours = 0; // Number of hours car was in the garage
        double charge; // Total charge for each customer during the day

        System.out.print("Enter hours parked in garage or -1 to quit: ");
        hours = input.nextDouble();

        while (hours != -1) // Allows multiple uses of program
        {


            charge = calculateCharges(hours);

            System.out.printf("Total charge: $%.2f%n%n", charge);

            System.out.print("Enter hours parked in garage or -1 to quit: ");
            hours = input.nextDouble();

        }
    } // end method main

    // calculate the charge of the parking garage
    public static double calculateCharges(double hours)
    {
        double charge = 0;
        if (hours <= 3) // if the charge is the default minimum fee
            charge = 2.00;
        else  // formula
            charge = 0.50 * (Math.ceil(hours) - 3) + 2;

        if (charge > 10)  // charge cannot exceed $10.00
            charge = 10.00;

        return charge;
    } // end method calculateCharges
} // end class ParkingCharge