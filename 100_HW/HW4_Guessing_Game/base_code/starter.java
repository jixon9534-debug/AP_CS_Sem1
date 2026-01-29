/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] answers = {"Apple", "Dog", "Car"};
        
        String[][] hints = {
            {"It's a fruit.", "Its usually red"},  
            {"Its an animal.", "Its a common pet."},   
            {"Its a vehicle.", "It has four wheels."}     
        };
        int index = (int)(Math.random() * answers.length);
        String correctAnswer = answers[index];
        String[] chosenHints = hints[index];

        System.out.println("Guessing Game!");
        System.out.println("You get two hints to guess the word.");
        System.out.println("Hint 1: " + chosenHints[0]);
        System.out.println("Hint 2: " + chosenHints[1]);

        System.out.print("Enter your guess: ");
        String guess = sc.nextLine();

        if (guess.equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct! The answer was " + correctAnswer + ".");
        } else {
            System.out.println("Wrong! The answer was " + correctAnswer + ".");
        }

        sc.close();
    }
}

