/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

  public class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Next 5 integers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print((num + i) + " ");
        }
        System.out.println();

        System.out.println("Next 5 multiples:");
        for (int i = 1; i <= 5; i++) {
            System.out.print((num * i) + " ");
        }
        System.out.println();

        System.out.println("Divided by 100: " + (num / 100.0));
        System.out.println("Divided by 10: " + (num / 10.0));

        scanner.close();
    }
}
