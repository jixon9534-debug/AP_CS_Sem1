/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
    private String name;
    private double balance;
    private int accountNumber;
    private static int nextAccountNumber = 1000;

    public BankAccount() {
        this.name = "Unknown";
        this.balance = 0.0;
        this.accountNumber = nextAccountNumber++;
    }

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0;
        this.accountNumber = nextAccountNumber++;
    }

    public BankAccount(String name, double initialDeposit) {
        this.name = name;
        this.balance = initialDeposit;
        this.accountNumber = nextAccountNumber++;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: $" + balance);
        System.out.println("----------------------");
    }
}
