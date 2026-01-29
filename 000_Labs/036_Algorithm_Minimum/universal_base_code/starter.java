/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {

        BaseClass test = new BaseClass();

        Random rand = new Random();

        int size = rand.nextInt(150) + 51;  

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            int value = numbers[i];

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }

            sum += value;
        }

        double average = (double)sum / size;

        System.out.println("Number of elements: " + size);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}
