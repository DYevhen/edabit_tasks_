public class HowManySolutions {
    /**
     Name: How Many Solutions Does This Quadratic Have?
     Difficult: Medium
     Instruction: A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions for real values of x.
     Given a, b and c, you should return the number of solutions to the equation.

     Examples:
     solutions(1, 0, -1) ➞ 2
     x² - 1 = 0 has two solutions (x = 1 and x = -1)

     solutions(1, 0, 0) ➞ 1
     x² = 0 has one solution (x = 0)

     solutions(1, 0, 1) ➞ 0
     x² + 1 = 0 has no real solutions.
     */
    public static int solutions(int a, int b, int c) {
        int i = b * b - 4 * a * c;
        if (i > 0) {
            return 2;
        }
        return i == 0? 1:0;
    }
}
