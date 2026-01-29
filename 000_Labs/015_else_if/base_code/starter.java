/*
 *	Author:  
 *  Date: 
*/

	import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberToGuess = (int)(Math.random() * 1000) + 1;
        int guess = 0;

        System.out.println("Im thinking of a number between 1 and 1000.");
        System.out.println("Try to guess the number");
        
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Too high");
            } else if (guess < numberToGuess) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! The number was " + numberToGuess + ".");
            }
        }
    }
}
