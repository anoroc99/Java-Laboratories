// Capitolul 4, sarcina 14.7
//        (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
//        Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
//        simplicity, use the following algorithm:
//        To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
//        with String method split. To translate each English word into a pig Latin word, place the first
//        letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
//        becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputer�
//        cay.” Blanks between words remain as blanks. Assume the following: The English phrase consists of
//        words separated by blanks, there are no punctuation marks and all words have two or more letters.
//        Method printLatinWord should display each word. Each token is passed to method printLatin�
//        Word to print the pig Latin word. Enable the user to input the sentence. Keep a running display of
//        all the converted sentences in a text area.

import java.util.Scanner;
import java.util.StringTokenizer;

public class PigLatin {

    public static void main(String[] args) {

        String sentence;
        int count ;
        Scanner input = new Scanner(System.in);

        // Introducerea propozitiei
        System.out.println("Enter sentence: ");
        sentence = input.nextLine();

        StringTokenizer tokens = new StringTokenizer(sentence);
        count = tokens.countTokens();
        while(tokens.hasMoreTokens())
        {
            count--;
            printLatinWord(tokens.nextToken());
        }
        System.out.println();
    } // end method main

    // Traducerea cuvintelor din engleza in PigLatin
    public static void printLatinWord(String token)
    {
        char letters[] = token.toCharArray();
        String translation = new String();

        for (int i = 1; i < letters.length; i++)
        {
            translation += letters[i];
        }

        translation += letters[0] + "ay ";
        System.out.print(translation);
    } // end method printLatinWord
} // end class PigLatin
