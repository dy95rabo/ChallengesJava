package main.java.Experte;

import java.util.HashMap;
import java.util.Map;

public class SentenceAtIndex {
    final static String txt = "I love Tesh. My world evolves in hers. My love for life.";
    /*
     * Sentence Searcher II
     * 
     * Create a function that returns the sentence that contains the word at index
     * n. Remember to include the full stop at the end.
     * Worked Example
     * 
     * final String txt =
     * "I love Tesh. My world evolves in hers. My love for life.";
     * 
     * sentenceSearcher(txt, 4) ➞ "My world evolves in hers."
     * // The word at index 4 is "world".
     * // The full sentence that contains the word at index 4 is
     * "My world evolves in hers."
     * 
     * Examples
     * 
     * sentenceSearcher(txt, 2) ➞ "I love Tesh."
     * 
     * sentenceSearcher(txt, 5) ➞ "My world evolves in hers."
     * 
     * sentenceSearcher(txt, -1) ➞ "My love for life."
     * // The index at -1 is the last word.
     * // The last word is "life".
     * 
     * Notes
     * 
     * All sentences will end with a full stop.
     * You need to account for negative indexes as well.
     */

    public static String sentenceSearcher(String str, int n) {
        if (n < 0) {
            n = str.split(" ").length + n;
        }
        String[] sentences = str.split("(?<=\\.)");
        Map<Integer, Integer> wordToSentence = new HashMap<>();
        int wordIndex = 0, sentenceIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordIndex++;
            } else if (str.charAt(i) == '.') {
                sentenceIndex++;
            } else {
                wordToSentence.put(wordIndex, sentenceIndex);
            }
        }
        return sentences[wordToSentence.get(n)].trim();
    }

    public static void main(String[] args) {
        System.out.println(sentenceSearcher(txt, 0));
        System.out.println(sentenceSearcher(txt, 5));
        System.out.println(sentenceSearcher(txt, -1));
        System.out.println(sentenceSearcher("I love Tesh. My world evolves in hers. My love for life.", 2));
    }
}
