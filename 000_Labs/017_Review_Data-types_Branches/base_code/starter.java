/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner inputScanner = new Scanner(System.in);	
	System.out.print("What is the name of your Character ");
	String playersName = inputScanner.nextLine();
	System.out.println("Your player name is " + playersName);
	System.out.print("Are you sure thats what you want your name to be? ");
	String YesNo = inputScanner.nextLine();
	if (YesNo.equalsIgnoreCase("Yes")) {
		System.out.println("Your name is " + playersName);
	} else {
		System.out.println("What would you like your new name to be? ");
		System.out.println("This will be your last chance to change your name");
		playersName = inputScanner.nextLine();
		System.out.println("Your new name is " + playersName);
		
	}
	System.out.println("What do you want your title to be? ");
	String playersTitle = inputScanner.nextLine();
	System.out.println("Your title is " + playersName + (" the ") + playersTitle);
	
	
	System.out.println("What Job do you want " + playersName + " to have");
	System.out.println("The Jobs are Teacher, Track star, Bodybuilder, Model, Jobless");
	System.out.println("The Teacher");
	System.out.println("The Track star");
	System.out.println("The Bodybuilder");
	System.out.println("The Model");
	System.out.println("The jobless");
	String playersJob = inputScanner.nextLine();
	System.out.println("Your Job is " + playersJob);
	System.out.println("You are know as " + playersName + (" the ") + playersTitle + (" and the ") + playersJob);
	System.out.println("You now pick your stats for your life");
	System.out.println("Your choices for stats are Strength, Agility, Intelligence, and Charisma");
	System.out.println("You have 20 stats to start with");
	System.out.println("First choose Strength 1-10 ");
	int num1 = 20;
	int Strength;
	int Agility;
	int Intelligence;
	int Charisma;
	
	Strength = inputScanner.nextInt();
    if(Strength < 1 || Strength > 10){
    System.out.println("YOU MUST CHOOSE BETWEEN 1-10");
	System.out.println("Choose Strength (1-10): ");
	Strength = inputScanner.nextInt();
    }
    num1 = num1 - Strength;
	System.out.println("You know have " + num1 + (" stat points left "));
        
    Agility = inputScanner.nextInt();
    if(Agility < 1 || Agility > 10){
    System.out.println("YOU MUST CHOOSE BETWEEN 1-10");
	System.out.println("Choose Agility (1-10): ");
	Agility = inputScanner.nextInt();
    }
    num1 = num1 - Agility;
	System.out.println("You know have " + num1 + (" stat points left ")); 
        
    Intelligence = inputScanner.nextInt();
    if(Intelligence < 1 || Intelligence > 10){
    System.out.println("YOU MUST CHOOSE BETWEEN 1-10");
	System.out.println("Choose Intelligence (1-10): ");
	Intelligence = inputScanner.nextInt();
    }
    num1 = num1 - Intelligence;
	System.out.println("You know have " + num1 + (" stat points left ")); 
      
	Charisma = inputScanner.nextInt();
    if(Charisma < 1 || Charisma > 10){
	System.out.println("YOU MUST CHOOSE BETWEEN 1-10");
	System.out.println("Choose Charisma (1-10): ");
	Charisma = inputScanner.nextInt();
    }
    num1 = num1 - Charisma;
	System.out.println("You know have " + num1 + (" stat points left "));
	System.out.println("Your stats are " + Strength + (" Strength"));
	System.out.println("Your stats are " + Agility + (" Agility"));
	System.out.println("Your stats are " + Intelligence + (" Intelligence"));
	System.out.println("Your stats are " + Charisma + (" Charisma"));
  
    	}
	}
	