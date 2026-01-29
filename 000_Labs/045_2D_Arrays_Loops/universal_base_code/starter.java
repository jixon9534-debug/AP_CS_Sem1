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
	
		int symbol = 0;
		System.out.println("Give a number of rows for the 2D Array ");
		int rows = sc.nextInt();
		System.out.println("Give a number of cols for the 2D Array ");
		int cols = sc.nextInt();
		int total = 0;
		int [][] arr = new int[rows][cols];
		for(int r = 0; r < rows; r++){
			for(int c = 0; c < cols; c++){
				System.out.print(symbol = (int)(Math.random()* 10 + 1));
				total = total + arr[r][c];
			}
			System.out.println();
			
		}
		
		System.out.println("Which row would you like to find the average of ");
		int choice = sc.nextInt();
		for( = r < cols; c++ ){
				System.out.println(choice);
		}
		System.out.println(choice);
		
		System.out.println("The average of the whole 2D array is " + total);
		
		BaseClass test = new BaseClass();


		
	}
}
