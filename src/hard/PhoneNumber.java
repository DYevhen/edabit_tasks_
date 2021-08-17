package hard;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class PhoneNumber {
    /**
     * Phone Number Word Decoder
     * Create a program that converts a phone number with letters to one with only numbers.
     * <p>
     * Number	Letter
     * 0	none
     * 1	none
     * 2	ABC
     * 3	DEF
     * 4	GHI
     * 5	JKL
     * 6	MNO
     * 7	PQRS
     * 8	TUV
     * 9	WXYZ
     * Examples:
     * textToNum("123-647-EYES") ➞ "123-647-3937"
     * textToNum("(325)444-TEST") ➞ "(325)444-8378"
     * textToNum("653-TRY-THIS") ➞ "653-879-8447"
     * textToNum("435-224-7613") ➞ "435-224-7613"
     */

    public static String textToNum(String phone) {
        String[] letters = new String[]{"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        char[] number = phone.toCharArray();
        for (int i=0;i<number.length;i++) {
            char c = number[i];
            if (Character.isLetter(c)) {
                for (int j = 2; j < letters.length; j++) {
                    if (letters[j].contains(Character.toString(c))) {
                        number[i] = (char) (j+'0');
                    }
                }
            }
        }
        return String.valueOf(number);
    }
}
