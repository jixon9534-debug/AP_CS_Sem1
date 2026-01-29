/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	 public static int pow(int x, int y) {
    	int result = 1;
    	for (int i = 0; i < y; i++) {
		result *= x;
        }
        return result;
    }
	 
	 	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give 2 numbers the first one will be X and the second one will be Y they can be the same or diffrent just not a decmial");
		System.out.println("They will be number you said is X will times itself by the amount you said was Y");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int answer = pow(X, Y);

        System.out.println(X + " raised to the power of " + Y + " is " + answer);



		
	}
}
