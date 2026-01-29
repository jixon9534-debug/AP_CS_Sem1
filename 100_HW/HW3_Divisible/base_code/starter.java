/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/


import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        checkNumber(num1);
        checkNumber(num2);

        scanner.close();
    }

    public static void checkNumber(int num) {
        System.out.println("\nResults for " + num + ":");

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        System.out.println(num + (num % 3 == 0 ? " is" : " is not") + " divisible by 3.");
        System.out.println(num + (num % 4 == 0 ? " is" : " is not") + " divisible by 4.");
        System.out.println(num + (num % 5 == 0 ? " is" : " is not") + " divisible by 5.");

        if (num % 3 == 0 && num % 4 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by 3, 4, and 5.");
        } else {
            System.out.println(num + " is not divisible by all 3, 4, and 5.");
        }
    }
}

