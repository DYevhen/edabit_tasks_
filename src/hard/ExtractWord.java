package hard;

public class ExtractWord {
    /**
     Name: Extract a Word From a Sentence
     Instruction: Implement a method removeWord() that takes two string parameters:
     sentence - the sentence you are to remove a word from.
     word - the word you are to remove from the sentence.
     Your method should take a string, sentence and remove word from it. It will return a new string without word in the sentence.
     Examples:
     removeWord("One two three four", "two") ➞ "One three four"
     removeWord("Bob has a kid", "kid") ➞ "Bob has a"
     */
    public static String removeWord(final String sentence, final String word)
    {
        return sentence.replace(word, "").replace("  ", " ");
    }
}
