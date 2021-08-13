package easy;

public class GetWordCount {
    /**
     Name: Get Word Count
     Difficult: Easy
     Instruction: Create a method that takes a string and returns the word count. The string will be a sentence.
     Examples:
     countWords("Just an example here move along") ➞ 6
     countWords("This is a test") ➞ 4
     countWords("What an easy task, right") ➞ 5
     */

    public static int countWords(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isSpaceChar(c)){
                count++;
            }
        }
        return count;
    }
}
