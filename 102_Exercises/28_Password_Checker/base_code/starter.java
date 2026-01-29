import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  
        int stren1 = 0;
        int stren2 = 0;
        int stren3 = 0;

        for(i = 0; i < passwords.length; i++}{
            if(Password.length[i] >= 8 && Password[i].contains("!") || Password[i].contains("@") || Password[i].contains("#") || Password[i].contains("$") || Password[i].contains("%") || Password[i].contains("^") || Password[i].contains("&") || Password[i].contains("*"){
		            stren3
		        }   
		        else if(passwords[i].length() >= 8){
		            stren1++;
		        }
		        else if(passwords[i].contains("!") || Password[i].contains("@") || Password[i].contains("#") || Password[i].contains("$") || Password[i].contains("%") || Password[i].contains("^") || Password[i].contains("&") || Password[i].contains("*"){
		            stren2++;
            }
            
        }
		
	}
}
