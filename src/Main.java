import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(HowMuchIsTrue.countTrue(new boolean[]{true, false, true, false, true, true}));
        System.out.println(GetWordCount.countWords("Hello my name is Yevhen, how are you?"));
        System.out.println(HowManySolutions.solutions(1,0,0));
        System.out.println(HouseInFront.oppositeHouse(46,54));
        System.out.println(Arrays.toString(ArrayOfMultiplies.arrayOfMultiples(11, 11)));
    }
}
