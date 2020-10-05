// Capitolul 4, sarcina 4.17
//Drivers are concerned with the mileage their automobiles get. One driver has
//kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//The program should calculate and display the miles per gallon obtained for each trip and print the
//combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//data from the user.

import java.util.Scanner;

public class GasMileage {
    // main method begins execution of Java application
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int miles; // Miles for each individual trip
        int gallon; // Gallons for each individual trip
        int totalmiles = 0; // Miles for all trips
        int totalgallon = 0; // Gallons for all trips

        System.out.print("Enter miles for trip or -1 to quit: ");
        miles = input.nextInt(); // Read first trip's miles

        while (miles != -1)
        {
            totalmiles += miles;  // add to total
            System.out.print("Enter gallons of gas used: ");
            gallon = input.nextInt(); // Read gallons
            totalgallon += gallon;

            System.out.printf("Miles driven for this trip: %d%n", miles);
            System.out.printf("Gallons used on this trip: %d%n", gallon);
            System.out.printf("Average milles per gallon on this trip: %f%n", (double)miles/gallon);
            System.out.printf("Average milles per gallon overall: %f%n", (double)totalmiles/totalgallon);

            System.out.print("Enter miles for next trip or -1 to quit: ");
            miles = input.nextInt();
        } // end while loop
    } // end method main
} // end class GasMileage