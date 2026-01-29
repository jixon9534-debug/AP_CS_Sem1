/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("What is your name? ");
	String UserName = inputScanner.nextLine();
	
	System.out.println("How many times would you like me to say your name? ");
	int number = inputScanner.nextInt();
	
	int count = 0;
	
	while(count < number) {
		System.out.println(UserName);
		count++;
	}


		
	}
}
