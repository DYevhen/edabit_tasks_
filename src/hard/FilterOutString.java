package hard;

import java.util.Arrays;
import java.util.stream.Stream;

public class FilterOutString {
    /**
     * Name: Filter out Strings from an Array
     * Instruction: Create a function that takes an array of non-negative integers and strings and return a new array without the strings.
     * Examples:
     * filterArray([1, 2, "a", "b"]) ➞ [1, 2]
     * filterArray([1, "a", "b", 0, 15]) ➞ [1, 0, 15]
     * filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]
     */
    public static String[] filterArray(String[] str) {
        return Stream.of(str).filter(x -> x.matches("[0-9]+?")).toArray(String[]::new);
    }
}
