public class PerfectSquarePath {
    /**
     Name: Perfect Square Patch
     Difficult: Medium
     Instruction: Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
     Examples:
     squarePatch(3) ➞ [
     [3, 3, 3],
     [3, 3, 3],
     [3, 3, 3]
     ]
     squarePatch(5) ➞ [
     [5, 5, 5, 5, 5],
     [5, 5, 5, 5, 5],
     [5, 5, 5, 5, 5],
     [5, 5, 5, 5, 5],
     [5, 5, 5, 5, 5]
     ]
     squarePatch(1) ➞ [
     [1]
     ]
     squarePatch(0) ➞ []
     */
    public static int[][] squarePatch(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j]=n;
            }
        }
        return result;
    }
}
