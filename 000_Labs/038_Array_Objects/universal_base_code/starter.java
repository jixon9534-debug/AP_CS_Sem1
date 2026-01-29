/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
    public static void main(String args[]) {
      
        Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];

        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior " + (i + 1));
            wizards[i] = new Wizard("Wizard " + (i + 1));
        }

        int w = 0;
        int z = 0;

        while (w < 100 && z < 100) {
            Wizard wizard = wizards[z];
            Warrior warrior = warriors[w];
            
            wizard.attack(warrior);

            if (warrior.isDead()) {
                w++;
            } else {
                warrior.attack(wizard);

                if (wizard.isDead()) {
 
                    z++;
                }
            }
        }

        if (w == 100) {
            System.out.println("Wizards won!");
            System.out.println("Wizards left: " + (100 - z));
        } else {
            System.out.println("Warriors won!");
            System.out.println("Warriors left: " + (100 - w));
        }
    }
}
