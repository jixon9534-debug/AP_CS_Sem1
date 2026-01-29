/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

	public static String randName() {
		int rand = (int)(Math.random() * 7);

		if(rand == 0) return "Dopey";
		if(rand == 1) return "Bashful";
		if(rand == 2) return "Grumpy";
        if(rand == 3) return "Sleepy";
		if(rand == 4) return "Sneezy";
		if(rand == 5) return "Happy";
		return "Doc";
	}

	public static void main(String args[]) {

		PooleDwarf[] dwarfs = new PooleDwarf[7];

		Random rand = new Random();

		for(int i = 0; i < 7; i++) {
			String name = randName();
			int age = rand.nextInt(100) + 1;

			dwarfs[i] = new PooleDwarf(name, age);
		}
		String firstName = dwarfs[0].getName();
		int duplicateCount = 0;
		for(int i = 1; i < 7; i++) {
			if(dwarfs[i].isSameName(firstName)) {
				duplicateCount++;
			}
		}
		System.out.println("The first dwarf's name was: " + firstName);
		System.out.println("Duplicates found: " + duplicateCount);
	}
}
