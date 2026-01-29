/*
 *	Author:  
 *  Date: 
*/

	import java.util.Scanner;

 class starter{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are different.");
        }

        scanner.close();
    }
}

