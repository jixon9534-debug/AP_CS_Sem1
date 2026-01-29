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
		System.out.println("Type a Phrase that will be shown normal and backwards");
		String ans = (" ");
		String Phrase;
		Phrase = sc.nextLine();
		System.out.println("The Phrase before the change: " + Phrase);
		while(Phrase.indexOf(" ") != -1){
			int phras = Phrase.indexOf(" ");
			String phra = Phrase.substring(0, phras);
			Phrase = Phrase.substring(phras + 1);
			ans = phra + (" ") + ans;
		}
		System.out.println(ans + Phrase);
		
		BaseClass test = new BaseClass();


		
	}
}
