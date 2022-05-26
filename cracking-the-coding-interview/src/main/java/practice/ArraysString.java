package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysString {

    /**
     * Implement an algorithm to determine if a string has all unique characters </br>
     * NOTE: Should ask if the string is an ASCII or a Unicode string?
     */
    public static boolean isUniqueInitialApproach(String text) {
        if (isNullOrBlankString(text)) return false;
        Map<Character, Integer> occursByCharacter = new HashMap<>();
        var charArray = text.toCharArray();
        for (Character character : charArray) {
            if (occursByCharacter.containsKey(character)) {
                occursByCharacter.put(character, occursByCharacter.get(character) + 1);
            } else {
                occursByCharacter.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> set : occursByCharacter.entrySet()) {
            if (set.getValue() > 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean isNullOrBlankString(String text) {
        return text == null || text.length() == 0;
    }

    /**
     * This approach is in case not allow use additional data structure </br>
     * Assume all character of the text is following the ASCII </br>
     * Time complexity is O(n). The space complexity is O(1)
     */
    public static boolean isUnique(String text) {
        if (isNullOrBlankString(text)) {
            return false;
        }
        boolean[] chars = new boolean[256];
        for (int i=0; i < text.length(); i++) {
            int index  = text.charAt(i);
            if (chars[index]) {return false;}
            chars[index] = true;
        }
        return true;
    }

    /**
     * Given two strings, write a method to decide if one is a permutation of the other </br>
     * NOTE: Should cover case sensitive? should cover whitespace?
     */
    public static boolean checkPermutation(String text1, String text2) {
        if (isNullOrBlankString(text1) || isNullOrBlankString(text2)) {
            return false;
        }
        String sortedString1 = getSortedString(text1);
        String sortedString2 = getSortedString(text2);

        return sortedString1.equals(sortedString2);
    }

    private static String getSortedString(String text1) {
        char[] charsArray1 = text1.toLowerCase().toCharArray();
        Arrays.sort(charsArray1);
        return new String(charsArray1);
    }
}