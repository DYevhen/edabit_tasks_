public class HowMuchIsTrue {
    /**
     Name: How Much is True?
     Difficult: Easy
     Instruction: Create a function which returns the number of true values there are in an array.
     Example: countTrue([true, false, false, true, false]) ➞ 2
     */
    public static int countTrue(boolean[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                count++;
            }
        }
        return count;
    }
}

