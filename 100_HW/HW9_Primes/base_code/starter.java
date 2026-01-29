/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {

    public static boolean checkPrime(int num) {
        int i = 2;

        while(i < num) {
            if(num % i == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }

    public static void printPrimes(int max) {
        int n = 2;

        while(n < max) {
            if(checkPrime(n) == true) {
                System.out.println(n);
            }
            n = n + 1;
        }
    }

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int value = sc.nextInt();

		printPrimes(value);
	}
}

