/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {

        // First dog: create with name, then set age
        Dog dog1 = new Dog("Buddy");
        dog1.setAge(5);

        // Second dog: create with name and breed
        Dog dog2 = new Dog("Rocky", "Bulldog");

        boolean dog1Sleep = dog1.isSleeping();
        boolean dog2Sleep = dog2.isSleeping();

        // Check dog1
        if(dog1Sleep) {
            System.out.println(dog1.getName() + " is asleep.");
        }
        else {
            dog1.bark();
        }

        // Check dog2
        if(dog2Sleep) {
            System.out.println(dog2.getName() + " is asleep.");

            if(!dog1Sleep) {  // dog1 barked
                dog2.bark();
            }

        } else { // dog2 is awake
            if(!dog1Sleep) { // dog1 barked
                dog2.bark();
            }
        }
    }
}
