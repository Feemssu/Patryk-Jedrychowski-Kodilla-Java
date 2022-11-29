package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    GameInfo gameInfo = new GameInfo();
    PlayersMove playersMove = new PlayersMove();

    boolean end = false;
    boolean isPlaying = true;

    public void play() {
        start();
    }

    private void start() {
        while (isPlaying) {
            prepareGame();
            while (!end) {
                inGame();


            }

        }
    }



    public void prepareGame() {
        gameInfo.name();
        gameInfo.rounds();
        gameInfo.keys();
    }

    public void inGame() {
            playersMove.userMove();
            playersMove.compMove();
            playersMove.playersChoice();
            playersMove.fight();
            playersMove.displayWinner(gameInfo);
            playersMove.result(gameInfo);
            playAgain();
    }



    public void playAgain(){
        if (gameInfo.getRoundsQuantity() == playersMove.userPoints
                || gameInfo.getRoundsQuantity() == playersMove.compPoints
                || gameInfo.getRoundsQuantity() == playersMove.draw) {
            System.out.println("Wanna play again ? y - yes / n - no");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("y")) {
                end = true;
                isPlaying = false;
                new Game();
            } else if (playAgain.equals("n")) {
                endGame();
            }
        }
    }
    public void endGame() {
        System.out.println("Thank you for playing.");
        end = true;
        isPlaying=false;
    }

}