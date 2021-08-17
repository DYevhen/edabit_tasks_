package hard;

import java.util.Arrays;

public class LargestGap {
    /**
     * Name: Largest Gap
     * Instruction: Given an array of integers, return the largest gap between the sorted elements of the array.
     * For example, consider the array:
     * [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
     * ... in which, after sorting, the array becomes:
     * [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
     * ... so that we now see that the largest gap in the array is between 9 and 20 which is 11.
     * Examples:
     * largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11
     * // After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
     * // Largest gap between 9 and 20 is 11
     * largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 4
     * // After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]
     * // Largest gap between 7 and 11 is 4
     * largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 2
     * // After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]
     * // Largest gap between 6 and 8 is 2
     */
    public static void main(String[] args) {
        System.out.println(largestGap(new int[]{13, 3, 8, 5, 5, 2, 13, 6, 14, 11, 4, 10, 8, 1, 9}));
    }

    public static int largestGap(int[] numbers) {
        int gap = 0;
        quickSort(numbers, 0, numbers.length - 1);
        for (int i = 0; i < numbers.length-1; i++) {
            int diff = numbers[i + 1] - numbers[i];
            if (diff > gap) {
                gap = diff;
            }
        }
        return gap;
    }

    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int point = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < point) {
                i++;
            }
            while (array[j] > point) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }
}
