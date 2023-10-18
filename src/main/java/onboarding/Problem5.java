package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        int [] wallet = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        List<Integer> answer = new ArrayList<>();

        for(int i : wallet){
            answer.add(exchangeMoney(money,i));
            money = divideMoney(money,i);
        }
        return answer;
    }

    private static int divideMoney(int money ,int unit ) {
        return money % unit;
    }
    private static int exchangeMoney(int money, int unit){
        return money / unit;
    }
}
