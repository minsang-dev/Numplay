package com.example.numplay2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame2 {
    // --------
    // 필드 전역변수
    private final ArrayList<Integer> generateNum; //inputNum : 사용자 , generateNum : 컴퓨터

    ArrayList<Integer> generateNum() {
        HashSet<Integer> answerNum = new HashSet<>(); //지역변수 generateNum 안에서만 -
        Random random = new Random();

        while (answerNum.size() < 3) {
            int randomNum = random.nextInt(8) + 1;
            answerNum.add(randomNum);
        }
        return new ArrayList<>(answerNum); // answerNum = generateNum
    }

    public BaseballGame2() {
        this.generateNum = generateNum(); //지역변수를 만들어서 전역변수에 할당. // 생성자
    }

    protected boolean validateInput(String inputNum) {
        if (inputNum.length() != 3) {
            return false;
        }
        // 각각 문자 확인
        char num1 = inputNum.charAt(0);
        char num2 = inputNum.charAt(1);
        char num3 = inputNum.charAt(2);

        // 숫자인지, 0이 포함되어 있는지 확인
        if (!Character.isDigit(num1) || num1 == '0' ||
                !Character.isDigit(num2) || num2 == '0' ||
                !Character.isDigit(num1)) {
            return false;
        }
        // 중복된 문자가 있는지 확인
        if (num1 == num2 || num1 == num2 || num2 == num3) {
            return false;
        }
        return true;
    }

    private int countStrike (String inputNum){
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (this.generateNum.get(i) == Character.getNumericValue((inputNum.charAt(i)))) {
                strike++;
            }
        }
        return strike;
    }
    // 볼 개수
    private int countBall (String inputNum){
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (this.generateNum.contains(Character.getNumericValue(inputNum.charAt(i)))) {
                ball++;
            }
        }
        return ball;
    }

    public void play() {
        while (true) {
            // 1. 유저에게 입력값을 받음
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자를 입력하세요: ");
            String input = sc.next();

            // 2. 올바른 입력값을 받았는지 검증
            if (!validateInput(input)) {
                System.out.println("잘못된 입력값입니다 !");
                continue;
            }

            // 4. 스트라이크 개수 계산 & 볼 개수 계산
            int strike = countStrike(input);
            int ball = countBall(input) - strike;

            // 5. 정답 여부 확인, 만약 정답이면 break 이용해 반복문 탈출
            if (strike == 3) {
                System.out.println("정답입니다 !");
                break;
            }

            // 7. 힌트 출력
            BaseballGameDisplay2.displayHint(strike, ball);
            // 스트라이크 개수

        }
    }
}
