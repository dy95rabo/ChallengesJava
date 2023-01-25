package main.java.Mittel;

public class MissingLetter {
    /*
     * What's the Missing Letter?
     * 
     * Given a string of letters in the English alphabet, return the letter that's
     * missing from the string. The missing letter will make the string be in
     * alphabetical order (from A to Z).
     * 
     * If there are no missing letters in the string, return "No Missing Letter".
     * Examples
     * 
     * missingLetter("abdefg") ➞ "c"
     * 
     * missingLetter("mnopqs") ➞ "r"
     * 
     * missingLetter("tuvxyz") ➞ "w"
     * 
     * missingLetter("ghijklmno") ➞ "No Missing Letter"
     * 
     * Notes
     * 
     * The given string will never have more than one missing letter.
     */
    public static String missingLetter(String str) {
        char expectedChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++)
            if (str.charAt(i) != ++expectedChar)
                return Character.toString(expectedChar);
        return "No Missing Letter";
    }
}
