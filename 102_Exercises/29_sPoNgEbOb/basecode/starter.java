/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String input = sc.nextLine();

		String output = "";
		int letterCount = 0;

		for (int i = 0; i < input.length(); i++) {
			String letter = input.substring(i, i + 1);

			if (letter.equals(" ")) {
				output += " ";
				letterCount = 0; 
			} else {
				if (letterCount % 2 == 0) {
					output += letter.toLowerCase();
				} else {
					output += letter.toUpperCase();
				}
				letterCount++;
			}
		}

		System.out.println(output);
	}
}

