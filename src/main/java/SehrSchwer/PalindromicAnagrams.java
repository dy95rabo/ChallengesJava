package main.java.SehrSchwer;

import java.util.Arrays;
import java.util.LinkedList;


public class PalindromicAnagrams {
    /**
     * Palindromic Anagrams
     * 
     * Given a word, create a function which returns whether or not it's possible to
     * create a palindrome by rearranging the letters in the word.
     * Examples
     * 
     * isPalindromePossible("rearcac") ➞ true
     * // You can make "racecar"
     * 
     * isPalindromePossible("suhbeusheff") ➞ true
     * // You can make "sfuehbheufs" (not a real word but still a palindrome)
     * 
     * isPalindromePossible("palindrome") ➞ false
     * // It's impossible
     * 
     * Notes
     * 
     * Trivially, words which are already palindromes return true.
     * Words are given in all lowercase.
     */
    public static boolean isPalindromePossible(String str) {
        //ToDo
       








    }



















    
    // public static boolean isPalindromePossible(String str) {
         // boolean even = str.length()%2==0;
        // LinkedList<Integer> charCount = new LinkedList<>();
        // while (str.length()>0) {
        //     char tmpChar = str.charAt(0);
        //     String tmpString = str.replaceAll(Character.toString(tmpChar), "");
        //     charCount.add(str.length()-tmpString.length());
        //     str = tmpString;
        // }
		// if(even){
        //     //every char has to occure in even numbers
        //     return charCount.stream().map(x-> x%2).filter(x->x!=0).count()==0;
        // }else{
        //     //every char has to occure in even numbers exept one that has to be in odd numbers
        //     return even ^ charCount.stream().map(x-> x%2).filter(x->x!=0).count()==1;
        // }

        // char[] strChars = str.toCharArray();
		// Arrays.sort(strChars);
		// str = new String(strChars).replaceAll("([a-z])\\1","");
		
		// return str.length() <= 1;

    // }

}
