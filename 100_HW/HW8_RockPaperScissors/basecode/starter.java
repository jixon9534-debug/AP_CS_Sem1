/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.*;

public class starter { 
    
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("\nWould you like to play? (yes/no/done): ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("yes")) {
                playWithUser();
            } else if (choice.equals("no")) {
                playComputerVsComputer();
            } else if (choice.equals("done")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            } else {
                System.out.println("Invalid choice! Please type yes, no, or done.");
            }
        }
    }

    public static String getObject() {
        int rand = random.nextInt(3);
        switch (rand) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    public static int compare2(String player1, String player2) {
        player1 = player1.toLowerCase();
        player2 = player2.toLowerCase();

        if (player1.equals(player2)) return 0;
        else if ((player1.equals("rock") && player2.equals("scissors")) ||
                 (player1.equals("paper") && player2.equals("rock")) ||
                 (player1.equals("scissors") && player2.equals("paper"))) return 1;
        else return 2;
    }

    public static void playWithUser() {
        String playerChoice;
        while (true) {
            System.out.print("Choose your object (rock/paper/scissors): ");
            playerChoice = scanner.nextLine().trim().toLowerCase();
            if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) break;
            System.out.println("Invalid choice! Please type rock, paper, or scissors.");
        }

        String computerChoice = getObject();
        System.out.println("Computer chose: " + computerChoice);

        int result = compare2(playerChoice, computerChoice);
        if (result == 0) System.out.println("It's a tie!");
        else if (result == 1) System.out.println("You win!");
        else System.out.println("Computer wins!");
    }

    public static void playComputerVsComputer() {
        System.out.print("How many times should the computer play against itself? ");
        int times = 0;
        try {
            times = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number! Returning to main menu.");
            return;
        }

        int player1Wins = 0;
        int player2Wins = 0;
        int ties = 0;

        for (int i = 0; i < times; i++) {
            String player1 = getObject();
            String player2 = getObject();
            int result = compare2(player1, player2);

            if (result == 0) ties++;
            else if (result == 1) player1Wins++;
            else player2Wins++;
        }

        System.out.println("\nSummary after " + times + " games:");
        System.out.println("Player 1 wins: " + player1Wins);
        System.out.println("Player 2 wins: " + player2Wins);
        System.out.println("Ties: " + ties);
    }
}
