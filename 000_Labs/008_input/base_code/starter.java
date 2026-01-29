/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user inputs
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your birthday month: ");
        String month = scanner.next();

        System.out.print("Enter your birthday day: ");
        int day = scanner.nextInt();

        System.out.print("Enter your birthday year: ");
        int year = scanner.nextInt();

        System.out.print("How much is a buck fifty? ");
        double buckFifty = scanner.nextDouble();

        // Output results in full sentences
        System.out.println("\nHello, " + firstName + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your birthday is on " + month + " " + day + ", " + year + ".");
        System.out.println("A buck fifty is equal to $" + buckFifty + ".");

        scanner.close();
    }
}