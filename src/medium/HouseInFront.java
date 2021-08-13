package medium;

public class HouseInFront {
    /**
     * Name: Opposite House
     * Difficult: Medium
     * Instruction: Tesha was walking through a straight street with exactly n identical houses on both sides.
     * House numbers in the street look like this:
     * 1 |   | 6
     * 3 |   | 4
     * 5 |   | 2
     * She noticed that even numbered houses increases on the right while odd numbered houses decreases on the left.
     * Create a function that takes a house number house and length of the street n and returns the house number
     * on the opposite side.
     * <p>
     * Examples:
     * oppositeHouse(1, 3) ➞ 6
     * oppositeHouse(2, 3) ➞ 5
     * oppositeHouse(3, 5) ➞ 8
     * oppositeHouse(5, 46) ➞ 88
     */
    public static long oppositeHouse(long house, long n) {
        return n*2+1-house;
    }
}
