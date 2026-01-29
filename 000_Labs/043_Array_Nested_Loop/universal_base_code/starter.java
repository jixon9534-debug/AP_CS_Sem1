/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a symbol for the box");
		String symbol = sc.nextLine();
		System.out.println("Give a number of rows for the box ");
		int rows = sc.nextInt();
		System.out.println("Give a number of cols for the box ");
		int cols = sc.nextInt();
		
		for(int r = 0; r < rows; r++){
			// Print the values in the row
			for(int c = 0; c < cols; c++){
				System.out.print(symbol);
			}
			// Print a new line
			System.out.println();
			
		}
		
		
		BaseClass test = new BaseClass();


		
	}
}
