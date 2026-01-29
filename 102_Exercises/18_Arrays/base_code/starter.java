/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int i = 0;
		 while(i<1001){
		 	arr[i] = i * 3 + 3;
		 	System.out.println(arr[i]);
		 	i++;
		 }
		 
		 int [] arr2 = new int[1001];
		 int in = 0;
		 while(in<1001){
		 	arr2[in] = 1000 - in;
		 	System.out.println(arr2[in]);
		 	in++;
		 }
		 
		 
	}
}
