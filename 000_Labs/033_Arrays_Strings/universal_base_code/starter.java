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

        String[] lyrics = new String[10];

        lyrics[0] = "We're no strangers to love";
        lyrics[1] = "You know the rules and so do I";
        lyrics[2] = "A full commitment's what I'm thinking of";
        lyrics[3] = "You wouldn't get this from any other guy";
        lyrics[4] = "I just wanna tell you how I'm feeling";
        lyrics[5] = "Gotta make you understand";
        lyrics[6] = "Never gonna give you up";
        lyrics[7] = "Never gonna let you down";
        lyrics[8] = "Never gonna run around and desert you";
        lyrics[9] = "Never gonna make you cry";

        for(int i = 0; i < lyrics.length; i++) {
            System.out.println(lyrics[i]);
        }
    }
}
