// Capitolul 4, sarcina 14.9
//        (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
//        text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
//        characters as delimiters.

import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence;
        String[] tokens;

        // Introducere propozitie
        System.out.print("Enter sentence: ");
        sentence = input.nextLine();
        tokens = sentence.split(" ");

        // Afisare
        for (int i = tokens.length - 1; i >= 0; i--)
        {
            System.out.print(tokens[i] + " ");
        }
        System.out.println();
    } // end method main
} // end class ReverseWords
