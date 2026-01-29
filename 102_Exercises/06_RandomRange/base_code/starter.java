/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another Integer bigger then the first number: ");
        int num2 = scanner.nextInt();

       

        System.out.println("Your range is " + num1 + " to " + num2);
        System.out.println("Here are 5 numbers generated in that range");
        
        int counter = 0;
        while (counter<5) {
            System.out.print((int)(Math.random() * (num2-(num1))+num1));
            System.out.print(" ");
            counter= counter+1;
        }
     
    
    }
}

