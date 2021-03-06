import easy.GetWordCount;
import easy.HowMuchIsTrue;
import hard.ConsecutiveNumbers;
import medium.ArrayOfMultiplies;
import medium.HouseInFront;
import medium.HowManySolutions;
import medium.WarOfNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(HowMuchIsTrue.countTrue(new boolean[]{true, false, true, false, true, true}));
        System.out.println(GetWordCount.countWords("Hello my name is Yevhen, how are you?"));
        System.out.println(HowManySolutions.solutions(1, 0, 0));
        System.out.println(HouseInFront.oppositeHouse(46, 54));
        System.out.println(Arrays.toString(ArrayOfMultiplies.arrayOfMultiples(11, 11)));
        System.out.println(WarOfNumbers.warOfNumbers(new int[]{2, 6, 11, 42, 17, 55, 64}));
        System.out.println(ConsecutiveNumbers.cons(new int[]{5,1,2,3,4}));
    }
}
