package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;							// What's the age of the actor?
	String villain;			// Who's the arch nemesis of this Spiderman?



	
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	public Spiderman(){
		actor = ("Unknown");
		age = 0;
		villain = ("Unknown");
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	public Spiderman(String Actorr){
		actor = Actorr;
		age = 0;
		villain = ("Unknown");
	}
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	public Spiderman(int AGE){
		actor = ("Unknown");
		age = AGE;
		villain = ("Unknown");
	}
	
	
	// String Actor, int Age constructor! 	Villain Unknown
	public Spiderman(String A, int ag){
		actor = A;
		age = ag;
		villain = ("Unknown");
	}
	
	
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(String A, int ag, String v){
		actor = A;
		age = ag;
		villain = v;
	}
	
	
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
