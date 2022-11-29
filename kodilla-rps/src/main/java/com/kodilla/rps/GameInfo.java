package com.kodilla.rps;

import java.util.Scanner;

public class GameInfo {

    Scanner scanner = new Scanner(System.in);
    private String playerName;
    private int roundsQuantity;




    public String getPlayerName() {
        return playerName;
    }

    public int getRoundsQuantity(){
        return roundsQuantity;
    }
    public String name() {
        System.out.println("Hello, give your name: ");
        String name = scanner.nextLine();
        playerName = name;
        return playerName;
    }

    public int rounds(){
        System.out.println(playerName + ", how many rounds do you want play ?");
        int rounds = scanner.nextInt();
        System.out.println("Well, you'll play to " + rounds + " wins");
        roundsQuantity = rounds;
        return roundsQuantity;
    }

    public void keys(){
        System.out.println( "Keys info: \n" +
                "1 - rock\n" +
                "2 - paper\n" +
                "3 - scissor\n" +
                "x - end game\n" +
                "n - new game" );
    }



}
