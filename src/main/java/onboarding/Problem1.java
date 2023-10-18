package onboarding;

import java.util.List;

public class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        if(!gameStart(pobi,crong)) return -1;
        int pobiNum = Math.max(pageMax(pobi.get(0)), pageMax(pobi.get(1)));
        int crongNum = Math.max(pageMax(crong.get(0)), pageMax(crong.get(1)));
        return gameResult(crongNum, pobiNum);
    }

    private static boolean gameStart(List<Integer> pobi, List<Integer> crong){
        return validator(pobi.get(0),pobi.get(1)) && validator(crong.get(0), crong.get(1));
    }
    private static boolean validator(int num1 , int num2){
        return isRangeCheck(num1, num2) && isPageCheck(num1,num2) && isRightCheck(num1,num2);
    }

    private static boolean isRangeCheck(int num1 , int num2){
        return (1 <= num1 && num1 <=400) && 1 <= num2 && num2 <=400;
    }

    private static boolean isPageCheck(int num1 , int num2){
        return num1 != 1 || num2 != 2 || num1 != 399 || num2 != 400;
    }
    private static boolean isRightCheck(int num1 , int num2){
        return num1 + 1 == num2;
    }

    private static int gameResult(int crong, int pobi){
        if(crong > pobi) return 2;
        if(crong < pobi) return 1;
        return 0;
    }

    private static int pageMax(int num1){
        return Math.max(plusDigits(num1),multiplyDigits(num1));
    }

    private static int plusDigits(int number){
        if(number>=100){
            return number / 100 + ((number % 100) / 10) + number % 10;
        }
        return number / 10 + number % 10;
    }

    //각 자리 곱하기
    private static int multiplyDigits(int number){
        if(number>=100) {
            return (number / 100) * ((number % 100) / 10) * (number % 10);
        }
        return (number / 10 ) * (number % 10);
    }
}
