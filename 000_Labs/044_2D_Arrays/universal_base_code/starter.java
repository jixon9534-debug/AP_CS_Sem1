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
		int [][] arr = new int[5][5];
		int rows = arr.length;
		int cols = arr[0].length;
		int total = 0;
		for(int r = 0; r < rows; r++){
			for(int c = 0; c < cols; c++){
				arr[r][c] = cols-c;
					System.out.print(arr[r][c]);
					total = total + arr[r][c];
			}
				System.out.println();
			
		}
		int average =  total / (rows * cols);
		System.out.print("The average of the numbers is " + average);
		
		
		BaseClass test = new BaseClass();


		
	}
}
