package com.Fay;

public class Game {
    public static void main(String[] args) {
        TicTacToe playGround = new TicTacToe();
        playGround.putO(1,2);
        playGround.putX(2,1);
        playGround.stepBack();
    }
}
