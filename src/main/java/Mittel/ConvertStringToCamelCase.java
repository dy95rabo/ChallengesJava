package main.java.Mittel;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertStringToCamelCase {
    /**
     * Convert String to camelCase
     * 
     * Create a function that converts dash/underscore delimited words into camel
     * casing. The first word within the output should be capitalized only if the
     * original word was capitalized.
     * Examples
     * 
     * toCamelCase("A-B-C") ➞ "ABC"
     * 
     * toCamelCase("the-stealth-warrior") ➞ "theStealthWarrior"
     * 
     * toCamelCase("The_Stealth_Warrior") ➞ "TheStealthWarrior"
     * 
     * Notes
     * 
     * An empty string as input "" should return an empty string.
     */
    public static String toCamelCase(String str) {
        //ToDo




















        
    }
    
}

// if (str == null || str.isEmpty()) {
//     return "";
// }
// char firstChar = str.charAt(0);
// return firstChar + Arrays.stream(str.toLowerCase().split("-|_"))
//         .map(x -> (x.substring(0, 1).toUpperCase() + x.substring(1, x.length())))
//         .collect(Collectors.joining())
//         .substring(1, str.length());