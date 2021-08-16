package hard;

import java.util.Arrays;

public class AlmostPalindrome {
    /**
     * Name: Almost Palindrome
     * Instruction: A string is an almost-palindrome if, by changing only one character, you can make it a palindrome.
     * Create a function that returns true if a string is an almost-palindrome and false otherwise.
     * p.s. if already palindrome - return false.
     * Examples:
     * almostPalindrome("abcdcbg") ➞ true
     * // Transformed to "abcdcba" by changing "g" to "a".
     * almostPalindrome("abccia") ➞ true
     * // Transformed to "abccba" by changing "i" to "b".
     * almostPalindrome("abcdaaa") ➞ false
     * // Can't be transformed to a palindrome in exactly 1 turn.
     * almostPalindrome("1234312") ➞ false
     */
    public static boolean almostPalindrome(String str) {
        String head;
        if (str.length() % 2 == 0) {
            head = str.substring(0, str.length() / 2);
        } else {
            head = str.substring(0, str.length() / 2 + 1);
        }
        String tail = new StringBuilder(str.substring(str.length() / 2)).reverse().toString();
        if (head.equals(tail)) {
            return false;
        }
        char[] exampleHead = head.toCharArray();
        char[] exampleTail = tail.toCharArray();
        for (int i = 0; i < exampleHead.length; i++) {
            if (exampleHead[i] != exampleTail[i]) {
                exampleTail[i] = exampleHead[i];
                return Arrays.equals(exampleHead, exampleTail);
            }
        }
        return false;
    }
}
