package pkg;
import java.util.*;

public class ShoppingCartItem {
private String itemName;
private double itemCost;
private int quantity;


public ShoppingCartItem(){
     itemName = ("Nothing");
     itemCost = 0;
     quantity = 0;
}

public ShoppingCartItem(String itemName, double itemCost, int quantity){
    this.itemName = itemName;
    this.itemCost = itemCost;
    this.quantity = quantity;
}
public void cartToString(){
System.out.println(" You have " + quantity + " of " + itemName + " for " + itemCost + " each");

}
public String getItemName(){
    return itemName;
}

public int getQuantity(){
    return quantity;
}

public double getTotalCost(){
    return itemCost * quantity;
}

public double getTotalWithTax(){
    return itemCost * quantity * 1.12;
}

public double quantityToCostCalculator(int num){
    return itemCost * num;
}
public boolean compareItemCost(ShoppingCartItem itm){
    if (itemCost * quantity < itm.getTotalCost()){
        return true;
    }
    else{
        return false;
    } 
    
}

}


