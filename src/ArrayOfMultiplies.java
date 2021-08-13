public class ArrayOfMultiplies {
    /**
     Name: Array of Multiples
     Difficult: Medium
     Instruction: Create a function that takes two numbers as arguments (num, length) and returns an array of multiples
     of num until the array length reaches length.
     Examples:
     arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
     arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
     arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
     */
    public static int[] arrayOfMultiples(int num, int length) {
        int[] result = new int[length];
        result[0]=num;
        for(int i=1;i<length;i++){
            result[i]=num+result[i-1];
        }
        return result;
    }
}
