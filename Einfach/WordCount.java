package Challenges.Einfach;

import java.util.stream.Stream;

public class WordCount {
    /**
     * Get Word Count
     * 
     * Create a method that takes a string and returns the word count. The string
     * will be a sentence.
     * Examples
     * 
     * countWords("Just an example here move along") ➞ 6
     * 
     * countWords("This is a test") ➞ 4
     * 
     * countWords("What an easy task, right") ➞ 5
     * 
     * Note:
     * try the .split() method of a String
     */
    public static int countWords(String s) {
        // advanced example code using Streams
        //return (int) Stream.of(s.split(" ")).count();


        // Write your code here!






    }

    public static void main(String[] args) {
        String[] sentences = new String[] {
                "It's high noon",
                "Is this easy mode",
                "What an easy task, right",
                "This is a test",
                "Just an example here move along",
                "How are you today?"

        };
        int[] solutions = new int[] { 3, 4, 5, 4, 6, 4 };

        for (int i = 0; i < solutions.length; i++) {
            System.out.print("Your solution was: \t" + countWords(sentences[i]));
            System.out.print("\t\tThe expected solution is: \t" + solutions[i] + "\t\t");
            System.out.print("Test " + (i + 1) + " was: \t");
            System.out.println(countWords(sentences[i]) == solutions[i]);

        }
    }

}
