package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String[] rps = {"rock", "paper", "scissors"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;

            while (true) {
                System.out.println("Please enter your move(rock, paper or scissors)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move");
            }

            if (playerMove.equals(computerMove)) {
                System.out.println("Your move is:" + playerMove + ", Computer move is:" + computerMove + ", The game is tie!");
            } else if (playerMove.equals("rock")) {
                if (computerMove.equals("paper")) {
                    System.out.println("Your move is:" + playerMove + ", Computer move is:" + computerMove + ", You loose!");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("Your move is:" + playerMove + ", Computer move is:" + computerMove + ", You win!");
                }
            } else if (playerMove.equals("paper")) {
                if (computerMove.equals("rock")) {
                    System.out.println("Your move is:" + playerMove + ", Computer move is:" + computerMove + ", You win!");
                } else if (computerMove.equals("scissors")) {
                    System.out.println("Your move is:" + playerMove + ", Computer move is:" + computerMove + ", You loose!");
                }
            } else {
                if (computerMove.equals("rock")) {
                    System.out.println("Your move is:" + playerMove + ", Computer move is:" + computerMove + ", You loose!");
                } else if (computerMove.equals("paper")) {
                    System.out.println("Your move is:" + playerMove + ", Computer move is:" + computerMove + ", You win!");
                }
            }
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = scanner.nextLine();
            if(!playAgain.equals("y")){
                break;
            }

        }scanner.close();
    }

}
