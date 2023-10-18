package onboarding;

import java.util.Arrays;

public class Problem3 {
    static int count;
    public static int solution(int number) {
        count=0;
        for (int i = 1; i <= number; i++) {
            int currentNumber = i;
            gameCheck(currentNumber);
        }
        return count;

    }

    public static void gameCheck(int number){
        while (number > 0) {
            int digit = number % 10;
            if (threeSixNine(digit)) {
                count++;
            }
            number /= 10;
        }
    }
    public static boolean threeSixNine(int number){
        return number == 3 || number == 6 || number ==9;
     }
}
