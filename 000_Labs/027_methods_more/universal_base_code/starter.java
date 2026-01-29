/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount x = new BankAccount();
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        int choice;

        do {
            System.out.println("=== ATM MENU ===");
            System.out.println("1. Create Account (No Info)");
            System.out.println("2. Create Account (Name Only)");
            System.out.println("3. Create Account (Name & Initial Deposit)");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Info");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    account = new BankAccount();
                    System.out.println("Account created with default info!");
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    account = new BankAccount(name);
                    System.out.println("Account created for " + name);
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double deposit = sc.nextDouble();
                    account = new BankAccount(name2, deposit);
                    System.out.println("Account created for " + name2 + " with $" + deposit);
                    break;

                case 4:
                    if (account != null)
                        System.out.println("Current Balance: $" + account.getBalance());
                    else
                        System.out.println("No account created yet!");
                    break;

                case 5:
                    if (account != null)
                        account.displayInfo();
                    else
                        System.out.println("No account created yet!");
                    break;

                case 6:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
            System.out.println();

        } while (choice != 6);

        sc.close();
    }
}


