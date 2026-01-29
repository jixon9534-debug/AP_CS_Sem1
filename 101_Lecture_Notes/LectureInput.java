/*
    Lecture note example - Input!!
*/

    import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
    
    
    Scanner sc = new Scanner(System.in);
    double item1Price = 9.50;
    double item2Price = 5.25;
    double item3Price = 2.05;
    double item4Price = 1.00;
    
    System.out.println("🍟 Food Menu 🍟");
    System.out.println("1. 🍕 Pizza - $9.50");
    System.out.println("2. 🌯 Burrtio - $5.25");
    System.out.println("3. 🍗 Chicken - $2.05");
    System.out.println("4. 🥤 Water - $1.00");
    
    System.out.println();
    System.out.println("what's the name for the order?");
    String name = sc.nextLine();
    
    System.out.println();
    System.out.println("How many Pizza would you like?");
    int quant1 = sc.nextInt();
    System.out.println("How many Burrtio would you like?");
    int quant2 = sc.nextInt();  
    System.out.println("How many Chicken would you like?");
    int quant3 = sc.nextInt();
    System.out.println("How many Water would you like?");
    int quant4 = sc.nextInt();
    
    System.out.println();
    double total1 = item1Price * quant1;
    double total2 = item1Price * quant2;
    double total3 = item1Price * quant3;
    double total4 = item1Price * quant4;
    double total = total1 + total2 + total3 + total4;
    System.out.println("Your total currently is: $" + total);
    System.out.println("What percent would you like to tip?");
    double tipPercent = sc.nextDouble();
    
    double tip = total * (tipPercent/100);
    double grandTotal = tip + total;
    
    System.out.println();
    System.out.println("----------------");
    System.out.println(" " + name + " 's Receipt:");
    System.out.println(quant1 + " x Pizza = $" + total1);
    System.out.println(quant2 + " x Burrito = $" + total2);
    System.out.println(quant3 + " x Chicken = $" + total3);
    System.out.println(quant4 + " x Water = $" + total4);
    System.out.println("Tip (" + tipPercent + ") = $" + tip);
    System.out.println("Grand Total = $" + grandTotal);
    System.out.println("Thanks for dining at James food Mart!");
	}
}
