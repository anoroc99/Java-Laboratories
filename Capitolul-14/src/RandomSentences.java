// Capitolul 14, sarcina 14.5
//        (Random Sentences) Write an application that uses random-number generation to create
//        sentences. Use four arrays of strings called article, noun, verb and preposition. Create a sentence
//        by selecting a word at random from each array in the following order: article, noun, verb, preposi�
//        tion, article and noun. As each word is picked, concatenate it to the previous words in the sentence.
//        The words should be separated by spaces. When the final sentence is output, it should start with a
//        capital letter and end with a period. The application should generate and display 20 sentences.
//        The article array should contain the articles "the", "a", "one", "some" and "any"; the noun
//        array should contain the nouns "boy", "girl", "dog", "town" and "car"; the verb array should con�
//        tain the verbs "drove", "jumped", "ran", "walked" and "skipped"; the preposition array should
//        contain the prepositions "to", "from", "over", "under" and "on".

public class RandomSentences {

    public static void main(String[] args) {

        // create lists of words
        String[] articles = {"the ", "a ", "one ", "some ", "any "};
        String[] nouns = {"boy ", "girl ", "dog ", "town ", "car "};
        String[] verbs = {"drove ", "jumped ", "ran ", "walked ", "skipped "};
        String[] prepositions = {"to ", "from ", "over ", "under ", "on "};

        // randomly create 20 sentences
        // Order article - noun - verb - preposition - article - noun
        for (int i = 1; i <= 20; i++)
        {
            int article1 = (int)(Math.random() * 5);
            int noun1 = (int)(Math.random() * 5);
            int verb1 = (int)(Math.random() * 5);
            int preposition1 = (int)(Math.random() * 5);
            int article2 = (int)(Math.random() * 5);
            int noun2 = (int)(Math.random() * 5);

            String sentence = "";
            sentence += articles[article1] + nouns[noun1] + verbs[verb1]
                    + prepositions[preposition1] + articles[article2]
                    + nouns[noun2];

            // Prima litera sa fie majuscula
            sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
            System.out.print(sentence.trim() + ".\n");
        }
        System.out.println();
    } // end method main
} // end class RandomSentences