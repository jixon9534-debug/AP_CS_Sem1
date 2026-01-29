/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Pick a cat or a pencil or face");
	System.out.println("It will then create a drawing of what you picked");
	String choice = inputScanner.nextLine();

        if (choice.equalsIgnoreCase("cat")) {
            System.out.println("    xxx");
System.out.println("xxx xx                          xxxx   
System.out.println("xx    xx                        xx  xx  
System.out.println("xx      xx                      x     xx ;
System.out.println("xxxxxxxxxxx────────────────────xxxxxxxxxxx
System.out.println("│                                        │
System.out.println("│                                        │
System.out.println(")│                                        │
System.out.println("│                                        │
System.out.println("│        xxxxxxx         xxxxxxx         │
System.out.println("│        x     x         x     x         │
System.out.println("│        x     x         x     x         │
System.out.println("│        x     x         x     x         │
System.out.println("│        xxxxxxx         xxxxxxx         │
System.out.println("│                                        │
System.out.println("│                                        │
System.out.println("│                                        │
System.out.println("│                             x          │
System.out.println("│        xx                 xxx          │
System.out.println("│         xxxxx xxxxxxxxxxxxxxx          │
System.out.println("│             xxxxxxxxxxxxx xx           │
System.out.println("│                                        │
System.out.println("└────────────────────────────────────────┘
);
        }
        
        if (choice.equalsIgnoreCase("pencil")) {
            System.out.println(
System.out.println(" xxxxxx┌─────────────────────────────────────────────────xx┌─┐
System.out.println("xxx   x│                                                 xx│ │
System.out.println("xxx     x│                                                 x┌┐ │
System.out.println("xx      x│                                                 x└┘ │
System.out.println("xxx    x│                                                 xx│ │
System.out.println("xxxxx└─────────────────────────────────────────────────xx└─┘);
       
        }
        
        if (choice.equalsIgnoreCase("face")) {
            System.out.println(             x                                                        
System.out.println("  xx                    x  x  x                            
System.out.println(" xx x  x x     xx x    x xxxxx          x        xxxxxxxx        
System.out.println(" x     x  xxxxxxxx xxx    xx xx x    xx    xxx      xxxx          
System.out.println("       xxxxxx xxxxx x      x    xxxxx   xxxxxxxxxx xxxxx         
System.out.println(" xx x   xx x      xxxxxxxx xxxx xxxxxx x  xx xx   x xx  x x        
System.out.println(" xx xx   xxxxx xx    xxxx xx x x x  x xx x       x   xx x x       
System.out.println(" x   x   x  x x  x xxxxx xxxx     x x    x    x xxxx xxx x         
System.out.println("┌───x─xxx───────────────────────────────────────────────────┐     
System.out.println(" │                                                           │     
System.out.println(" │                                                           │     
System.out.println("                                                           │     
System.out.println(" xxxx                                                          xxxx  
System.out.println(" xx │x          ┌──────────┐                                    xx xx 
System.out.println x  xx          │          │                 ┌───────────┐      │x  xx
System.out.printlnxx  x           │          │                 │           │      │x   x
System.out.printlnxx  x           │          │                 │           │      │xxxx 
System.out.printlnxxxx           │          │                 │           │      │     
System.out.println│           └──────────┘                 │           │      │     
System.out.println│                                        └───────────┘      │     
System.out.println│                                                           │     
System.out.println│                                                           │     
System.out.println│                                                           │     
System.out.println │          xxxxxxxxxxxxxxxxxxx─xxxxxx─xx─xxxxxxxxxx─x─xxx   │     
System.out.println │          xx─────────────────────────────────────────xx    │     
System.out.println │           xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx     │     
System.out.println│                                     x                     │     
System.out.println │                                                           │     
System.out.println└───────────────────────────────────────────────────────────┘     );
        }      
            

	}
}
