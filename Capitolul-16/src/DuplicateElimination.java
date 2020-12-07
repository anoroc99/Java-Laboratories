// Capitolul 16, sarcina 16.13
//        (Duplicate Elimination) Write a program that reads in a series of first names and eliminates
//        duplicates by storing them in a Set. Allow the user to search for a first name.


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public final class DuplicateElimination {
    public static void main(String[] args){
        final Scanner input = new Scanner(System.in);
        final Set<String> firstNames = new HashSet<>();
        System.out.print("Enter first names:\n ");
        String resp;
        while (!(resp = input.next()).equals("-")) {   //simbolul de oprire a buclei este "-"
            firstNames.add(resp);
            System.out.print("? ");
        }

        System.out.print("Enter name to search for:\n? ");
        System.out.printf("Name is %sin set.%n",
                firstNames.contains(input.next()) ? "" : "not ");
    }  //end// end method main
} //end class DuplicateElimination