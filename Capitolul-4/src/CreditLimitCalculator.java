// Capitolul 4, sarcina 4.18
//Develop a Java application that determines whether any of several
//department-store customers has exceeded the credit limit on a charge account. For each customer,
//the following facts are available:
    //a) account number
    //b) balance at the beginning of the month
    //c) total of all items charged by the customer this month
    //d) total of all credits applied to the customer’s account this month
    //e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning balance
//+ charges – credits), display the new balance and determine whether the new balance exceeds the
//customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//the message "Credit limit exceeded".

import java.util.Scanner;

public class CreditLimitCalculator {
    // main method begins execution of Java application
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int account; // Account number
        int beginBalance; // Balance at the beginning of the month
        int charges; // Total of all items charged by the customer this month
        int credits; // Total of all credits applied to the customer’s account this month
        int creditLimit; // Allowed credit limit
        int newBalance; // New Balance after all calculations

        System.out.print("Enter account number or -1 to quit: ");
        account = input.nextInt();

        while (account != -1)  //The account number can't be negative
        {
            System.out.print("Enter beginning monthly balance: ");
            beginBalance = input.nextInt();
            System.out.print("Enter all charges: ");
            charges = input.nextInt();
            System.out.print("Enter credits applied this month: ");
            credits = input.nextInt();
            System.out.print("Enter credit limit: ");
            creditLimit = input.nextInt();

            newBalance = beginBalance + charges - credits; // Calculate new balance

            System.out.printf("%nAccount number: %d%n", account);
            System.out.printf("Beginning Balance: %d%n", beginBalance);
            System.out.printf("Charges: %d%n", charges);
            System.out.printf("Credits: %d%n", credits);
            System.out.printf("Credit Limit: %d%n", creditLimit);
            System.out.printf("Final Balance: %d%n", newBalance);


            if (newBalance > creditLimit) // output based on newBalance
            {
                System.out.println("Credit limit exceeded");
            }
            else
            {
                System.out.println("You are within your credit limit.");
            }

            System.out.print("Enter next account number or -1 to quit: ");
            account = input.nextInt();
        }
    } // end method main
} // end class CreditLimitCalculator
