package hard;

public class ConsecutiveNumbers {
    /**
     * Name: Consecutive Numbers
     * Instruction: Create a function that determines whether elements in an array can be re-arranged to form
     * a consecutive list of numbers where each number appears exactly once.
     * Examples:
     * cons([5, 1, 4, 3, 2]) ➞ true
     * // Can be re-arranged to form [1, 2, 3, 4, 5]
     * cons([5, 1, 4, 3, 2, 8]) ➞ false
     * cons([5, 6, 7, 8, 9, 9]) ➞ false
     * // 9 appears twice
     */
    public static boolean cons(int[] arr) {
        for (int in = arr.length - 1; in >= 0; in--) {
            for (int out = 0; out < in; out++) {
                if (arr[out] > arr[in]) {
                    int x = arr[out];
                    arr[out] = arr[in];
                    arr[in] = x;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
