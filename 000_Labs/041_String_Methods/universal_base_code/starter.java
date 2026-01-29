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
		String name;
		name = sc.nextLine();
		int Nname = name.indexOf(" ");
		String Nename = name.substring(Nname); 
		System.out.println(Nename);
		BaseClass test = new BaseClass();


		
	}
}
