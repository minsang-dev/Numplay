package com.example.numplay3;

import com.example.numplay2.BaseballGame2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---------------------------------------------");
        System.out.println("환영합니다 ! 원하시는 번호를 입력해주세요 \n 1. 게임시작하기 2. 게임 기록 보기 3. 종료하기");
        System.out.println("---------------------------------------------");

        BaseballGame3 game = new BaseballGame3();

        boolean retry = true;
        while (retry) {
            retry = false; // 초기값
            String input = sc.nextLine();
        switch (input) {
            case "1":
                System.out.println("< 게임을 시작합니다. >");
                game.play();
                retry = true;
                break;

            case "2":
                System.out.println("< 게임 기록 >");
                game.getHistory();
                retry = true;
                break;

            case "3":
                System.out.println("< 숫자 야구 게임을 종료합니다 >");
                break;

            default:
                System.out.println("올바른 숫자를 입력해주세요 !");
                retry = true;
                break;
            }
        }
    }
}
