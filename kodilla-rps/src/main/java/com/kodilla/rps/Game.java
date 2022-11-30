package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    GameInfo gameInfo = new GameInfo();

    boolean end = false;
    boolean isPlaying = true;

    private String userChoice;
    private String compChoice;
    private int win;
    public int userPoints = 0;
    public int compPoints = 0;
    public int draw = 0;

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



    private void prepareGame() {
        gameInfo.name();
        gameInfo.rounds();
        gameInfo.keys();
    }

    private void inGame() {
        userMove();
        compMove();
        playersChoice();
        fight();
        displayWinner(gameInfo);
        result(gameInfo);
        playAgain();
    }



    private void playAgain(){
        if (gameInfo.getRoundsQuantity() == userPoints
                || gameInfo.getRoundsQuantity() == compPoints
                || gameInfo.getRoundsQuantity() == draw) {
            System.out.println("Wanna play again ? y - yes / n - no");
            String playAgain = scanner.nextLine();
            if (playAgain.equals("y")) {
                end = true;
                isPlaying = false;
                new StartGame();
            } else if (playAgain.equals("n")) {
                endGame();
            }
        }
    }
    private void endGame() {
        System.out.println("Thank you for playing.");
        end = true;
        isPlaying=false;
    }

    public String userMove() {
        System.out.println("Please, make your move");
        String choice = scanner.nextLine();
        boolean choiceCheck = true;
        while (choiceCheck) {
            if ("123nx".contains(choice)) {
                if (choice.equals("1")) {
                    userChoice = "rock";
                    return userChoice;
                } else if (choice.equals("2")) {
                    userChoice = "paper";
                    return userChoice;
                } else if (choice.equals("3")) {
                    userChoice = "scissor";
                    return userChoice;
                }


                else if (choice.equals("x")) {
                    System.out.println("Are you sure, you want leave game ? y - yes or n - no");
                    String leaveChoice = scanner.nextLine();
                    if (leaveChoice.equals("y")) {
//                        endGame();
//                        choiceCheck = false;
                        end = true;
                        isPlaying=false;
//                        System.out.println("Thank you");

                    }
                    else if (leaveChoice.equals("n")) {
                        choiceCheck = false;
                        userMove();
                    }
                }

                else if (choice.equals("n")) {
                    System.out.println("Are you sure, you want restart game ? y - yes or n - no");
                    String restartChoice = scanner.nextLine();
                    if (restartChoice.equals("y")) {
                        choiceCheck = false;
                        end = true;
                        isPlaying = false;
                        new StartGame();
                    }
                    else if (restartChoice.equals("n")) {
                        choiceCheck = false;
                        userMove();
                    }
                }

            }else {
                System.out.println("you chose bad key, try again");
                choiceCheck = false;
                userMove();
            }
        }

        return choice;
    }


    public String compMove(){
        System.out.println("Computer move!");
        Random random = new Random();
        int rand = random.nextInt(3);
        if(rand == 0){
            compChoice = "rock";
            return compChoice;
        }else if(rand == 1){
            compChoice ="paper";
            return compChoice;
        }else{
            compChoice ="scissor";
            return compChoice;
        }
    }

    public void playersChoice(){
        System.out.println("You chose " + userChoice);
        System.out.println("Computer chose " + compChoice + "\n");
    }

    public int fight(){
        // 0 - user win
        // 1 - comp win
        // 2 - draw
        if (userChoice.equals("paper") && compChoice.equals("rock")) {
            return win = 0;
        }else if (userChoice.equals("scissor") && compChoice.equals("rock")){
            return win = 0;
        }else if (userChoice.equals("rock") && compChoice.equals("scissor")) {
            return win = 0;
        }else if(userChoice.equals("rock") && compChoice.equals("paper")){
            return win = 1;
        }else if (userChoice.equals("paper") && compChoice.equals("scissor")){
            return win = 1;
        }else if(userChoice.equals("scissor") && compChoice.equals("paper")){
            return win = 1;
        } else {
            return win = 2;
        }
    }


    public void displayWinner(GameInfo gameInfo){
        if(win == 0){
            System.out.println("Player win");
            userPoints++;
        } else if (win == 1){
            System.out.println("Comp win");
            compPoints++;
        } else{
            System.out.println("Draw");
            draw++;
        }

        System.out.println("\nCurrent result:\n" +
                gameInfo.getPlayerName() + " points: "+ userPoints +
                "\nComp points: " + compPoints +
                "\nDraw: " + draw);
    }

    public void result(GameInfo gameInfo){
        if (gameInfo.getRoundsQuantity() == userPoints
                || gameInfo.getRoundsQuantity() == compPoints
                || gameInfo.getRoundsQuantity() == draw) {
            if (gameInfo.getRoundsQuantity() == userPoints) {
                System.out.println(gameInfo.getPlayerName() + " won");
            } else if (gameInfo.getRoundsQuantity() == compPoints) {
                System.out.println("Comp won");

            } else {
                System.out.println("Game is draw");
            }
        }
    }
}