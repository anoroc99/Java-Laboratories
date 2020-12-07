// Capitolul 16, sarcina 16.14
//        (Counting Letters) Modify the program of Fig. 16.18 to count the number of occurrences
//        of each letter rather than of each word. For example, the string "HELLO THERE" contains two Hs, three
//        Es, two Ls, one O, one T and one R. Display the results.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoutingLetters
{
    public static void main(String[] args)
    {
        // create HashMap to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    } // end main

    // create map from user input
    private static void createMap(Map<String, Integer> map)
    {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        // tokenize the input
        Matcher mat = Pattern.compile("\\w").matcher(input);

        // processing input text
        while (mat.find())
        {
            String letter = mat.group().toLowerCase(); // get lowercase letter

            // if the map contains the letter
            if (map.containsKey(letter)) // is letter in map
            {
                int count = map.get(letter); // get current count
                map.put(letter, count + 1); // increment count
            }
            else
                map.put(letter, 1); // add new letter with a count of 1 to map
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map)
    {
        Set<String> keys = map.keySet(); // get keys

        // sortarea cheilor
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key : sortedKeys)
            System.out.printf("%-10s%10s%n", key, map.get(key));

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    } //end method displayMap
} //end class CoutingLetters