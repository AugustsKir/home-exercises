package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsApp {
    public static void main(String[] args) {
        System.out.println("Let us begin...");
        Scanner in = new Scanner(System.in);
        int cpuWIN = 0;
        int playerWIN = 0;
        while (true) {
            System.out.println("Scissor-Paper-Stone");
            System.out.println("Your turn (Enter s for scissor, p for paper, r for stone, q to quit): ");
            String playerInput = in.nextLine();
            if(playerInput.charAt(0) == 'q') {
                System.out.println("You won " + playerWIN + "times! ");
                System.out.println("The computer won" + cpuWIN + "times!");
                System.out.println("Shutting down!");
                break;
            }

            String cpuInput = computerMove();
            if (playerInput.equals(cpuInput)) {
                System.out.println("It's a tie!");
            } else if (isPlayerWinner(playerInput, cpuInput)) {
                System.out.println("You won!");
                playerWIN++;
            } else {
                System.out.println("Computer won!");
                cpuWIN++;
            }



        }

    }
    private static String computerMove() {
        Random ran = new Random();
        int randomNum = ran.nextInt(RockPaperScissors.values().length);
        String move = RockPaperScissors.values()[randomNum].getInput();
        System.out.println("The computer picked - " + move);
        return move;
    }
    private static boolean isPlayerWinner(String player, String cpu) {
        return player.equals(RockPaperScissors.ROCK.getInput()) && cpu.equals(RockPaperScissors.SCISSORS.getInput()) ||
                player.equals(RockPaperScissors.SCISSORS.getInput()) && cpu.equals(RockPaperScissors.PAPER.getInput()) ||
                player.equals(RockPaperScissors.PAPER.getInput()) && cpu.equals(RockPaperScissors.ROCK.getInput());
    }
}
