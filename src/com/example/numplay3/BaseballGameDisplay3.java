package com.example.numplay3;

public class BaseballGameDisplay3 {

    public static void displayHint(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println("아웃");
        } else {
            System.out.println(strike + "스트라이크 " + ball + "볼");
        }
    }

    public static boolean displayHistory(BaseballGameHistory history) {
        System.out.println(history.getGameNumber() + " 번째 게임 : 시도 횟수 - "
                + history.getAttempt());
        return false;
    }
}
