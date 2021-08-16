package hard;

import java.util.Arrays;

public class PrimeNumbers {
    /**
     * Name: How Many "Prime Numbers" Are There?
     * Instruction: Create a function that finds how many prime numbers there are, up to the given integer.
     * Examples:
     * primeNumbers(10) ➞ 4
     * // 2, 3, 5 and 7
     * primeNumbers(20) ➞ 8
     * // 2, 3, 5, 7, 11, 13, 17 and 19
     * primeNumbers(30) ➞ 10
     * // 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29
     */

    public static int primeNumbers(int num) {
        int sum = 0;
        aa:
        for (int i = 2; i <= num; i++) {
            bb:
            for (int j = 2; j <= i; j++) {
                if (i == j) {
                    continue bb;
                }
                if (i % j == 0) {
                    continue aa;
                }
            }
            sum++;
        }
        return sum;
    }
}

