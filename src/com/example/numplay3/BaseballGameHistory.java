package com.example.numplay3;

public class BaseballGameHistory {
    private final int gameNumber; // 몇번째 게임인지
    private final int attempt; // 시도 횟수
    
    // 생성자
    public BaseballGameHistory(int gameNumber, int attempt) {
        this.gameNumber = gameNumber;
        this.attempt = attempt;
    }
    // 초기화
    public BaseballGameHistory() {
        this.gameNumber = 0;
        this.attempt = 0;
    }
    public int getGameNumber() {
        return gameNumber;
    }
    public int getAttempt() {
        return attempt;
    }
}
