/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the casino");
        System.out.println("You start with 100 dollars if you run out then you get kicked out");
        System.out.println("If you roll 2 of the same numbers your money gets doubled");
        System.out.println("If you roll 3 of the same numbers your money gets tripled");
        System.out.println("Would you like to play?  Yes,yes,Y,y  or  No, no, N, n");
        String Yes = inputScanner.nextLine();
        int total = 100;
        while(true){
              if(Yes.equals("No") || Yes.equals("no") || Yes.equals("N") || Yes.equals("n")){
            break;
            }
            if(Yes.equals("Yes") || Yes.equals("yes") || Yes.equals("Y") || Yes.equals("y")) {
                System.out.println("How much money would you like to gamble");
                int money = inputScanner.nextInt();
                inputScanner.nextLine();
                total = total - money;
        
                int num1 = (int)(Math.random() * 10) + 1;
                int num2 = (int)(Math.random() * 10) + 1;
                int num3 = (int)(Math.random() * 10) + 1;
        
                System.out.println("Random numbers: " + num1 + ", " + num2 + ", " + num3);
                if(num1 == num2 || num1 == num3 || num2 == num3) {
                    money = money * 2;
                    total = total + money;
                    System.out.println("You now have " + total);
                    System.out.println("Would you like to play again Yes,yes,Y,y");
                    String TwoXYes = inputScanner.nextLine();
            
                }
              
                if(num1 == num2 && num1 == num3) {
                    money = money * 3;
                    total = total + money;
                    System.out.println("You now have " + total);
                    System.out.println("Would you like to play again Yes,yes,Y,y");
                    String ThreeXYes = inputScanner.nextLine();
                    
                }
                
                if(total <= 0){
                    break;
                }
                
                if(num1 != num2 && num1 != num3 && num2 != num3){
                    System.out.println("You now have " + total);
                    System.out.println("Would you like to play again Yes,yes,Y,y");
                    String NewYes = inputScanner.nextLine();
                    
                    
                    
                }
            }
        }
    }
}