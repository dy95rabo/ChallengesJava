package main.java.Mittel;
import java.util.stream.Collectors;

public class ReplaceLetterWithPosition {
    /**
     * Replace Letters With Position In Alphabet
     * 
     * Create a function that takes a string and replaces each letter with its
     * appropriate position in the alphabet. "a" is 1, "b" is 2, "c" is 3, etc, etc.
     * Examples
     * 
     * alphabetIndex("Wow, does that work?")
     * ➞ "23 15 23 4 15 5 19 20 8 1 20 23 15 18 11"
     * 
     * alphabetIndex("The river stole the gods.")
     * ➞ "20 8 5 18 9 22 5 18 19 20 15 12 5 20 8 5 7 15 4 19"
     * 
     * alphabetIndex("We have a lot of rain in June.")
     * ➞ "23 5 8 1 22 5 1 12 15 20 15 6 18 1 9 14 9 14 10 21 14 5"
     * 
     * Notes
     * 
     * If any character in the string isn't a letter, ignore it.
     */
    public static String alphabetIndex(String str) {
        //TODO















    }













    // public static void main(String[] args) {
    //     String[] sentence = new String[] {
    //             "Wednesday is hump day, but has anyone asked the camel if he’s happy about it?",
    //             "Check back tomorrow; I will see if the book has arrived.",
    //             "We have a lot of rain in June.",
    //             "Sixty-Four comes asking for bread.",
    //             "The#b00k$is*in^fr0nt#0f!the_taBle.",
    //             "Lets all be unique together until we realise we are all the same.",
    //             "The river stole the gods.",
    //             "Wow, does that work?",
    //             "If Purple People Eaters are real… where do they find purple people to eat?",
    //             "Abstraction is often one floor above you."
    //     };
    //     String[] solutions = new String[] {
    //             "23 5 4 14 5 19 4 1 25 9 19 8 21 13 16 4 1 25 2 21 20 8 1 19 1 14 25 15 14 5 1 19 11 5 4 20 8 5 3 1 13 5 12 9 6 8 5 19 8 1 16 16 25 1 2 15 21 20 9 20",
    //             "3 8 5 3 11 2 1 3 11 20 15 13 15 18 18 15 23 9 23 9 12 12 19 5 5 9 6 20 8 5 2 15 15 11 8 1 19 1 18 18 9 22 5 4",
    //             "23 5 8 1 22 5 1 12 15 20 15 6 18 1 9 14 9 14 10 21 14 5",
    //             "19 9 24 20 25 6 15 21 18 3 15 13 5 19 1 19 11 9 14 7 6 15 18 2 18 5 1 4",
    //             "20 8 5 2 11 9 19 9 14 6 18 14 20 6 20 8 5 20 1 2 12 5",
    //             "12 5 20 19 1 12 12 2 5 21 14 9 17 21 5 20 15 7 5 20 8 5 18 21 14 20 9 12 23 5 18 5 1 12 9 19 5 23 5 1 18 5 1 12 12 20 8 5 19 1 13 5",
    //             "20 8 5 18 9 22 5 18 19 20 15 12 5 20 8 5 7 15 4 19",
    //             "23 15 23 4 15 5 19 20 8 1 20 23 15 18 11",
    //             "9 6 16 21 18 16 12 5 16 5 15 16 12 5 5 1 20 5 18 19 1 18 5 18 5 1 12 23 8 5 18 5 4 15 20 8 5 25 6 9 14 4 16 21 18 16 12 5 16 5 15 16 12 5 20 15 5 1 20",
    //             "1 2 19 20 18 1 3 20 9 15 14 9 19 15 6 20 5 14 15 14 5 6 12 15 15 18 1 2 15 22 5 25 15 21"

    //     };

    //     for (int i = 0; i < solutions.length; i++) {
    //         System.out.println("Your solution was: \t\t" + alphabetIndex(sentence[i]));
    //         System.out.println("The expected solution is: \t" + solutions[i]);
    //         System.out.print("Test " + (i + 1) + " was: \t\t\t");
    //         System.out.println(alphabetIndex(sentence[i]).equals(solutions[i]) + "\n");

    //     }
    // }


// public static String alphabetIndexExample(String str) {
//         // advanced solution using streams
//         return str.toLowerCase()
//                 .chars()
//                 .filter(Character::isAlphabetic)
//                 .map(x -> x - 'a' + 1)
//                 .mapToObj(Integer::toString)
//                 .collect(Collectors.joining(" "));
//     }




}
